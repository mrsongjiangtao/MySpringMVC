package com.nuc.model;

import java.util.List;

public class StudentList {
    private List<Student> list;

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "StudentList{" +
                "list=" + list +
                '}';
    }
}
