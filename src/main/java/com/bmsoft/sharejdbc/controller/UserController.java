package com.bmsoft.sharejdbc.controller;

import com.bmsoft.sharejdbc.entity.UserEntity;
import com.bmsoft.sharejdbc.enums.UserSexEnum;
import com.bmsoft.sharejdbc.service.User1Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  private User1Service user1Service;

  @PostMapping("/getUsers")
  public List<UserEntity> getUsers(@RequestBody UserEntity userEntity) {
    List<UserEntity> users = user1Service.getUsers(userEntity);
    return users;
  }

  //测试
  @PostMapping(value = "update1")
  public String updateTransactional(@RequestBody UserEntity userEntity) {
    userEntity.setPassWord("123456");
    userEntity.setUserSex(UserSexEnum.WOMAN);
    user1Service.updateTransactional(userEntity);
    return "test";
  }
}
