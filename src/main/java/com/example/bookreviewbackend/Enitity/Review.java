package com.example.bookreviewbackend.Enitity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;
import org.hibernate.annotations.Check;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Book book;

    private byte rating;

    private String comment;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false)
    private LocalDateTime created;

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private LocalDateTime updated;

    @ManyToOne
    private Users Reviewer;
}
