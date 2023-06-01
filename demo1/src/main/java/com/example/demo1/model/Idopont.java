package com.example.demo1.model;

public class Idopont {
    private String day;
    private String time;
    private Felhasznalo reserver;

    public void setDay(String day) {
        this.day = day;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setReserver(Felhasznalo reserver) {
        this.reserver = reserver;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public Felhasznalo getReserver() {
        return reserver;
    }
}
