package com.keinen.ddd.Order;

public class Money {
    private int value;

    public Money(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Money add(Money momey) {
        return new Money(this.value + momey.value);
    }

    public Money multiply(int multiplier) {
        return new Money(value * multiplier);
    }
}
