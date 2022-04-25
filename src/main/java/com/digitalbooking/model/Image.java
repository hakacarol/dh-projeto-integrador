package com.digitalbooking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String title;

    @Column(columnDefinition = "longtext", nullable = false)
    private String original;

    @Column(columnDefinition = "longtext", nullable = false)
    private String thumbnail;
}
