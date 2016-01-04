package com.andyiac.zdaggerdemo.data;

import java.util.List;

/**
 * @author andyiac
 * @date 1/4/16
 * @web www.andyiac.com
 */
public class CourseDetailsComments {

    /**
     * message : 请求正常
     * code : 200
     * data : [{"member":{"photo":"http://7xl0ey.com2.z0.glb.qiniucdn.com/1450352114_45817.jpg","company":"dsadsa","work":"dsa","uid":"69ca29ff6ae44d79b6237f2555b9b592","realname":"刘星"},"content":"edsadsadsadsa","create_time":"2015-12-28 18:07:35","uid":20,"reply":{"member":{"photo":"http://7xl0ey.com2.z0.glb.qiniucdn.com/1450352114_45817.jpg","company":"dsadsa","work":"dsa","uid":"69ca29ff6ae44d79b6237f2555b9b592","realname":"刘星"},"content":"edsadsadsadsa","create_time":"2015-12-28 18:07:28","uid":19}}]
     */

    private String message;
    private int code;
    /**
     * member : {"photo":"http://7xl0ey.com2.z0.glb.qiniucdn.com/1450352114_45817.jpg","company":"dsadsa","work":"dsa","uid":"69ca29ff6ae44d79b6237f2555b9b592","realname":"刘星"}
     * content : edsadsadsadsa
     * create_time : 2015-12-28 18:07:35
     * uid : 20
     * reply : {"member":{"photo":"http://7xl0ey.com2.z0.glb.qiniucdn.com/1450352114_45817.jpg","company":"dsadsa","work":"dsa","uid":"69ca29ff6ae44d79b6237f2555b9b592","realname":"刘星"},"content":"edsadsadsadsa","create_time":"2015-12-28 18:07:28","uid":19}
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
        /**
         * photo : http://7xl0ey.com2.z0.glb.qiniucdn.com/1450352114_45817.jpg
         * company : dsadsa
         * work : dsa
         * uid : 69ca29ff6ae44d79b6237f2555b9b592
         * realname : 刘星
         */

        private MemberEntity member;
        private String content;
        private String create_time;
        private int uid;
        /**
         * member : {"photo":"http://7xl0ey.com2.z0.glb.qiniucdn.com/1450352114_45817.jpg","company":"dsadsa","work":"dsa","uid":"69ca29ff6ae44d79b6237f2555b9b592","realname":"刘星"}
         * content : edsadsadsadsa
         * create_time : 2015-12-28 18:07:28
         * uid : 19
         */

        private ReplyEntity reply;

        public void setMember(MemberEntity member) {
            this.member = member;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public void setReply(ReplyEntity reply) {
            this.reply = reply;
        }

        public MemberEntity getMember() {
            return member;
        }

        public String getContent() {
            return content;
        }

        public String getCreate_time() {
            return create_time;
        }

        public int getUid() {
            return uid;
        }

        public ReplyEntity getReply() {
            return reply;
        }

        public static class MemberEntity {
            private String photo;
            private String company;
            private String work;
            private String uid;
            private String realname;

            public void setPhoto(String photo) {
                this.photo = photo;
            }

            public void setCompany(String company) {
                this.company = company;
            }

            public void setWork(String work) {
                this.work = work;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public void setRealname(String realname) {
                this.realname = realname;
            }

            public String getPhoto() {
                return photo;
            }

            public String getCompany() {
                return company;
            }

            public String getWork() {
                return work;
            }

            public String getUid() {
                return uid;
            }

            public String getRealname() {
                return realname;
            }
        }

        public static class ReplyEntity {
            /**
             * photo : http://7xl0ey.com2.z0.glb.qiniucdn.com/1450352114_45817.jpg
             * company : dsadsa
             * work : dsa
             * uid : 69ca29ff6ae44d79b6237f2555b9b592
             * realname : 刘星
             */

            private MemberEntity member;
            private String content;
            private String create_time;
            private int uid;

            public void setMember(MemberEntity member) {
                this.member = member;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public MemberEntity getMember() {
                return member;
            }

            public String getContent() {
                return content;
            }

            public String getCreate_time() {
                return create_time;
            }

            public int getUid() {
                return uid;
            }

            public static class MemberEntity {
                private String photo;
                private String company;
                private String work;
                private String uid;
                private String realname;

                public void setPhoto(String photo) {
                    this.photo = photo;
                }

                public void setCompany(String company) {
                    this.company = company;
                }

                public void setWork(String work) {
                    this.work = work;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public void setRealname(String realname) {
                    this.realname = realname;
                }

                public String getPhoto() {
                    return photo;
                }

                public String getCompany() {
                    return company;
                }

                public String getWork() {
                    return work;
                }

                public String getUid() {
                    return uid;
                }

                public String getRealname() {
                    return realname;
                }
            }
        }
    }
}
