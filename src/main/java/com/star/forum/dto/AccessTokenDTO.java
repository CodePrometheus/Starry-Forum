package com.star.forum.dto;

import lombok.Data;

/**
 * @author Star
 */
@Data
public class AccessTokenDTO {


    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

}
