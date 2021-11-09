package com.islandsoftware.storefronthq.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.ArrayList;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    private String id;
    private String username;
    private String email;
    private String dob;
    //list of shop models, or just shop ids?
    private ArrayList<Shop> shops;

    public void addShop(String shopEmail, String shopPassword){
        Shop newShop = new Shop();
        //I forgot how to auto increment ids...
        newShop.setUserId(this.id);
        newShop.setShopEmail(shopEmail);
        newShop.setShopPassword(shopPassword);

        this.shops.add(newShop);
    }





}
