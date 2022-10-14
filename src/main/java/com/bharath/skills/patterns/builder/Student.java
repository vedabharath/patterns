package com.bharath.skills.patterns.builder;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String batch;
    private long id;
    private int gradYear;
    private String phoneNumber;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                ", universityName='" + universityName + '\'' +
                ", batch='" + batch + '\'' +
                ", id=" + id +
                ", gradYear=" + gradYear +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    private Student() {

    }

    public static Builder getBuilder(){
        return new Builder();
    }

    static class Builder{

        private String name;
        private int age;
        private double psp;
        private String universityName;
        private String batch;
        private long id;
        private int gradYear;
        private String phoneNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build(){
            // validation starts
            if (this.getGradYear() > 2022) {
                throw new IllegalArgumentException("Grad year cannot be greater than 2022");
            }
            // validation completed

            return  new Student(this);
        }
    }

    Student(Builder builder) {
        this.gradYear = builder.getGradYear();
        this.age = builder.getAge();
        this.name = builder.getName();
    }
}
