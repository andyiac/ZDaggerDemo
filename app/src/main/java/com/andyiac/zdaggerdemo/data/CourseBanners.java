package com.andyiac.zdaggerdemo.data;

import java.util.List;

/**
 * @author andyiac
 * @date 12/30/15
 * @web www.andyiac.com
 */
public class CourseBanners {

    /**
     * message : 请求正常
     * code : 200
     * data : [{"url":"http://www.baidu.com2","photo":"http://7xl0ey.com1.z0.glb.clouddn.com/1451275334_399.png","update_time":"2015-12-28 12:02:18","create_time":"2015-12-28 12:00:40","uid":2}]
     */

    private String message;
    private int code;
    /**
     * url : http://www.baidu.com2
     * photo : http://7xl0ey.com1.z0.glb.clouddn.com/1451275334_399.png
     * update_time : 2015-12-28 12:02:18
     * create_time : 2015-12-28 12:00:40
     * uid : 2
     */

    private List<DataEntity> data;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public static class DataEntity {
        private String url;
        private String photo;
        private String update_time;
        private String create_time;
        private int uid;

        public void setUrl(String url) {
            this.url = url;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public String getUrl() {
            return url;
        }

        public String getPhoto() {
            return photo;
        }

        public String getUpdate_time() {
            return update_time;
        }

        public String getCreate_time() {
            return create_time;
        }

        public int getUid() {
            return uid;
        }
    }
}
