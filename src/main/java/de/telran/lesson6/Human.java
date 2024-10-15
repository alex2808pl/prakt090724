package de.telran.lesson6;

import java.util.Objects;

public class Human {
    private String name;
    private int age;
    private String yesCollor;

    public Human(String name, int age, String yesCollor) {
        this.name = name;
        this.age = age;
        this.yesCollor = yesCollor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getYesCollor() {
        return yesCollor;
    }

    public void setYesCollor(String yesCollor) {
        this.yesCollor = yesCollor;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", yesCollor='" + yesCollor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(yesCollor, human.yesCollor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, yesCollor);
    }
}
