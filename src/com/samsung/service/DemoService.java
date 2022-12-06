package com.samsung.service;

import com.samsung.model.Student;
import com.samsung.model.Teacher;

public class DemoService {
    private University university;

    public DemoService() {}

    public DemoService(University university) {
        this.university = university;
    }

    public void demo() {
        System.out.println("Студенты и учителя");
        Student s1 = new Student ("Иван", "Васильев", "Сергеевич", "группа людейскрутыминаушниками");
        s1.sayHello();
        Student s2 = new Student ("Дмитрий", "Костров", "Эдуардович", "=79030658479", "группа тыжпрограммистов");
        s2.sayHello();
        Student s3 = new Student ("Григорий", "Порфиоьев", "Игоревич", "группа дотеров");
        s3.sayHello();
        s3.printInfoToConsoleSuperKpacuBo();
        Teacher t1 = new Teacher ("Дмитрий", "Ильин", "Владимирович", "Информатика");
        t1.sayHello();
        Teacher t2 = new Teacher(t1);
        t2.sayHello();
        Teacher t3 = new Teacher ("Максим", "Сивкин", "Алексеевич", "+78005553535", "Киберспорт");
        t3.printInfoToConsoleSuperKpacuBo();

        System.out.println("Университет");
        Teacher[] t = new Teacher[6];
        t[0] = t1;
        t[1] = new Teacher ("Максим", "Сивкин", "Алексеевич", "+78005553535", "Киберспорт");
        t[2] = new Teacher ("Неиван", "Невасильев", "Несергеевич", "Информатика");
        t[3] = new Teacher ("Ашот", "Костров", "Дмитриевич", "=79030658479","Информатика");
        t[4] = new Teacher ("Борис", "Степанов", "Отчествович", "Физкультура");
        t[5] = new Teacher ("Роман", "Зверев", "Сергеевич", "Бесконечноелетология");
        Student[] s = new Student[4];
        s[0] = s1;
        s[1] = s3;
        s[2] = new Student("Венера", "Курбатова", "Васильевна", "группа садистов");
        s[3] = new Student("Константин", "Сивкин", "Алексеевич", "группа фанатов сбербанка");
        university = new University("Печальная область, Тоскливый район, Город Грусть, роспект Разочарования, Дом 13", s, t);
        university.printInfoToConsoleSuperKpacuBo();
    }
}
