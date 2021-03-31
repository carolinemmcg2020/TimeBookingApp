package com.example.timebookingapp;

public class TimeBooker extends User {

    // Fields
    private String timeStart;
    private String timeEnd;
    private String notes;

    // Constructor
    public TimeBooker(String password) {
        super(password);
    }

    public void addNote(String note) {
        notes += note;
    }

    public void editNote() {

    }

    public void removeNote() {

    }

    public void bookTimeSlot() {

    }

}
