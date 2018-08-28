package com.keinen.ddd.domain;

import javax.persistence.Entity;

@Entity
public class InternalImage extends Image {
    @Override
    public String getURL() {
        return null;
    }

    @Override
    public boolean hasThumbnail() {
        return false;
    }

    @Override
    public String getThumbnailURL() {
        return null;
    }
}
