package com.pokeSpring.factory;

import com.pokeSpring.dao.OrderDao;
import com.pokeSpring.dao.UserDao;
import com.pokeSpring.dao.impl.OrderDaoImpl;
import com.pokeSpring.dao.impl.UserdaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {


    @Override
    public UserDao getObject() throws Exception {
        return new UserdaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
}


