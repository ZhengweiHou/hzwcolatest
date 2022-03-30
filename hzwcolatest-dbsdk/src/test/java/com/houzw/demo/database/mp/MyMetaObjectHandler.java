package com.houzw.demo.database.mp;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * 填充器
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyMetaObjectHandler.class);

    @Override
    public void insertFill(MetaObject metaObject) {
        LOGGER.info("start insert fill ....");
        this.strictInsertFill(metaObject, "fcu", String.class, "sys");
        this.strictInsertFill(metaObject, "lcu", String.class, "sys");
        this.strictInsertFill(metaObject, "fcd", LocalDateTime.class, LocalDateTime.now());
        this.strictInsertFill(metaObject, "lcd", LocalDateTime.class, LocalDateTime.now());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        LOGGER.info("start update fill ....");
        this.setFieldValByName("lcu","sys_update",metaObject);
        this.setFieldValByName("lcd", LocalDateTime.now(),metaObject);

        // 填充操作：字段有值时不填充
//        this.fillStrategy(metaObject, "lcu", "sys_update");
//        this.fillStrategy(metaObject, "lcd", LocalDateTime.now());
//        this.strictUpdateFill(metaObject,"lcu",String.class,"sys11");
//        this.strictUpdateFill(metaObject,"lcd", LocalDateTime.class,LocalDateTime.now());
    }
}
