package com.raptor.springmini.demobean;

/**
 * @author 陈文豪(chenwenhao.0401 @ bytedance.com)
 * @version 1.0
 * @date 2022/6/16 14:36
 * @description
 */
public class UserService {


    private String username;

    public UserService() {
    }

    public UserService(String username) {
        this.username = username;
    }

    public void sayHello(){
        System.out.println("[UserService] say hello !");
    }


    @Override
    public String toString() {
        return "UserService{" +
                "username='" + username + '\'' +
                '}';
    }
}
