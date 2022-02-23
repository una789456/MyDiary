package com.mydiary.diary.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String password;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date", nullable = false)
    private Date createdDate;

    @Column(name = "deleted_date")
    private Date deletedDate;

    public User setUsers(Long id, String name, String password, Date createdDate, Date deletedDate) {
        this.name = name;
        this.password = password;
        this.createdDate = createdDate;
        this.deletedDate = deletedDate;
        return this;
    }
}
