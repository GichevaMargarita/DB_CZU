package com.czu.gicheva.classes;

public class Rental {
    private String startTime;
    private String endTime;
    private String price;
    private Integer distance;
    private Integer waitingTime;

    public Rental(String startTime, String endTime, String price, Integer distance, Integer waitingTime) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
        this.distance = distance;
        this.waitingTime = waitingTime;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", price='" + price + '\'' +
                ", distance=" + distance +
                ", waitingTime=" + waitingTime +
                '}';
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(Integer waitingTime) {
        this.waitingTime = waitingTime;
    }
}
