package com.czu.gicheva.classes;

public class User {
    private String name;
    private String email;
    private String phone;
    private Double rating;
    private String badExperience;
    private String licenceNumber;
    private String insurance;

    public User(String name, String email, String phone, Double rating, String badExperience, String licenceNumber, String insurance) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.rating = rating;
        this.badExperience = badExperience;
        this.licenceNumber = licenceNumber;
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", rating=" + rating +
                ", badExperience=" + badExperience +
                ", licenceNumber='" + licenceNumber + '\'' +
                ", insurance='" + insurance + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getBadExperience() {
        return badExperience;
    }

    public void setBadExperience(String badExperience) {
        this.badExperience = badExperience;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }
}
