package com.gaospot;


/**
 * Created by gao on 2018/9/28.
 */


public class Returning {
    public String getSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    private String success;

    public void setSuccess(String success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public Returning(String success, String message) {
        this.success = success;
        this.message = message;
    }

    public Returning() {

    }



}
