package com.rui.mybatisdemo.vo;

public class Student {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
