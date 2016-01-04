package com.andyiac.zdaggerdemo.data;

/**
 * @author andyiac
 * @date 1/4/16
 * @web www.andyiac.com
 */
public class CommonResponse {


    /**
     * message : 请求正常
     * code : 200
     * data : {}
     */

    private String message;
    private int code;
    private DataEntity data;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    public DataEntity getData() {
        return data;
    }

    public static class DataEntity {
    }
}
