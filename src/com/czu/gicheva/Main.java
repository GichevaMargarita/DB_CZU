package com.czu.gicheva;

import com.czu.gicheva.classes.*;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address(
                "Germany",
                "Trier Zewen",
                "Neue Roßstr.",
                87,
                "542 94"
        );
        User user1 = new User(
                "Max Schmitt",
                "rabuhivu@mailsearch.net",
                "+48 651 59 00 69",
                4.98,
                "no",
                "P59333838",
                "1800597117360 97"
        );
        User user2 = new User(
                "Harcourt Riquier",
                "zedriharta@desoz.com",
                "+3303 175794026",
                4.99,
                "no",
                "421555621",
                "1690519098025 58"
        );
        Comment comment1 = new Comment(
                "feedback",
                "02.04.2019",
                "I appreciate the car sharing option, and it's saved me multiple times in both Boulder and Denver. Terrific customer service, the right locations. Good pricing."
        );
        Comment comment2 = new Comment(
                "issue",
                "10.04.2019",
                "A grimy carburetor and a bad accelerator"

        );
        Reservation reservation1 = new Reservation(
                "04.04.2019",
                "Active"
        );
        Reservation reservation2 = new Reservation(
                "05.04.2019",
                "Completed"
        );
        Rental rental1 = new Rental(
                "12:15",
                "17:45",
                "45",
                17,
                56
        );
        Payment payment1 = new Payment(
                45,
                "USD",
                "02.04.2019",
                "5539 6113 6389 9264"
        );
        Payment payment2 = new Payment(
                17,
                "EUR",
                "04.04.2019",
                "5177 8958 9298 5952"
        );

        Car car1 = new Car(
                "Volkswagen Polo",
                "Sedan",
                "A-95",
                5,
                "yes",
                "Available",
                "AI 7634",
                "1HGEJ8248YL099955"
        );
        Car car2 = new Car(
                "Audi A2(8P)",
                "Sedan",
                "A-95",
                5,
                "yes",
                "In Use",
                "AI 7634",
                "1HGEJ8248YL099955"
        );

        /*System.out.println(address1);
        System.out.println(user1);
        System.out.println(comment1);
        System.out.println(reservation1);
        System.out.println(rental1);
        System.out.println(car1);*/

        /*User[] users = {user1, user2};
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }*/

        /*Comment[] comments = {comment1, comment2};
        for (int i = 0; i < comments.length; i++) {
            if(comments[i].getType()=="issue") {
                System.out.println(comments[i]);
            }
        }*/

        /*Car[] cars = {car1, car2};
        for (int i = 0; i < cars.length; i++) {
                System.out.println(cars[i].getModel() + "            " + cars[i].getStatus());
        }*/

        /*Reservation[] reservations = {reservation1, reservation2};
        for (int i = 0; i < reservations.length; i++) {
            if(reservations[i].getStatus()=="Active") {
                System.out.println(reservations[i]);
            }
        }*/

        Payment[] payments = {payment1, payment2};
        for (int i = 0; i < payments.length; i++) {
            System.out.println(payments[i].getAmount() + "            " + payments[i].getCurrency());
        }

    }
}
