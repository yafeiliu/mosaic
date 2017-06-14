package com.wisely.thymeleaf;

/**
 * Created by 刘亚飞 on 2017/6/1.
 */
public class Person {
    private String name;
    private Integer age;

    public Person() {
       super();
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
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
}
