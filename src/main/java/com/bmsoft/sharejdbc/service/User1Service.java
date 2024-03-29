package com.bmsoft.sharejdbc.service;

import com.bmsoft.sharejdbc.entity.UserEntity;
import com.bmsoft.sharejdbc.mapper.User1Mapper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class User1Service {

  @Autowired
  private User1Mapper user1Mapper;

  public List<UserEntity> getUsers(UserEntity userEntity) {
    List<UserEntity> users = user1Mapper.getAll(userEntity);
    return users;
  }

  //    @Transactional(value="test1TransactionManager",rollbackFor = Exception.class,timeout=36000)
  // 说明针对Exception异常也进行回滚，如果不标注，则Spring 默认只有抛出 RuntimeException才会回滚事务
  public void updateTransactional(UserEntity user) {
    try {
      user1Mapper.insert(user);
      log.error(String.valueOf(user));
    } catch (Exception e) {
      log.error("find exception!");
      // 事物方法中，如果使用trycatch捕获异常后，需要将异常抛出，否则事物不回滚。
      throw e;
    }

  }

}
