package de.telran.lesson5;

public enum Tagen {

    SUNDAY("Sonntag", false),
    MONDAY("Montag", true),
    TUESDAY("Dienstag", true),
    WEDNESDAY("Mittwoch", true),
    THURSDAY("Donnerstag", true),
    FRIDAY("Freitag", true),
    SATURDAY("Samstag", false);

    private final boolean isWorkingDay;
    private String message;

    Tagen(String message, boolean isWorkingDay) {
        this.message = message;
        this.isWorkingDay = isWorkingDay;
    }

    public String getMessage() {
        return message;
    }

    public boolean isWorkingDay() {
        return isWorkingDay;
    }


    public void whichDayIsBoolean() {
        if (this.isWorkingDay()) {
            System.out.println((this.getMessage() + " is working day!"));
        } else {
            System.out.println(this.getMessage() + " is free day!");
        }
    }

    public void whichDayIsOrdinal() {
        if (this.ordinal() != 0 && this.ordinal() != 6) {
            System.out.println((this.getMessage() + " is working day!"));
        } else {
            System.out.println(this.getMessage() + " is free day!");
        }
    }

    @Override
    public String toString() {

        return super.toString();
    }

    public void whichDayIsSwitch( ){
        switch (this.name()) {
            case "SUNDAY","SATURDAY" -> {
                System.out.println(this.message+" is free day!");

            }
            default -> {
                System.out.println((this.message+" is working day!"));

            }
        }

    }
}

