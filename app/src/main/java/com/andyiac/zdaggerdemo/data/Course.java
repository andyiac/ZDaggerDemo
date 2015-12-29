package com.andyiac.zdaggerdemo.data;

import java.util.List;

/**
 * @author andyiac
 * @date 12/29/15
 * @web www.andyiac.com
 * <p>
 * http://192.168.10.154/api/course_index/
 */
public class Course {


    /**
     * message : 请求正常
     * code : 200
     * data : {"top":{"course":[{"release_time":"2015-12-28 17:39:07","update_time":"2015-12-28 18:00:46","create_time":"2015-12-28 17:39:07","video":{"web":"321","app":"321"},"uid":45,"title":"123321","photo":"","course_type":{"type":1,"uid":3,"name":"公共"},"teacher":{"photo":"","work":"321","name":"321","desc":"321"},"is_like":false},{"release_time":"2015-12-28 17:39:07","update_time":"2015-12-28 17:39:07","create_time":"2015-12-28 17:39:07","video":{"web":"321","app":"321"},"uid":46,"title":"123321","photo":"","course_type":{"type":1,"uid":3,"name":"公共"},"teacher":{"photo":"","work":"321","name":"321","desc":"321"},"is_like":false}],"type":[]},"pro":{"course":[{"release_time":"2015-12-28 17:39:07","update_time":"2015-12-28 17:39:07","create_time":"2015-12-28 17:39:07","video":{"web":"321","app":"321"},"uid":64,"title":"123321","photo":"","course_type":{"type":2,"uid":2,"name":"财税"},"teacher":{"photo":"","work":"321","name":"321","desc":"321"},"is_like":false},{"release_time":"2015-12-28 17:39:07","update_time":"2015-12-28 17:39:07","create_time":"2015-12-28 17:39:07","video":{"web":"321","app":"321"},"uid":67,"title":"123321","photo":"","course_type":{"type":2,"uid":2,"name":"财税"},"teacher":{"photo":"","work":"321","name":"321","desc":"321"},"is_like":false},{"release_time":"2015-12-28 17:39:07","update_time":"2015-12-28 17:39:07","create_time":"2015-12-28 17:39:07","video":{"web":"321","app":"321"},"uid":68,"title":"123321","photo":"","course_type":{"type":2,"uid":2,"name":"财税"},"teacher":{"photo":"","work":"321","name":"321","desc":"321"},"is_like":false},{"release_time":"2015-12-28 17:39:07","update_time":"2015-12-28 17:39:07","create_time":"2015-12-28 17:39:07","video":{"web":"321","app":"321"},"uid":70,"title":"123321","photo":"","course_type":{"type":2,"uid":2,"name":"财税"},"teacher":{"photo":"","work":"321","name":"321","desc":"321"},"is_like":false}],"type":[{"type":2,"uid":2,"name":"财税"},{"type":2,"uid":4,"name":"人力"},{"type":2,"uid":7,"name":"财税2"}]},"basic":{"course":[{"release_time":"2015-12-28 17:39:07","update_time":"2015-12-28 18:00:46","create_time":"2015-12-28 17:39:07","video":{"web":"321","app":"321"},"uid":45,"title":"123321","photo":"","course_type":{"type":1,"uid":3,"name":"公共"},"teacher":{"photo":"","work":"321","name":"321","desc":"321"},"is_like":false},{"release_time":"2015-12-28 17:39:07","update_time":"2015-12-28 17:39:07","create_time":"2015-12-28 17:39:07","video":{"web":"321","app":"321"},"uid":46,"title":"123321","photo":"","course_type":{"type":1,"uid":3,"name":"公共"},"teacher":{"photo":"","work":"321","name":"321","desc":"321"},"is_like":false},{"release_time":"2015-12-28 17:39:07","update_time":"2015-12-28 17:39:07","create_time":"2015-12-28 17:39:07","video":{"web":"321","app":"321"},"uid":47,"title":"123321","photo":"","course_type":{"type":1,"uid":3,"name":"公共"},"teacher":{"photo":"","work":"321","name":"321","desc":"321"},"is_like":false},{"release_time":"2015-12-28 17:39:07","update_time":"2015-12-28 17:39:07","create_time":"2015-12-28 17:39:07","video":{"web":"321","app":"321"},"uid":48,"title":"123321","photo":"","course_type":{"type":1,"uid":3,"name":"公共"},"teacher":{"photo":"","work":"321","name":"321","desc":"321"},"is_like":false}],"type":[{"type":1,"uid":5,"name":"融资"},{"type":1,"uid":10,"name":"融资2"},{"type":1,"uid":15,"name":"融资3"}]}}
     */

    private String message;
    private int code;
    /**
     * top : {"course":[{"release_time":"2015-12-28 17:39:07","update_time":"2015-12-28 18:00:46","create_time":"2015-12-28 17:39:07","video":{"web":"321","app":"321"},"uid":45,"title":"123321","photo":"","course_type":{"type":1,"uid":3,"name":"公共"},"teacher":{"photo":"","work":"321","name":"321","desc":"321"},"is_like":false},{"release_time":"2015-12-28 17:39:07","update_time":"2015-12-28 17:39:07","create_time":"2015-12-28 17:39:07","video":{"web":"321","app":"321"},"uid":46,"title":"123321","photo":"","course_type":{"type":1,"uid":3,"name":"公共"},"teacher":{"photo":"","work":"321","name":"321","desc":"321"},"is_like":false}],"type":[]}
     * pro : {"course":[{"release_time":"2015-12-28 17:39:07","update_time":"2015-12-28 17:39:07","create_time":"2015-12-28 17:39:07","video":{"web":"321","app":"321"},"uid":64,"title":"123321","photo":"","course_type":{"type":2,"uid":2,"name":"财税"},"teacher":{"photo":"","work":"321","name":"321","desc":"321"},"is_like":false},{"release_time":"2015-12-28 17:39:07","update_time":"2015-12-28 17:39:07","create_time":"2015-12-28 17:39:07","video":{"web":"321","app":"321"},"uid":67,"title":"123321","photo":"","course_type":{"type":2,"uid":2,"name":"财税"},"teacher":{"photo":"","work":"321","name":"321","desc":"321"},"is_like":false},{"release_time":"2015-12-28 17:39:07","update_time":"2015-12-28 17:39:07","create_time":"2015-12-28 17:39:07","video":{"web":"321","app":"321"},"uid":68,"title":"123321","photo":"","course_type":{"type":2,"uid":2,"name":"财税"},"teacher":{"photo":"","work":"321","name":"321","desc":"321"},"is_like":false},{"release_time":"2015-12-28 17:39:07","update_time":"2015-12-28 17:39:07","create_time":"2015-12-28 17:39:07","video":{"web":"321","app":"321"},"uid":70,"title":"123321","photo":"","course_type":{"type":2,"uid":2,"name":"财税"},"teacher":{"photo":"","work":"321","name":"321","desc":"321"},"is_like":false}],"type":[{"type":2,"uid":2,"name":"财税"},{"type":2,"uid":4,"name":"人力"},{"type":2,"uid":7,"name":"财税2"}]}
     * basic : {"course":[{"release_time":"2015-12-28 17:39:07","update_time":"2015-12-28 18:00:46","create_time":"2015-12-28 17:39:07","video":{"web":"321","app":"321"},"uid":45,"title":"123321","photo":"","course_type":{"type":1,"uid":3,"name":"公共"},"teacher":{"photo":"","work":"321","name":"321","desc":"321"},"is_like":false},{"release_time":"2015-12-28 17:39:07","update_time":"2015-12-28 17:39:07","create_time":"2015-12-28 17:39:07","video":{"web":"321","app":"321"},"uid":46,"title":"123321","photo":"","course_type":{"type":1,"uid":3,"name":"公共"},"teacher":{"photo":"","work":"321","name":"321","desc":"321"},"is_like":false},{"release_time":"2015-12-28 17:39:07","update_time":"2015-12-28 17:39:07","create_time":"2015-12-28 17:39:07","video":{"web":"321","app":"321"},"uid":47,"title":"123321","photo":"","course_type":{"type":1,"uid":3,"name":"公共"},"teacher":{"photo":"","work":"321","name":"321","desc":"321"},"is_like":false},{"release_time":"2015-12-28 17:39:07","update_time":"2015-12-28 17:39:07","create_time":"2015-12-28 17:39:07","video":{"web":"321","app":"321"},"uid":48,"title":"123321","photo":"","course_type":{"type":1,"uid":3,"name":"公共"},"teacher":{"photo":"","work":"321","name":"321","desc":"321"},"is_like":false}],"type":[{"type":1,"uid":5,"name":"融资"},{"type":1,"uid":10,"name":"融资2"},{"type":1,"uid":15,"name":"融资3"}]}
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
        private TopEntity top;
        private ProEntity pro;
        private BasicEntity basic;

        public void setTop(TopEntity top) {
            this.top = top;
        }

        public void setPro(ProEntity pro) {
            this.pro = pro;
        }

        public void setBasic(BasicEntity basic) {
            this.basic = basic;
        }

        public TopEntity getTop() {
            return top;
        }

        public ProEntity getPro() {
            return pro;
        }

        public BasicEntity getBasic() {
            return basic;
        }

        public static class TopEntity {
            /**
             * release_time : 2015-12-28 17:39:07
             * update_time : 2015-12-28 18:00:46
             * create_time : 2015-12-28 17:39:07
             * video : {"web":"321","app":"321"}
             * uid : 45
             * title : 123321
             * photo :
             * course_type : {"type":1,"uid":3,"name":"公共"}
             * teacher : {"photo":"","work":"321","name":"321","desc":"321"}
             * is_like : false
             */

            private List<CourseEntity> course;
            private List<?> type;

            public void setCourse(List<CourseEntity> course) {
                this.course = course;
            }

            public void setType(List<?> type) {
                this.type = type;
            }

            public List<CourseEntity> getCourse() {
                return course;
            }

            public List<?> getType() {
                return type;
            }

            public static class CourseEntity {
                private String release_time;
                private String update_time;
                private String create_time;
                /**
                 * web : 321
                 * app : 321
                 */

                private VideoEntity video;
                private int uid;
                private String title;
                private String photo;
                /**
                 * type : 1
                 * uid : 3
                 * name : 公共
                 */

                private CourseTypeEntity course_type;
                /**
                 * photo :
                 * work : 321
                 * name : 321
                 * desc : 321
                 */

                private TeacherEntity teacher;
                private boolean is_like;

                public void setRelease_time(String release_time) {
                    this.release_time = release_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public void setCreate_time(String create_time) {
                    this.create_time = create_time;
                }

                public void setVideo(VideoEntity video) {
                    this.video = video;
                }

                public void setUid(int uid) {
                    this.uid = uid;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public void setPhoto(String photo) {
                    this.photo = photo;
                }

                public void setCourse_type(CourseTypeEntity course_type) {
                    this.course_type = course_type;
                }

                public void setTeacher(TeacherEntity teacher) {
                    this.teacher = teacher;
                }

                public void setIs_like(boolean is_like) {
                    this.is_like = is_like;
                }

                public String getRelease_time() {
                    return release_time;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public String getCreate_time() {
                    return create_time;
                }

                public VideoEntity getVideo() {
                    return video;
                }

                public int getUid() {
                    return uid;
                }

                public String getTitle() {
                    return title;
                }

                public String getPhoto() {
                    return photo;
                }

                public CourseTypeEntity getCourse_type() {
                    return course_type;
                }

                public TeacherEntity getTeacher() {
                    return teacher;
                }

                public boolean isIs_like() {
                    return is_like;
                }

                public static class VideoEntity {
                    private String web;
                    private String app;

                    public void setWeb(String web) {
                        this.web = web;
                    }

                    public void setApp(String app) {
                        this.app = app;
                    }

                    public String getWeb() {
                        return web;
                    }

                    public String getApp() {
                        return app;
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
            }
        }

        public static class ProEntity {
            /**
             * release_time : 2015-12-28 17:39:07
             * update_time : 2015-12-28 17:39:07
             * create_time : 2015-12-28 17:39:07
             * video : {"web":"321","app":"321"}
             * uid : 64
             * title : 123321
             * photo :
             * course_type : {"type":2,"uid":2,"name":"财税"}
             * teacher : {"photo":"","work":"321","name":"321","desc":"321"}
             * is_like : false
             */

            private List<CourseEntity> course;
            /**
             * type : 2
             * uid : 2
             * name : 财税
             */

            private List<TypeEntity> type;

            public void setCourse(List<CourseEntity> course) {
                this.course = course;
            }

            public void setType(List<TypeEntity> type) {
                this.type = type;
            }

            public List<CourseEntity> getCourse() {
                return course;
            }

            public List<TypeEntity> getType() {
                return type;
            }

            public static class CourseEntity {
                private String release_time;
                private String update_time;
                private String create_time;
                /**
                 * web : 321
                 * app : 321
                 */

                private VideoEntity video;
                private int uid;
                private String title;
                private String photo;
                /**
                 * type : 2
                 * uid : 2
                 * name : 财税
                 */

                private CourseTypeEntity course_type;
                /**
                 * photo :
                 * work : 321
                 * name : 321
                 * desc : 321
                 */

                private TeacherEntity teacher;
                private boolean is_like;

                public void setRelease_time(String release_time) {
                    this.release_time = release_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public void setCreate_time(String create_time) {
                    this.create_time = create_time;
                }

                public void setVideo(VideoEntity video) {
                    this.video = video;
                }

                public void setUid(int uid) {
                    this.uid = uid;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public void setPhoto(String photo) {
                    this.photo = photo;
                }

                public void setCourse_type(CourseTypeEntity course_type) {
                    this.course_type = course_type;
                }

                public void setTeacher(TeacherEntity teacher) {
                    this.teacher = teacher;
                }

                public void setIs_like(boolean is_like) {
                    this.is_like = is_like;
                }

                public String getRelease_time() {
                    return release_time;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public String getCreate_time() {
                    return create_time;
                }

                public VideoEntity getVideo() {
                    return video;
                }

                public int getUid() {
                    return uid;
                }

                public String getTitle() {
                    return title;
                }

                public String getPhoto() {
                    return photo;
                }

                public CourseTypeEntity getCourse_type() {
                    return course_type;
                }

                public TeacherEntity getTeacher() {
                    return teacher;
                }

                public boolean isIs_like() {
                    return is_like;
                }

                public static class VideoEntity {
                    private String web;
                    private String app;

                    public void setWeb(String web) {
                        this.web = web;
                    }

                    public void setApp(String app) {
                        this.app = app;
                    }

                    public String getWeb() {
                        return web;
                    }

                    public String getApp() {
                        return app;
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
            }

            public static class TypeEntity {
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

        public static class BasicEntity {
            /**
             * release_time : 2015-12-28 17:39:07
             * update_time : 2015-12-28 18:00:46
             * create_time : 2015-12-28 17:39:07
             * video : {"web":"321","app":"321"}
             * uid : 45
             * title : 123321
             * photo :
             * course_type : {"type":1,"uid":3,"name":"公共"}
             * teacher : {"photo":"","work":"321","name":"321","desc":"321"}
             * is_like : false
             */

            private List<CourseEntity> course;
            /**
             * type : 1
             * uid : 5
             * name : 融资
             */

            private List<TypeEntity> type;

            public void setCourse(List<CourseEntity> course) {
                this.course = course;
            }

            public void setType(List<TypeEntity> type) {
                this.type = type;
            }

            public List<CourseEntity> getCourse() {
                return course;
            }

            public List<TypeEntity> getType() {
                return type;
            }

            public static class CourseEntity {
                private String release_time;
                private String update_time;
                private String create_time;
                /**
                 * web : 321
                 * app : 321
                 */

                private VideoEntity video;
                private int uid;
                private String title;
                private String photo;
                /**
                 * type : 1
                 * uid : 3
                 * name : 公共
                 */

                private CourseTypeEntity course_type;
                /**
                 * photo :
                 * work : 321
                 * name : 321
                 * desc : 321
                 */

                private TeacherEntity teacher;
                private boolean is_like;

                public void setRelease_time(String release_time) {
                    this.release_time = release_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public void setCreate_time(String create_time) {
                    this.create_time = create_time;
                }

                public void setVideo(VideoEntity video) {
                    this.video = video;
                }

                public void setUid(int uid) {
                    this.uid = uid;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public void setPhoto(String photo) {
                    this.photo = photo;
                }

                public void setCourse_type(CourseTypeEntity course_type) {
                    this.course_type = course_type;
                }

                public void setTeacher(TeacherEntity teacher) {
                    this.teacher = teacher;
                }

                public void setIs_like(boolean is_like) {
                    this.is_like = is_like;
                }

                public String getRelease_time() {
                    return release_time;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public String getCreate_time() {
                    return create_time;
                }

                public VideoEntity getVideo() {
                    return video;
                }

                public int getUid() {
                    return uid;
                }

                public String getTitle() {
                    return title;
                }

                public String getPhoto() {
                    return photo;
                }

                public CourseTypeEntity getCourse_type() {
                    return course_type;
                }

                public TeacherEntity getTeacher() {
                    return teacher;
                }

                public boolean isIs_like() {
                    return is_like;
                }

                public static class VideoEntity {
                    private String web;
                    private String app;

                    public void setWeb(String web) {
                        this.web = web;
                    }

                    public void setApp(String app) {
                        this.app = app;
                    }

                    public String getWeb() {
                        return web;
                    }

                    public String getApp() {
                        return app;
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
            }

            public static class TypeEntity {
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
}
