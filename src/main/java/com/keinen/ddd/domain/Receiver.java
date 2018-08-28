package com.keinen.ddd.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Receiver {
    @Column(name = "receiver_name")
    private String name;
    @Column(name = "receiver_phone")
    private String phoneNumber;

    protected Receiver() {} // JPA를 적용하기 위해 기본 생성자 추가.

    public Receiver(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean equals(Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if( !(other instanceof  Receiver)) return false;

        Receiver that = (Receiver)other;
        return this.name.equals(that.name) && this.phoneNumber.equals(that.phoneNumber);
    }
}
