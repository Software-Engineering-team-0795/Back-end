package com.example.linkit.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Project {
    @Id
    private String id;

    private String tag;
    private String title;
    private String description;

    // 기타 필드들...

    public String getTitle() {
        return title;
    }

}
