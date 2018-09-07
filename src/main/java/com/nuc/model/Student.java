package com.nuc.model;

import java.util.Arrays;
import java.util.Date;

public class Student{
    private String name;
    private Integer age;
    private Date birth;
    private Integer[] fav;
    private StudentClass sc;

    public StudentClass getSc() {
        return sc;
    }

    public void setSc(StudentClass sc) {
        this.sc = sc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Integer[] getFav() {
        return fav;
    }

    public void setFav(Integer[] fav) {
        this.fav = fav;
    }
    public Student (){}
    public Student(String name, Integer age, Date birth, Integer[] fav, StudentClass sc) {
        this.name = name;
        this.age = age;
        this.birth = birth;
        this.fav = fav;
        this.sc = sc;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", fav=" + Arrays.toString(fav) +
                ", sc=" + sc +
                '}';
    }
}
