package com.itm.mybatis2.service;

import com.itm.mybatis2.dao.UserMapper;
import com.itm.mybatis2.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @description UserService
* @author hao.yang
* @create 2018-07-31 
*/

@Service
@Transactional(readOnly = true)
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getUserById(Integer id){
        return userMapper.getById(id);
    }

    public void save(User user) {
        userMapper.save(user);
        System.out.println(1);
    }
}
