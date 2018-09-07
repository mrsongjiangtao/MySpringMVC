package com.nuc.model;

import java.util.List;

public class StudentClass {
    private String className;
    private Integer classId;
    private List<Student> list;//一对多


    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "className='" + className + '\'' +
                ", classId=" + classId +
                ", list=" + list +
                '}';
    }
}
