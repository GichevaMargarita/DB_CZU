package com.czu.gicheva.classes;

public class Car {
    private String model;
    private String type;
    private String fuel;
    private Integer capacity;
    private String childSeat;
    private String status;
    private String number;
    private String vin;

    public Car(String model, String type, String fuel, Integer capacity, String childSeat, String status, String number, String vin) {
        this.model = model;
        this.type = type;
        this.fuel = fuel;
        this.capacity = capacity;
        this.childSeat = childSeat;
        this.status = status;
        this.number = number;
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", fuel='" + fuel + '\'' +
                ", capacity=" + capacity +
                ", childSeat=" + childSeat +
                ", status='" + status + '\'' +
                ", number='" + number + '\'' +
                ", vin='" + vin + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getChildSeat() {
        return childSeat;
    }

    public void setChildSeat(String childSeat) {
        this.childSeat = childSeat;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}
