package com.houzw.demo.database.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 * wwwwwwwww
 * @author sirius's plugin by mybatis_plus generator
 * @since 2021-08-26
 */
public class HzwUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("`name`")
    private String name;

    private String displayName;

    private LocalDateTime fcd;

    private String fcu;

    private LocalDateTime lcd;

    private String lcu;


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

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public LocalDateTime getFcd() {
        return fcd;
    }

    public void setFcd(LocalDateTime fcd) {
        this.fcd = fcd;
    }

    public String getFcu() {
        return fcu;
    }

    public void setFcu(String fcu) {
        this.fcu = fcu;
    }

    public LocalDateTime getLcd() {
        return lcd;
    }

    public void setLcd(LocalDateTime lcd) {
        this.lcd = lcd;
    }

    public String getLcu() {
        return lcu;
    }

    public void setLcu(String lcu) {
        this.lcu = lcu;
    }

    @Override
    public String toString() {
        return "HzwUser{" +
        "id=" + id +
        ", name=" + name +
        ", displayName=" + displayName +
        ", fcd=" + fcd +
        ", fcu=" + fcu +
        ", lcd=" + lcd +
        ", lcu=" + lcu +
        "}";
    }
}
