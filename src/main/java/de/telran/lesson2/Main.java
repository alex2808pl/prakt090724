package de.telran.lesson2;

public class Main {
    public static void main(String[] args) {
        Horse h = new Horse("Bobby", "black", 10);

        h.run();
        h.transport();
        h.transport(true, 100);
        System.out.println();

        Pegas p = new Pegas("Maria", "white", 12, 2);


        p.run();
        p.transport();
        p.transport(true, 100);

        p.fly();
        System.out.println();

        Unicorn u = new Unicorn("Max", "Grey", 14, 2);
        u.run();
        u.transport();
        u.fight();
        System.out.println();

        UniPegas uniPegas = new UniPegas("Tom", "Red", 16, 2, 4);
        uniPegas.run();
        uniPegas.fly();
        uniPegas.fight();
        uniPegas.transport();


        Horse h1 = new Pegas("Bucefal", "red", 80, 6);
        h1.transport();
        h1.transport(120);
        System.out.println();

        PegasUniCorn pegasUniCorn = new PegasUniCorn("Tom", "Red", 16, 4, 1);
        pegasUniCorn.fly();
        pegasUniCorn.run();
        pegasUniCorn.unicorn.fight();
        pegasUniCorn.fight();

    }
}
