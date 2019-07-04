package com.bmsoft.sharejdbc.entity;

import com.bmsoft.sharejdbc.enums.UserSexEnum;
import java.io.Serializable;
import lombok.Data;

@Data
public class UserEntity implements Serializable {

  private Long id;
  private Long order_id;
  private Long user_id;
  private String userName;
  private String passWord;
  private UserSexEnum userSex;
  private String nickName;

}
