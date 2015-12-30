package com.andyiac.zdaggerdemo.data;

/**
 * @author andyiac
 * @date 12/30/15
 * @web www.andyiac.com
 */
public class CourseDetails {

    /**
     * message : 请求正常
     * code : 200
     * data : {"update_time":"2015-12-29 16:09:25","uid":73,"photo":"http://7xl0ey.com1.z0.glb.clouddn.com/1451372257_676.jpg","create_time":"2015-12-29 14:57:38","video":{"web":"html","app":"12345","time":"1分12秒"},"teacher":{"photo":"http://7xl0ey.com2.z0.glb.qiniucdn.com/4849_1446447071774_img-00818db33dd03d37b0f5376d6011d647.jpg","work":"职位","name":"刘星小号","desc":"测试介绍"},"is_like":false,"title":"测试课堂","content":"<p>正文课堂<\/p>","course_type":{"type":1,"uid":1,"name":"法务"},"release_time":"2015-12-29 15:04:24"}
     */

    private String message;
    private int code;
    /**
     * update_time : 2015-12-29 16:09:25
     * uid : 73
     * photo : http://7xl0ey.com1.z0.glb.clouddn.com/1451372257_676.jpg
     * create_time : 2015-12-29 14:57:38
     * video : {"web":"html","app":"12345","time":"1分12秒"}
     * teacher : {"photo":"http://7xl0ey.com2.z0.glb.qiniucdn.com/4849_1446447071774_img-00818db33dd03d37b0f5376d6011d647.jpg","work":"职位","name":"刘星小号","desc":"测试介绍"}
     * is_like : false
     * title : 测试课堂
     * content : <p>正文课堂</p>
     * course_type : {"type":1,"uid":1,"name":"法务"}
     * release_time : 2015-12-29 15:04:24
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
        private String update_time;
        private int uid;
        private String photo;
        private String create_time;
        /**
         * web : html
         * app : 12345
         * time : 1分12秒
         */

        private VideoEntity video;
        /**
         * photo : http://7xl0ey.com2.z0.glb.qiniucdn.com/4849_1446447071774_img-00818db33dd03d37b0f5376d6011d647.jpg
         * work : 职位
         * name : 刘星小号
         * desc : 测试介绍
         */

        private TeacherEntity teacher;
        private boolean is_like;
        private String title;
        private String content;
        /**
         * type : 1
         * uid : 1
         * name : 法务
         */

        private CourseTypeEntity course_type;
        private String release_time;

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public void setVideo(VideoEntity video) {
            this.video = video;
        }

        public void setTeacher(TeacherEntity teacher) {
            this.teacher = teacher;
        }

        public void setIs_like(boolean is_like) {
            this.is_like = is_like;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setCourse_type(CourseTypeEntity course_type) {
            this.course_type = course_type;
        }

        public void setRelease_time(String release_time) {
            this.release_time = release_time;
        }

        public String getUpdate_time() {
            return update_time;
        }

        public int getUid() {
            return uid;
        }

        public String getPhoto() {
            return photo;
        }

        public String getCreate_time() {
            return create_time;
        }

        public VideoEntity getVideo() {
            return video;
        }

        public TeacherEntity getTeacher() {
            return teacher;
        }

        public boolean isIs_like() {
            return is_like;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public CourseTypeEntity getCourse_type() {
            return course_type;
        }

        public String getRelease_time() {
            return release_time;
        }

        public static class VideoEntity {
            private String web;
            private String app;
            private String time;

            public void setWeb(String web) {
                this.web = web;
            }

            public void setApp(String app) {
                this.app = app;
            }
            public void setTime(String time) {
                this.time = time;
            }

            public String getWeb() {
                return web;
            }

            public String getApp() {
                return app;
            }

            public String getTime() {
                return time;
            }
        }

        public static class TeacherEntity {
            private String photo;
            private String work;
            private String name;
            private String desc;

            public void setPhoto(String photo) {
                this.photo = photo;
            }

            public void setWork(String work) {
                this.work = work;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPhoto() {
                return photo;
            }

            public String getWork() {
                return work;
            }

            public String getName() {
                return name;
            }

            public String getDesc() {
                return desc;
            }
        }

        public static class CourseTypeEntity {
            private int type;
            private int uid;
            private String name;

            public void setType(int type) {
                this.type = type;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getType() {
                return type;
            }

            public int getUid() {
                return uid;
            }

            public String getName() {
                return name;
            }
        }
    }
}
