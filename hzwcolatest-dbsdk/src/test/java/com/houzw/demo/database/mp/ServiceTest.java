package com.houzw.demo.database.mp;

import com.houzw.demo.database.mybatisplus.entity.HzwUser;
import com.houzw.demo.database.mybatisplus.service.IHzwUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class ServiceTest {

    @Autowired
    public IHzwUserService hzwUserService;

    @Test
    public void list() {
        hzwUserService.list();
    }

    @Test
//    @Transactional  // TODO 此处事务生效了，但似乎没提交，事务内部能看到数据变化但方法结束后查库无法查看到
    public void save() {
        System.out.println("start");
        HzwUser hzwuser = new HzwUser();
        hzwuser.setName("hhoouuzzww");
        hzwuser.setDisplayName("houzw");
        hzwuser.setFcd(LocalDateTime.now());
        hzwuser.setLcd(LocalDateTime.now());
        hzwuser.setFcu("test");
        hzwuser.setLcu("test");
        hzwUserService.save(hzwuser);
        System.out.println("============" + hzwuser.getId());

        hzwUserService.list();

        System.out.println("============" + hzwuser.getId());

    }

}
