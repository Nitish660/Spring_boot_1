package com.UserManagementPortal.User.Management.Portal.dto;

import com.UserManagementPortal.User.Management.Portal.entity.OurUsers;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReqRes {

    private int statusCode;
    private String message;
    private String error;
    private String token;
    private String refreshToken;
    private String expirationToken;
    private Integer id;
    private String name;
    private String password;
    private String email;
    private String city;
    private String role;
    private OurUsers ourUsers;
    private List<OurUsers> ourUsersList;

}
