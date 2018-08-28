package com.keinen.ddd.infra;

import com.keinen.ddd.domain.Money;

import javax.persistence.AttributeConverter;
import javax.persistence.Convert;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class MoneyConverter implements AttributeConverter<Money, Integer> {
    @Override
    public Integer convertToDatabaseColumn(Money money) {
        if (money == null)
            return null;
        else
            return money.getValue();
    }

    @Override
    public Money convertToEntityAttribute(Integer integer) {
        if(integer == null)
            return null;
        else
            return new Money(integer);
    }
}
