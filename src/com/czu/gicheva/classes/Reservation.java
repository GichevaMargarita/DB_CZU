package com.czu.gicheva.classes;

public class Reservation {
    private String date;
    private String status;

    public Reservation(String date, String status) {
        this.date = date;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "date='" + date + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
