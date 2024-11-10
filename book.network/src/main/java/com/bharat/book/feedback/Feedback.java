package com.bharat.book.feedback;

import com.bharat.book.base.BaseModel;
import com.bharat.book.book.Book;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Feedback extends BaseModel {

    @Column
    private Double rating;
    private String comment;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
