package com.one23.official.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection = "Category")
public class Category {
    @Id
    private String categoryid;
    private String categoryname;

    public String getId() {
        return categoryid;
    }
}

