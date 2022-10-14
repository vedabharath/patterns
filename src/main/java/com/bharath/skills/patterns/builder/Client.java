package com.bharath.skills.patterns.builder;

public class Client {

    public static void main(String[] args) {

        Student s = Student.getBuilder()
                .setAge(20)
                .setBatch("2015")
                .setName("Bharath")
                .setPhoneNumber("7877143338").build();

        System.out.println(s);
    }
}

// Break till 10:23 PM