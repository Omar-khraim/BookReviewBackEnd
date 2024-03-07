package com.example.bookreviewbackend.Enitity;

import com.example.bookreviewbackend.Util.Enums.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate publication_year;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    @OneToMany(mappedBy = "book")
    private List<Review> reviews;

    @ManyToMany(mappedBy = "wishList")
    private List<Users> wishUser;

    @ManyToMany(mappedBy = "readingList")
    private List<Users> reader;
}
