package cn.charlie.strong.entity.user;

import java.io.Serializable;
import java.util.List;

/**
 * @author charlie
 * @date 2024/5/1 10:26
 **/
public class AuthUserToken implements Serializable {
    private static final long serialVersionUID = 2527707019208926912L;
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public AuthUserToken(String token) {
        this.token = token;
    }
}
