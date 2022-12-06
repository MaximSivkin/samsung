package com.samsung.service;

import com.samsung.interfaces.Printer;
import com.samsung.model.Student;
import com.samsung.model.Teacher;

public class University implements Printer {
    private String adress;
    private Student[] students;
    private Teacher[] teachers;

    public University(String adress, Student[] students, Teacher[] teachers) {
        this.adress = adress;
        this.students = students.clone();
        this.teachers = teachers.clone();
    }

    public University(University university) {
        this.adress = university.getAdress();
        this.students = university.getStudents().clone();
        this.teachers = university.getTeachers().clone();
    }

    public String getAdress() {
        return adress;
    }

    public Student[] getStudents() {
        return students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    private String getTeachersList() {
        StringBuilder builder = new StringBuilder();
        for (Teacher teacher : teachers) {
            builder.append("*").append(teacher.getFullName()).append("\n");
        }
        return builder.toString();
    }

    private String getStudentsList() {
        StringBuilder builder = new StringBuilder();
        for (Student student : students) {
            builder.append("*").append(student.getFullName()).append("\n");
        }
        return builder.toString();
    }

    @Override
    public void printInfoToConsoleSuperKpacuBo() {
        StringBuilder builder = new StringBuilder()
                .append("Университет\nАдрес: ").append(getAdress())
                .append("\nПреподавательский состав:\n").append(getTeachersList())
                .append("Учащиеся:\n").append(getStudentsList());
        System.out.println(builder.toString());
    }
}