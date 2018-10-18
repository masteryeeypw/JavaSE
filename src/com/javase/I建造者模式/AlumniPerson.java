package com.javase.I建造者模式;

import java.util.Date;
/**
 * Created by Yipw on 2018/10/18 0018.
 */
public class AlumniPerson {

    private String wxOpenid;
    //学校id
    private String schoolId;
    //校友电话
    private String phone;
    //登录密码
    private String password;
    //校友姓名
    private String name;

    /**
     * 构建起, 所用: 提供构造产品的所有方法
     */
    public static class Builder {
        private String wxOpenid;
        //学校id
        private String schoolId;
        //校友电话
        private String phone;
        //登录密码
        private String password;
        //校友姓名
        private String name;

        public Builder setWxOpenid(String wxOpenid) {
            this.wxOpenid = wxOpenid;
            return this;
        }
        public Builder setSchoolId(String schoolId) {
            this.schoolId = schoolId;
            return this;
        }
        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public AlumniPerson build() {
            return new AlumniPerson(this);
        }
    }

    private AlumniPerson(Builder builder) {
        this.schoolId = builder.schoolId;
        this.wxOpenid = builder.wxOpenid;
        this.phone = builder.phone;
        this.password = builder.password;
        this.name = builder.name;
    }

    @Override
    public String toString() {
        return "AlumniPerson{" +
                "wxOpenid='" + wxOpenid + '\'' +
                ", schoolId='" + schoolId + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
