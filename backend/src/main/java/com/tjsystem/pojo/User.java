package com.tjsystem.pojo;

public class User {

    private int id;
    private String userAccount;
    private String userPassword;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userAccount;
    }

    public void setUserName(String userName) {
        this.userAccount = userName;
    }

    public String getPassword() {
        return userPassword;
    }

    public void setPassword(String password) {
        this.userPassword = password;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userAccount + '\'' +
                ", password='" + userPassword + '\'' +
                '}';
    }
}
