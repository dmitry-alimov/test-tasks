package com.gd.internship.alimov;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class Money {

    private final BigDecimal amount;
    private final Currency currency;

    public Money(BigDecimal amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money put(BigDecimal plus) {
        return new Money(amount.add(plus).setScale(2, RoundingMode.HALF_UP), currency);
    }

    public Money take(BigDecimal taken) {
        return new Money(amount.subtract(taken).setScale(2, RoundingMode.HALF_UP), currency);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    public enum Currency {USD, RUB, EUR, JPY, GBP}
}
