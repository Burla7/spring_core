package cn.qcode.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/11.
 */

public class  Email implements Serializable {
    private  String content;

    public Email() {
    }

    public Email(String name,String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}