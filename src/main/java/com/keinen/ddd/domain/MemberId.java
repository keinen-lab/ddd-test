package com.keinen.ddd.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MemberId {
    @Column(name="member_id")
    private String id;

    public MemberId(String id) {
        this.id = id;
    }
}
