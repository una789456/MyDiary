package com.mydiary.diary.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.ZonedDateTime;

public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String password;

    @Column(name = "created_date", nullable = false)
    private ZonedDateTime createdDate;

    @Column(name = "deleted_date")
    private ZonedDateTime deletedDate;

    public Users setUsers(Long id, String name, String password, ZonedDateTime createdDate, ZonedDateTime deletedDate) {
        this.name = name;
        this.password = password;
        this.createdDate = createdDate;
        this.deletedDate = deletedDate;
        return this;
    }
}
