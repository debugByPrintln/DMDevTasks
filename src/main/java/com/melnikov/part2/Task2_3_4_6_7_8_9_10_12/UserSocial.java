package com.melnikov.part2.Task2_3_4_6_7_8_9_10_12;

public class UserSocial extends User implements Cloneable {
    private String name;
    private int age;

    public UserSocial(int id, String login, String password, String name, int age) {
        super(id, login, password);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void printData() {
        System.out.println(super.getId() + " " + super.getLogin() + " " + super.getPassword() + " " + name + " " + age);
    }

    public UserSocial clone(){
        return new UserSocial(getId(), getLogin(), getPassword(), getName(), getAge());
    }

    @Override
    public String toString() {
        return "UserSocial{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}
