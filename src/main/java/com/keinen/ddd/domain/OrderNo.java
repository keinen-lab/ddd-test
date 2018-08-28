package com.keinen.ddd.domain;

import javax.persistence.Embeddable;

@Embeddable
public class OrderNo {
    private int value;

    public OrderNo(int value) {
        this.value = value;
    }
}
