package com.example.cinema.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "Director")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DirectorID")
    private Long id;

    @Column(name = "Name", nullable = false)
    private String name;

    // Quan hệ với Movie
    @OneToMany(mappedBy = "director")
    private Set<Movie> movies;

    // Các getter và setter
}
