package de.telran.lesson2;

public class PegasUniCorn extends Pegas {
    Unicorn unicorn;

    public PegasUniCorn(String name, String color, int weight, int wingsCount, int cornsCount) {
        super(name, color, weight, wingsCount);
        this.unicorn = new Unicorn(name, color, weight, cornsCount); //аггрегирование
        // https://javarush.com/groups/posts/1967-otnoshenija-mezhdu-klassami-nasledovanie-kompozicija-i-agregirovanie-
    }


    public void fight() {
        System.out.println("Unicorn fight with " + unicorn.cornsCount + " corns!!!");
    }
}
