package com.pokeSpring.factory;

import com.pokeSpring.dao.OrderDao;
import com.pokeSpring.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        System.out.println("factory setup....");
        return new OrderDaoImpl();
    }
}
