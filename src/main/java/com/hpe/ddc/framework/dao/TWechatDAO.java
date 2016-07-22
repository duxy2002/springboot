package com.hpe.ddc.framework.dao;

import com.hpe.ddc.framework.model.TWechat;
import com.hpe.ddc.framework.model.TWechatCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TWechatDAO {
    int countByCriteria(TWechatCriteria example);

    int deleteByCriteria(TWechatCriteria example);

    int deleteByPrimaryKey(String accountId);

    int insert(TWechat record);

    int insertSelective(TWechat record);

    List<TWechat> selectByCriteria(TWechatCriteria example);

    TWechat selectByPrimaryKey(String accountId);

    int updateByCriteriaSelective(@Param("record") TWechat record, @Param("example") TWechatCriteria example);

    int updateByCriteria(@Param("record") TWechat record, @Param("example") TWechatCriteria example);

    int updateByPrimaryKeySelective(TWechat record);

    int updateByPrimaryKey(TWechat record);
}