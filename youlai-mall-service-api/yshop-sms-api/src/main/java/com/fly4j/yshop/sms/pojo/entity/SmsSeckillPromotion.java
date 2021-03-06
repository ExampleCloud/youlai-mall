package com.fly4j.yshop.sms.pojo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.youlai.common.core.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class SmsSeckillPromotion extends BaseEntity {

  @TableId(type = IdType.ASSIGN_ID)
  private Integer id;
  private String title;
  private Date start_time;
  private Date end_time;
  private Integer status;
}
