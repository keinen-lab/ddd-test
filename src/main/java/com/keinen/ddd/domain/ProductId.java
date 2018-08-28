package com.keinen.ddd.domain;

import javax.persistence.Embeddable;

@Embeddable
public class ProductId {
    private int id;

    public ProductId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
