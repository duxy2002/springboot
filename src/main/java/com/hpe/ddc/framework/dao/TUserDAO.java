package com.hpe.ddc.framework.dao;

import com.hpe.ddc.framework.model.TUser;
import com.hpe.ddc.framework.model.TUserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TUserDAO {
    int countByCriteria(TUserCriteria example);

    int deleteByCriteria(TUserCriteria example);

    int deleteByPrimaryKey(Long userId);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByCriteria(TUserCriteria example);

    TUser selectByPrimaryKey(Long userId);

    int updateByCriteriaSelective(@Param("record") TUser record, @Param("example") TUserCriteria example);

    int updateByCriteria(@Param("record") TUser record, @Param("example") TUserCriteria example);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}