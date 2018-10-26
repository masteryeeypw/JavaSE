package com.java8.使用流;

/**
 * @Author MASTERYEE
 * @Date 2018/10/20 22:09
 **/
public class Transaction {

    private final Trader trader;
    private final int year;
    private final int value;

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }

    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }
}
