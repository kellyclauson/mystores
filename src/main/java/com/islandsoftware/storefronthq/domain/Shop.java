package com.islandsoftware.storefronthq.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "shops")
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Shop {
    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name = "userId")
//    private String userId;
    private User user;
    //Login details?
    private String shopName;
    private String shopEmail;
    //password?
    private String shopPassword;
}
