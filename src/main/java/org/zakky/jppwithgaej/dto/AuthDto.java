package org.zakky.jppwithgaej.dto;

import net.vvakame.util.jsonpullparser.annotation.JsonKey;
import net.vvakame.util.jsonpullparser.annotation.JsonModel;

@JsonModel(decamelize = false)
public class AuthDto {

    @JsonKey
    boolean loggedIn;

    @JsonKey
    String loginURL;

    @JsonKey
    String logoutURL;

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public String getLoginURL() {
        return loginURL;
    }

    public void setLoginURL(String loginURL) {
        this.loginURL = loginURL;
    }

    public String getLogoutURL() {
        return logoutURL;
    }

    public void setLogoutURL(String logoutURL) {
        this.logoutURL = logoutURL;
    }

}
