package com.librosYa.librosYa.domain.entities;

import java.util.List;

import com.librosYa.librosYa.util.enums.Role;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "user")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT(11)")
    private Long id;

    @Column(name = "user_name", length = 50)
    private String userName;

    @Column(length = 50)
    private String password;

    @Column(length = 100)
    private String email;

    @Column(name = "full_name",length = 100)
    private String fullName;

    @Enumerated(EnumType.STRING)
    private Role role;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Reservation> reservations;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Loan> loans;
}
