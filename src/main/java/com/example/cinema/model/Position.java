package com.example.cinema.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "Position")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PositionID")
    private Long id;

    @Column(name = "Name", nullable = false)
    private String name;

    // Quan hệ nhiều-nhiều với bảng Role
    @OneToMany(mappedBy = "position")
    private Set<User> users;

    @ManyToMany(mappedBy = "positions")
    private Set<Role> roles;
    // Các getter và setter
}
