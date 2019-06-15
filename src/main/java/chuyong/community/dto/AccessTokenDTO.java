package chuyong.community.dto;

import lombok.Data;

@Data
public class AccessTokenDTO {
    private String client_id;
    private String Client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
