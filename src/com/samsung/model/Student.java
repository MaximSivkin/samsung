package com.samsung.model;

import com.samsung.interfaces.Printer;

public class Student extends User implements Printer {
    private String group;

    public Student(String name, String surname, String patronymic, String phone, String group) {
        super(name, surname, patronymic, phone);
        this.group = group;
    }

    public Student(String name, String surname, String patronymic, String group) {
        super(name, surname, patronymic);
        this.group = group;
    }

    public Student(Student student) {
        super(student);
        this.group = student.getGroup();
    }

    public String getGroup() {
        return group;
    }

    public void sayHello() {
        StringBuilder builder = new StringBuilder()
                .append("Привет! Я студент, моё имя ").append(super.getFullName()).append("!");
        System.out.println(builder.toString());
    }

    @Override
    public String getFullName() {
        StringBuilder builder = new StringBuilder()
                .append(super.getFullName()).append(" (").append(getGroup()).append(")");
        return builder.toString();
    }

    @Override
    public void printInfoToConsoleSuperKpacuBo() {
        StringBuilder builder = new StringBuilder()
                .append("Студент\nФамилия: ").append(getSurname())
                .append("\nИмя: ").append(getName())
                .append("\nОтчество: ").append(getPatronymic())
                .append("\nКонтактный телефон: ").append(getPhone())
                .append("\nГруппа: ").append(getGroup());
        System.out.println(builder.toString());
    }
}