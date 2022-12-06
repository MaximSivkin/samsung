
package com.samsung.model;

public abstract class User {
    private String name;
    private String surname;
    private String patronymic;
    private String phone;

    public User(String name, String surname, String patronymic, String phone) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.phone = phone;
    }

    public User(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public User(User user) {
        this.name = user.getName();
        this.surname = user.getSurname();
        this.patronymic = user.getPatronymic();
        this.phone = user.getPhone();
    }

    abstract void sayHello();

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPhone() {
        return phone;
    }

    public String getFullName() {
        StringBuilder builder = new StringBuilder()
                .append(getSurname()).append(" ").append(getName()).append(" ").append(getPatronymic());
        return builder.toString();
    }
}