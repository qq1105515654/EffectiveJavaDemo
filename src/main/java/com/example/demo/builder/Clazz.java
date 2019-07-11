package com.example.demo.builder;

public class Clazz {

    private final int id;

    private final String clzName;

    private final String teacher;

    private Clazz(Builder builder){
        this.id=builder.id;
        this.clzName=builder.clzName;
        this.teacher=builder.teacher;
    }

    public int getId() {
        return id;
    }

    public String getClzName() {
        return clzName;
    }

    public String getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "id=" + id +
                ", clzName='" + clzName + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }

    public static class Builder{

        private int id;

        private String clzName;

        private String teacher;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setClzName(String clzName) {
            this.clzName = clzName;
            return this;
        }

        public Builder setTeacher(String teacher) {
            this.teacher = teacher;
            return this;
        }

        public Clazz builder(){
            return new Clazz(this);
        }
    }
}
