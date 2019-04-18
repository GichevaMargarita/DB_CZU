package com.czu.gicheva.classes;

public class Comment {
    private String type;
    private String date;
    private String text;

    public Comment(String type, String date, String text) {
        this.type = type;
        this.date = date;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "type='" + type + '\'' +
                ", date='" + date + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
