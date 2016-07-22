package com.hpe.ddc.framework.dao;

import com.hpe.ddc.framework.model.TWechatSubscriber;
import com.hpe.ddc.framework.model.TWechatSubscriberCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TWechatSubscriberDAO {
    int countByCriteria(TWechatSubscriberCriteria example);

    int deleteByCriteria(TWechatSubscriberCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(TWechatSubscriber record);

    int insertSelective(TWechatSubscriber record);

    List<TWechatSubscriber> selectByCriteria(TWechatSubscriberCriteria example);

    TWechatSubscriber selectByPrimaryKey(Long id);

    int updateByCriteriaSelective(@Param("record") TWechatSubscriber record, @Param("example") TWechatSubscriberCriteria example);

    int updateByCriteria(@Param("record") TWechatSubscriber record, @Param("example") TWechatSubscriberCriteria example);

    int updateByPrimaryKeySelective(TWechatSubscriber record);

    int updateByPrimaryKey(TWechatSubscriber record);
}