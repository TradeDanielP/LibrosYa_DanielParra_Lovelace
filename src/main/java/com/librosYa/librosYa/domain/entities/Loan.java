package com.librosYa.librosYa.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity(name= "loan")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "loan_date")
    private LocalDate loanDate;

    @Column(name= "return_date")
    private LocalDate returnDate;

    @Column(length = 20)
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bookId", referencedColumnName = "id")
    private Book book;

}