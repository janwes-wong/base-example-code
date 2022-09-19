package com.janwes.pojo;

import com.janwes.annotations.Model;
import com.janwes.annotations.Property;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes.pojo
 * @date 2021/12/21 18:14
 * @description
 */
@Model(tableName = "user_info", desc = "用户信息表")
public class UserInfo {

    @Property(name = "id", desc = "主键id")
    private Integer id;

    @Property(name = "user_name", desc = "用户名")
    private String username;

    @Property(name = "gender", desc = "性别")
    private String gender;

    @Property(name = "update_time", desc = "创建时间")
    private String updateTime;

    public UserInfo() {
    }

    public UserInfo(Integer id, String username, String gender, String updateTime) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
