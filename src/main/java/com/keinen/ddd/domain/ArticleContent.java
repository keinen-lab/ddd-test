package com.keinen.ddd.domain;

import javax.persistence.Embeddable;

@Embeddable
public class ArticleContent {
    private String content;
    private String contentType;

    protected ArticleContent() {
    }

    public ArticleContent(String content, String contentType) {
        this.content = content;
        this.contentType = contentType;
    }
}
