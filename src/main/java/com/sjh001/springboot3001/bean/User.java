package com.sjh001.springboot3001.bean;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer User_id;
    private Integer dept_id;
    private String user_name;
    private String nick_name;
    private String user_type;
    private String email;
    private String phonenumber;
    private String sex;
    private String avatar;
    private String password;
    private String status;
    private String del_flag;
    private String login_ip;
    private Date login_date;
    private Date create_time;
    private String create_by;
    private String updata_by;
    private Date updata_time;
    private String remark;
}
