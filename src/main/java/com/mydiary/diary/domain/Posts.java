package com.mydiary.diary.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.ZonedDateTime;

public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "created_date")
    private ZonedDateTime createdDate;

    @Column(name = "updated_date")
    private ZonedDateTime updatedDate;

    @Column(name = "deleted_date")
    private ZonedDateTime deletedDate;

    @Column(name = "user_id")
    private Long userId;

    public Posts setPosts(ZonedDateTime createdDate, ZonedDateTime updatedDate, ZonedDateTime deletedDate, Long userId) {
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.deletedDate = deletedDate;
        this.userId = userId;
        return this;
    }
}
