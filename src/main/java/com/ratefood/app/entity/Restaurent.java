package com.ratefood.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "restaurent")
public class Restaurent {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="location")
    private String location;

    @Column(name="upvote")
    private int upvote;

    @Column(name="downvote")
    private int downvote;

    @Column(name="rating")
    private float rating;

    @Column(name="city")
    private String city;

}
