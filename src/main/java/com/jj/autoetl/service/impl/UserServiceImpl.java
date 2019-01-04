package com.jj.autoetl.service.impl;

import com.jj.autoetl.dao.CityDao;
import com.jj.autoetl.dao.UserDao;
import com.jj.autoetl.entity.User;
import com.jj.autoetl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务实现层
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private CityDao cityDao;

    @Override
    public User findByName(String userName) {
        User user = userDao.findByName(userName);
        //City city = cityDao.findByName("温岭市");
        //user.setCity(city);
        return user;
    }
}
