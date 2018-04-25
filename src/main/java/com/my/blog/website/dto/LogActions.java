package com.my.blog.website.dto;

/**
 * 日志表的action字段
 * Created by BlueT on 2017/3/4.
 */
public enum LogActions {

    LOGIN("Login Backstage"), UP_PWD("Modify Password"), UP_INFO("Update Personal Information"),
    DEL_ARTICLE("Delete Article"), DEL_PAGE("Delete Page"), SYS_BACKUP("System Backup"),
    SYS_SETTING("Save System Setting"), INIT_SITE("Initialization Site");

    private String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    LogActions(String action) {
        this.action = action;
    }
}
