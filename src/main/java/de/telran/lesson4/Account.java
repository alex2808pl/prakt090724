package de.telran.lesson4;

public class Account implements Manager, Kassirerin, Kunde {
    private String num; // номер счета
    private double sum; // сумма
    private String name; // имя клиента
    private String dateCreate; // дата создания

    public Account(String num, double sum, String name, String dateCreate) {
        this.num = num;
        this.sum = sum;
        this.name = name;
        this.dateCreate = dateCreate;
    }

    public String getNum() {
        return num;
    }

    public double getSum() {
        return sum;
    }

    public String getName() {
        return name;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Account{" +
                "num='" + num + '\'' +
                ", sum=" + sum +
                ", name='" + name + '\'' +
                ", dateCreate='" + dateCreate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;
        return Double.compare(sum, account.sum) == 0 && num.equals(account.num) && name.equals(account.name) && dateCreate.equals(account.dateCreate);
    }

}
