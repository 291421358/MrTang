package com.tzhh.hello.spring.cloud.service.admin.entity;

import javax.persistence.*;

@Table(name = "myshop.dictionary")
public class Dictionary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String chinese;

    private Integer code;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return chinese
     */
    public String getChinese() {
        return chinese;
    }

    /**
     * @param chinese
     */
    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }
}