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
    public User (String password) {
        this.password = password;
    }

    // Returns name
    public String getName() {
        return name;
    }

    // Returns email
    public String getEmail() {
        return email;
    }

    // Returns username
    public String getUsername() {
        return username;
    }

    // Returns userType
    public String getUserType() {
        return userType;
    }

    /* @param newName the name to replace with
    * Sets name variable
    */
    public void setName(String newName) {
        String name = newName;
    }

    /* @param newEmail the email to replace with
     * Sets email variable
     */
    public void setEmail(String newEmail) {
        String email = newEmail;
    }

    /* @param newUsername the username to replace with
     * Sets username variable
     */
    public void setUsername(String newUsername) {
        String username = newUsername;
    }

    /* @param newUserType the user type to replace with
     * Sets userType variable
     */
    public void setUserType(String newUserType) {
        String userType = newUserType;
    }

    /* @param newPassword the password to replace with
     * Sets password variable
     */
    public void resetPassword(String newPassword) {
        String password = newPassword;
    }

}
