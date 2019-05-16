package com.example.demo.builder;

public class Person {

    private final String name;

    private final int age;

    private final int height;

    private final int weight;

    private Person(Builder builder){
        this.name=builder.name;
        this.age=builder.age;
        this.height=builder.height;
        this.weight=builder.weight;
    }

    public static class Builder{

        private String name;

        private int age;

        private int height;

        private int weight;

        public Builder name(String val){name=val; return this; }

        public Builder age(int val){age=val; return this;}

        public Builder height(int val){height=val; return this;}

        public Builder weight(int val){weight=val; return this;}
        public Person buidler(){
            return new Person(this);
        }
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
