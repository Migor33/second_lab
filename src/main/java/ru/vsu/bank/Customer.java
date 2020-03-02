package ru.vsu.bank;

import ru.vsu.bank.enums.Purpose;

public class Customer {
    private Purpose purpose;
    private double money;
    private double time;

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
