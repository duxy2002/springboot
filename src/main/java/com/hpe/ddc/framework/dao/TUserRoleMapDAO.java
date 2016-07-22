package com.hpe.ddc.framework.dao;

import com.hpe.ddc.framework.model.TUserRoleMap;
import com.hpe.ddc.framework.model.TUserRoleMapCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TUserRoleMapDAO {
    int countByCriteria(TUserRoleMapCriteria example);

    int deleteByCriteria(TUserRoleMapCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(TUserRoleMap record);

    int insertSelective(TUserRoleMap record);

    List<TUserRoleMap> selectByCriteria(TUserRoleMapCriteria example);

    TUserRoleMap selectByPrimaryKey(Long id);

    int updateByCriteriaSelective(@Param("record") TUserRoleMap record, @Param("example") TUserRoleMapCriteria example);

    int updateByCriteria(@Param("record") TUserRoleMap record, @Param("example") TUserRoleMapCriteria example);

    int updateByPrimaryKeySelective(TUserRoleMap record);

    int updateByPrimaryKey(TUserRoleMap record);
}