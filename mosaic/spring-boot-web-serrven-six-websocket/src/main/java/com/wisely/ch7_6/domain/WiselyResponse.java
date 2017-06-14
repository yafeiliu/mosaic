package com.wisely.ch7_6.domain;

/**
 * Created by 刘亚飞 on 2017/6/2.
 */
public class WiselyResponse {
    private String responseMessage;

    public WiselyResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage(){
        return responseMessage;
    }
}
