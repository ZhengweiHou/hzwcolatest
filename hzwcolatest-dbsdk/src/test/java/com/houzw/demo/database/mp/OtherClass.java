package com.houzw.demo.database.mp;

import com.houzw.demo.database.mybatisplus.entity.HzwUserDO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class OtherClass {
    @Test
    public void test() throws NoSuchFieldException {
        Field id = HzwUserDO.class.getDeclaredField("id");
        Annotation[] annotations = id.getAnnotations();
        System.out.println("===");

    }
}
