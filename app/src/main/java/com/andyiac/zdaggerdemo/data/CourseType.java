package com.andyiac.zdaggerdemo.data;

import java.util.List;

/**
 * @author andyiac
 * @date 12/29/15
 * @web www.andyiac.com
 */
public class CourseType {

    /**
     * message : 请求正常
     * code : 200
     * data : {"type_pro":[{"type":2,"uid":7,"name":"财税2"},{"type":2,"uid":4,"name":"人力"},{"type":2,"uid":9,"name":"人力2"},{"type":2,"uid":14,"name":"人力3"},{"type":2,"uid":12,"name":"财税3"},{"type":2,"uid":2,"name":"财税"}],"all":[{"type":1,"uid":15,"name":"融资3"},{"type":1,"uid":10,"name":"融资2"},{"type":1,"uid":5,"name":"融资"},{"type":1,"uid":13,"name":"公共3"},{"type":1,"uid":8,"name":"公共2"},{"type":1,"uid":3,"name":"公共"},{"type":2,"uid":7,"name":"财税2"},{"type":2,"uid":4,"name":"人力"},{"type":2,"uid":9,"name":"人力2"},{"type":2,"uid":14,"name":"人力3"},{"type":2,"uid":12,"name":"财税3"},{"type":2,"uid":2,"name":"财税"},{"type":1,"uid":6,"name":"法务2"},{"type":1,"uid":11,"name":"法务3"},{"type":1,"uid":1,"name":"法务"}],"type_basic":[{"type":1,"uid":15,"name":"融资3"},{"type":1,"uid":10,"name":"融资2"},{"type":1,"uid":5,"name":"融资"},{"type":1,"uid":13,"name":"公共3"},{"type":1,"uid":8,"name":"公共2"},{"type":1,"uid":3,"name":"公共"},{"type":1,"uid":6,"name":"法务2"},{"type":1,"uid":11,"name":"法务3"},{"type":1,"uid":1,"name":"法务"}]}
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
        /**
         * type : 2
         * uid : 7
         * name : 财税2
         */

        private List<TypeProEntity> type_pro;
        /**
         * type : 1
         * uid : 15
         * name : 融资3
         */

        private List<AllEntity> all;
        /**
         * type : 1
         * uid : 15
         * name : 融资3
         */

        private List<TypeBasicEntity> type_basic;

        public void setType_pro(List<TypeProEntity> type_pro) {
            this.type_pro = type_pro;
        }

        public void setAll(List<AllEntity> all) {
            this.all = all;
        }

        public void setType_basic(List<TypeBasicEntity> type_basic) {
            this.type_basic = type_basic;
        }

        public List<TypeProEntity> getType_pro() {
            return type_pro;
        }

        public List<AllEntity> getAll() {
            return all;
        }

        public List<TypeBasicEntity> getType_basic() {
            return type_basic;
        }

        public static class TypeProEntity {
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

        public static class AllEntity {
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

        public static class TypeBasicEntity {
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
