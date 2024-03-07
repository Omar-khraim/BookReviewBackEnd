package com.example.bookreviewbackend.DTO;

import com.example.bookreviewbackend.Enitity.Book;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewReturnDTO {
    private long id;
    private byte rating;
    private String comment;
    private LocalDateTime created;
    private LocalDateTime updated;

}
