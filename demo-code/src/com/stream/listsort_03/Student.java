package com.stream.listsort_03;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stream.listsort_03
 * @date 2021/5/19 17:25
 * @description
 */
public class Student {
    private String name;
    private String gender;
    private int age;

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
