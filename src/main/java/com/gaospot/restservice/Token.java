package com.gaospot.restservice;

import java.util.Map;

/**
 * Created by gao on 2018/9/29.
 */
public class Token {
    private String accessSession;

    public String getAccessSession() {
        return accessSession;
    }

    public void setAccessSession(String accessSession) {
        this.accessSession = accessSession;
    }

    public String getRoaRand() {
        return roaRand;
    }

    public void setRoaRand(String roaRand) {
        this.roaRand = roaRand;
    }

    public int getExpires() {
        return expires;
    }

    public void setExpires(int expires) {
        this.expires = expires;
    }

    public Map getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(Map additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Token() {
    }

    private String roaRand;
    private int expires;
    private Map additionalInfo;


}
