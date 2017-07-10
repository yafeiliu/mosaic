package com.lyf.config;

import java.util.Map;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * 用于授权的Token对象：
 * <p>
 * 用户身份即用户名；
 * 凭证即客户端传入的消息摘要。
 *
 * @author Angel --守护天使
 * @version v.0.1
 * @date 2017年2月25日
 */
public class StatelessAuthenticationToken implements AuthenticationToken {
    private static final long serialVersionUID = 1L;
    private String username;//用户身份即用户名；
    private Map<String, ?> params;//参数.
    private String clientDigest;//凭证即客户端传入的消息摘要。

    public StatelessAuthenticationToken() {
    }

    public StatelessAuthenticationToken(String username, Map<String, ?> params, String clientDigest) {
        super();
        this.username = username;
        this.params = params;
        this.clientDigest = clientDigest;
    }

    public StatelessAuthenticationToken(String username, String clientDigest) {
        super();
        this.username = username;
        this.clientDigest = clientDigest;
    }

    @Override
    public Object getPrincipal() {
        return username;
    }

    @Override
    public Object getCredentials() {
        return clientDigest;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<String, ?> getParams() {
        return params;
    }

    public void setParams(Map<String, ?> params) {
        this.params = params;
    }

    public String getClientDigest() {
        return clientDigest;
    }

    public void setClientDigest(String clientDigest) {
        this.clientDigest = clientDigest;
    }
}
