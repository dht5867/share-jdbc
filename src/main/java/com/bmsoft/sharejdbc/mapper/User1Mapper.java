package com.bmsoft.sharejdbc.mapper;

import com.bmsoft.sharejdbc.entity.UserEntity;
import java.util.List;

public interface User1Mapper {

  List<UserEntity> getAll(UserEntity userEntity);

  void insert(UserEntity user);
}
