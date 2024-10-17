package de.telran.lesson7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> listTier = new ArrayList<>(1_000_000);

        for (int i = 1; i <= 1_000_000; i++) {
            listTier.add(i);
        }

        int year = 10;
        int death = 8, born = 14, total = 1000;
        int numEnd = listTier.get(listTier.size() - 1);
        for (int i = 1; i <= year; i++) {
            System.out.println(listTier.size());


            ListIterator<Integer> iterator = listTier.listIterator();
            int countDead = 0, countBorn = 1;
            System.out.println("Each year: " + numEnd);

            while (iterator.hasNext()) {
                iterator.next();
                countDead++;
                countBorn++;
                if (countDead == total / death) {
                    iterator.remove();
                    countDead = 0;
                }
                if (countBorn == total / born) {
                    iterator.add(++numEnd);
                    countBorn = 0;
                }
            }
        }
        System.out.println(listTier.size());
        listTier.sort(Integer::compareTo);
        System.out.println(numEnd);
        System.out.println(listTier.get(listTier.size() - 1));

    }
}
//В стране Лимпопо количество всех зверей равно 1 миллионов.
//Рождаемость составляет 20 (14) зверей на 1000, смертность - 8 зверей.
//        Рассчитайте, сколько зверей будет через 10 лет, принимая во внимание,
//что показатели рождаемости и смертности постоянны. (1126691)

//Перебрать список из 10 миллионов элементов разными способами и замерить время выполнения.
