package com.houzw.demo.database.mp;

import com.houzw.demo.database.mybatisplus.entity.HzwUserDO;
import com.houzw.demo.database.mybatisplus.service.HzwUserRep;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class ServiceTest {

    @Autowired
    public HzwUserRep hzwUserRep;

    @Test
    public void list() {
        hzwUserRep.list();
    }

    @Test
//    @Transactional  // TODO 此处事务生效了，但似乎没提交，事务内部能看到数据变化但方法结束后查库无法查看到
    public void save() {
        HzwUserDO hzwuser = new HzwUserDO();
        hzwuser.setName("houzw");
        hzwuser.setDisplayName("sirius");
        // 系统字段通过字段填充器赋值
//        hzwuser.setFcd(LocalDateTime.now());
//        hzwuser.setLcd(LocalDateTime.now());
//        hzwuser.setFcu("test");
//        hzwuser.setLcu("test");
        hzwUserRep.save(hzwuser);
        System.out.println("============" + hzwuser.getId());

    }

    @Test
    public void optimisticLockerupdateTest() {
        HzwUserDO hzwuser = hzwUserRep.getById(1);

        Long oldversion = hzwuser.getVersion();

        hzwuser.setDisplayName(hzwuser.getDisplayName() + "h");
        hzwUserRep.updateById(hzwuser);

        assert(hzwuser.getVersion() == oldversion + 1);

        System.out.println("oldversion:" + oldversion + "  newversion:" + hzwuser.getVersion());
    }

    @Test
    public void optimisticLockerExceptionTest() throws InterruptedException {

        HzwUserDO hzwuser = hzwUserRep.getById(1);
        HzwUserDO hzwuser2 = new HzwUserDO();
        BeanUtils.copyProperties(hzwuser,hzwuser2);
        new Thread(()->{
            hzwuser.setDisplayName(hzwuser.getDisplayName() + "z");
            hzwUserRep.updateById(hzwuser);
        }).start();

        Thread.sleep(100);

        Assert.assertFalse(hzwUserRep.updateById(hzwuser2));
    }

//    @Transactional
//    public void fun1(HzwUser hzwuser){
//        hzwuser.setDisplayName(hzwuser.getDisplayName() + "z");
//        boolean b = hzwUserService.updateById(hzwuser);
//        System.out.println(hzwuser.getDisplayName() + "  " + hzwuser.getVersion() + " " + b);
//    }

}
