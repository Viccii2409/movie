package com.example.cinema.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Cast")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CastID")
    private Long id;

    @Column(name = "Name", nullable = false)
    private String name;

    // Quan hệ với bảng Movie_Cast
    @ManyToMany(mappedBy = "casts")
    private List<Movie> movies;

    // Các getter và setter
}
