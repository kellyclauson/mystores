package com.islandsoftware.storefronthq.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String dob;
    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Shop> shops = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Inventory> inventories = new ArrayList<>();




}
