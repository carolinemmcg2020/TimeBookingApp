package com.example.timebookingapp;

public class User {

    // Fields
    private String name;
    private String email;
    private String username;
    private int userNumber;
    private String userType;
    private String password;

    // Constructor


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getUserType() {
        return userType;
    }

    public void setName(String newName) {
        String name = newName;
    }

    public void setEmail(String newEmail) {
        String email = newEmail;
    }

    public void setUsername(String newUsername) {
        String username = newUsername;
    }

    public void setUserType(String newUserType) {
        String userType = newUserType;
    }

    public void resetPassword(String newPassword) {
        String password = newPassword;
    }

}
