package com.islandsoftware.storefronthq.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    private String id;
    private String username;
    private String email;
    private String dob;
}
