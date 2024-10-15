package de.telran.lesson6;
//оздать ArrayList с объектами вашего собственного класса (например Human) и вывести их на экран.
//Создать ArrayList с объектами вашего собственного класса и вывести только те, которые удовлетворяют определенному условию.
//(например цвет глаз = голубой)
//Создать ArrayList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.
//(например возраст человека < 16 лет)
//*Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayHuman {
    public static void main(String[] args) {
        Human h1 = new Human("Deyan",99,"green");
        Human h2 = new Human("Eugeni",89,"braun");
        Human h3 = new Human("Oksana",79,"blue");
        Human h4 = new Human("Oksana",79,"blue");
        Human h5 = new Human("Deyan",89,"blue");

        ArrayList<Human> arr =new ArrayList<>();
        arr.add(h1);
        arr.add(h2);
        arr.add(h3);
        arr.add(h4);
        arr.add(h5);
        System.out.println( "ärr = "+arr);
      List<Human> arr1 =  List.of(h1,h2,h3,h4,h5);
        System.out.println( "ärr1 = "+arr1);
        ArrayList<Human> arr2 = new ArrayList<>(arr1);
        arr2.add(h1);
        System.out.println( "ärr2 = "+arr2);
        List<Human> arr4 =new ArrayList<Human>( Arrays.asList(h1,h2,h3,h4,h5));
        System.out.println( "ärr4 = "+arr4);
        for (Human h: arr1){
            if((h.getYesCollor() == "blue") && (h.getAge() < 90)){
                System.out.println("Human have name: "+h.getName()+" Has yes color: "+h.getYesCollor());
            }
        }
//        for (Human h: arr){
//            if(h.getAge() > 80){
//                arr.remove(h);
//            }
//        }
        System.out.println("arr2 ="+arr2);
        for (int i = 0; i < arr2.size() ; i++) {
            if(arr2.get(i).getAge() > 80){
                arr2.remove(arr2.get(i));
                i--;
            }
        }
        System.out.println("arr2 ="+arr2);
       Iterator<Human> it =  arr.iterator();
       while (it.hasNext()){
           Human h = it.next();
           if(h.getAge() > 80){
               it.remove();
           }
       }
        System.out.println(arr);
    }
}
