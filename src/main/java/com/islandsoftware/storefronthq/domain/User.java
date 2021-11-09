package com.islandsoftware.storefronthq.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.ArrayList;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    private String userId;
    private String dob;
    private ArrayList<Shop> shops = new ArrayList<>();





}
