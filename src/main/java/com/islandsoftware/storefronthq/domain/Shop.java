package com.islandsoftware.storefronthq.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Shop {
    private String id;
    private String userId;
    //Login details?
    private String shopEmail;
    //password?
    private String shopPassword;
}
