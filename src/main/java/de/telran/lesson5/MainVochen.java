package de.telran.lesson5;

public class MainVochen {
    public static void main(String[] args) {
        Tagen t = Tagen.THURSDAY;
        Tagen t1 = Tagen.SATURDAY;
        printDay(t);
        t.whichDayIsBoolean();
        t1.whichDayIsBoolean();
        t.whichDayIsOrdinal();
        t1.whichDayIsOrdinal();
        t.whichDayIsSwitch();
        t1.whichDayIsSwitch();
    }
    public static void printDay(Tagen t){
        if(t.isWorkingDay()){
            System.out.println((t.getMessage()+" is working day!"));
        }else {
            System.out.println(t.getMessage()+" is free day!");
        }
    }
}
