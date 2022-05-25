package com.islandsoftware.storefronthq.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "products")
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product {
    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name = "inventory_id")
    @JsonBackReference
    private Inventory inventory;

    private String name;
    private String sku;
    private String category;
    private String title;
    private String url;
    private BigDecimal basePrice;
    private double weight;
    private String manufacturer;
    private String type;
    private String description;
    private String metaDescription;

    @OneToMany(mappedBy = "product")
    @JsonManagedReference
    private List<Image> images = new ArrayList<>();
}
