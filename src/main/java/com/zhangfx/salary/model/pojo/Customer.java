package com.zhangfx.salary.model.pojo;

/**
 * @author 张福兴
 * @version 1.0
 * @date 2022/11/14
 * @email zhangfuxing1010@163.com
 */
public class Customer {
    private Integer id;
    private String name;
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
