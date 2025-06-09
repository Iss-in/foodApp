package com.ratefood.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "dish")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="cuisine")
    private String cuisine;

    @Column(name="place") // use it as secondary key
    private String place;

    @Column(name="upvote")
    private int upvote;

    @Column(name="downvote")
    private int downvote;

    @Column(name="rating")
    private float rating;

    @ManyToOne
    @JoinColumn(name = "restaurent_id", nullable = false)
    private Restaurent restaurent;

}
