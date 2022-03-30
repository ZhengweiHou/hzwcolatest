package com.houzw.demo.database.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author sirius's plugin by mybatis_plus generator
 * @since 2021-09-07
 */
@TableName("hzw_user")
public class HzwUserDO implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    private String displayName;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime fcd;

    @TableField(fill = FieldFill.INSERT)
    private String fcu;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime lcd;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String lcu;

    @Version
    private Long version;


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

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "HzwUserDO{" +
        "id=" + id +
        ", name=" + name +
        ", displayName=" + displayName +
        ", fcd=" + fcd +
        ", fcu=" + fcu +
        ", lcd=" + lcd +
        ", lcu=" + lcu +
        ", version=" + version +
        "}";
    }
}
