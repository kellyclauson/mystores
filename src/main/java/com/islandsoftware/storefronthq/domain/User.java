package com.islandsoftware.storefronthq.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "users")
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String userId;
    private String dob;
//    private ArrayList<Shop> shops = new ArrayList<>();




}
