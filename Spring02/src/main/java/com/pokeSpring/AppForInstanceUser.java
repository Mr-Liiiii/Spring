package com.pokeSpring;

import com.pokeSpring.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceUser {
 public static void main(String[] args) {
  ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
  UserDao userDao = (UserDao)ctx.getBean("userDao");
  userDao.save();
  /*
  UserDao userDao1 = (UserDao) ctx.getBean("userDao");
  UserDao userDao2 = (UserDao) ctx.getBean("userDao");
  System.out.println(userDao1);
  System.out.println(userDao2);
  */

 }
}
