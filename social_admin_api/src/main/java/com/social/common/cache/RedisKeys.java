package com.social.common.cache;

/**
 * @author 王子凡
 */
public class RedisKeys {

    /**
     * 验证码Key
     */
    public static String getCaptchaKey(String key) {
        return "sys:captcha:" + key;
    }

    /**
     * accessToken Key
     */
    public static String getAccessTokenKey(String accessToken) {
        return "sys:access:" + accessToken;
    }

    public static String getManagerIdKey(Integer id) {
        return "sys:manager:" + id;
    }

}
