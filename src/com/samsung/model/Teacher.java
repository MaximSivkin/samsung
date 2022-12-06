package com.samsung.model;

import com.samsung.interfaces.Printer;

public class Teacher extends User implements Printer {
    private String subject;

    public Teacher(String name, String surname, String patronymic, String phone, String subject) {
        super(name, surname, patronymic, phone);
        this.subject = subject;
    }

    public Teacher(String name, String surname, String patronymic, String subject) {
        super(name, surname, patronymic);
        this.subject = subject;
    }

    public Teacher(Teacher user) {
        super(user);
        this.subject = user.getSubject();
    }

    public String getSubject() {
        return subject;
    }

    public void sayHello() {
        StringBuilder builder = new StringBuilder()
                .append("Здравствуйте! Я преподаватель, моё имя ").append(super.getFullName()).append("! ")
                .append("Я преподаю предмет \"").append(getSubject()).append("\"!");
        System.out.println(builder.toString());
    }

    @Override
    public String getFullName() {
        StringBuilder builder = new StringBuilder()
                .append(super.getFullName()).append(" (").append(getSubject()).append(")");
        return builder.toString();
    }

    @Override
    public void printInfoToConsoleSuperKpacuBo() {
        StringBuilder builder = new StringBuilder()
                .append("Преподаватель\nФамилия: ").append(getSurname())
                .append("\nИмя: ").append(getName())
                .append("\nОтчество: ").append(getPatronymic())
                .append("\nКонтактный телефон: ").append(getPhone())
                .append("\nПредмет: ").append(getSubject());
        System.out.println(builder.toString());
    }
}