package com.pokeSpring.factory;

import com.pokeSpring.dao.UserDao;
import com.pokeSpring.dao.impl.UserdaoImpl;

public class UserDaoFactory {
public UserDao getUserDao(){
    return new UserdaoImpl();
}

}
