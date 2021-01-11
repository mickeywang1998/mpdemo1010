package com.atguigu.mpdemo1010;

import com.atguigu.mpdemo1010.entity.User;
import com.atguigu.mpdemo1010.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class Mpdemo1010ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    //查询User表中的所有数据
    @Test
    public void findAll() {

        System.out.println("----- selectAll method test ------");
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    //添加操作
    public void addUser(){
        User user = new User();
        user.setName("lucky");
        user.setAge(18);
        user.setEmail("lucky@qq.com");

        int insert = userMapper.insert(user);
        System.out.println("insert:"+insert);

    }
    //修改操作
    @Test
    public void updateUser(){
        User user=new User();
        user.setId(2L);
        user.setAge(120);
        int row = userMapper.updateById(user);
        System.out.println(row);
    }
}
