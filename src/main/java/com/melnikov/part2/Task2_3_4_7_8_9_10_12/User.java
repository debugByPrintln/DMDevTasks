package com.melnikov.part2.Task2_3_4_7_8_9_10_12;

public abstract class User implements PrintData{
    private int id;
    private String login;
    private String password;

    public User(int id, String login, String password){
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public abstract void printData();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(){
        this.id = 0;
    }

    public void setLogin(){
        this.login = "guest";
    }

    public void  setPassword(){
        this.password = "";
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
