package com.keinen.ddd.domain;

import javax.persistence.*;

@Entity
@Table(name = "article")
@SecondaryTable(
        name = "article_content",
        pkJoinColumns = @PrimaryKeyJoinColumn(name = "id")
)
public class Article {
    @Id
    private  Long id;
    private String title;

    @AttributeOverrides({
            @AttributeOverride(name = "content", column = @Column(table="article_content")),
            @AttributeOverride(name = "contentType", column = @Column(table="article_content"))
    })
    private ArticleContent ocntent;
}
