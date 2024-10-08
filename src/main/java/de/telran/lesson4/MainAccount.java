package de.telran.lesson4;

import java.util.Objects;

public class MainAccount {
    public static void main(String[] args) {
        Account accountOne = new Account("05124", 20.5, "Bobby", "08-10-24");
        Account accountTwo = new Account("05134", 27.5, "Max", "08-10-24");
        Kassirerin accountThree = new Account("15134", 37.5, "Olga", "08-10-24");

        System.out.println(accountOne);
        System.out.println(accountTwo);
        System.out.println(accountThree);
        System.out.println();

        Manager manager;
        Kassirerin kassirerin;
        Kunde kunde;

        manager = accountOne;
        kunde = accountTwo;
        kassirerin = accountThree;

        System.out.println(manager.getName());

        kassirerin.setSum(50.0);
        System.out.println(accountTwo);
        System.out.println();

        System.out.println(kunde);
        System.out.println(kunde.getDateCreate());

        System.out.println(kunde instanceof Object);
        System.out.println(kunde.getClass());
        System.out.println();

        Kunde kundeOne;
        kundeOne = accountOne;
        System.out.println(kundeOne instanceof Object);
        System.out.println();

    }
}
