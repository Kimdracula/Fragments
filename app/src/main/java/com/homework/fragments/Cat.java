package com.homework.fragments;

public class Cat {
   private String header;
    private String description;

    public Cat(String header, String description) {
        this.header = header;
        this.description = description;
    }

    public Cat() {
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
