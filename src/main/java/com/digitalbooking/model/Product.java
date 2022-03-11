package com.digitalbooking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.stream.FactoryConfigurationError;
import java.util.List;

@Entity
@Getter @Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 300, nullable = false)
    private String description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private List<Image> images;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "characteristic_product")
    private List<Characteristic> characteristics;
}
