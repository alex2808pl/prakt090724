package de.telran.lesson2;

public class Pegas extends Horse {
    protected int wingsCount;

    public Pegas(String name, String color, int weight, int wingsCount) {
        super(name, color, weight);
        this.wingsCount = wingsCount;
    }

    @Override
    public void transport() {
        //super.transport();
        System.out.println(this.name+" pegasus  flied with "+ wingsCount + " wings."+this.getWeight()+" weight");
    }

    public void fly() {
        System.out.println(super.name + " pegasus " + ", with color " + color + " fly with " + wingsCount + " wings.");
    }
}
