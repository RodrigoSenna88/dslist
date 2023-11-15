package com.rodrigojava.dslist.dto;

import com.rodrigojava.dslist.entities.Game;
import jakarta.persistence.Column;

public class GameMinDTO {
    private Long id;
    private String title;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.score = entity.getScore();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Double getScore() {
        return score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
