package com.andyiac.zdaggerdemo.data;

/**
 * @author andyiac
 * @date 12/30/15
 * @web www.andyiac.com
 */
public class CourseLikeCount {

    /**
     * message : 请求正常
     * code : 200
     * data : {"read":17,"comment":3,"like":0}
     */

    private String message;
    private int code;
    /**
     * read : 17
     * comment : 3
     * like : 0
     */

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
        private int read;
        private int comment;
        private int like;

        public void setRead(int read) {
            this.read = read;
        }

        public void setComment(int comment) {
            this.comment = comment;
        }

        public void setLike(int like) {
            this.like = like;
        }

        public int getRead() {
            return read;
        }

        public int getComment() {
            return comment;
        }

        public int getLike() {
            return like;
        }
    }
}
