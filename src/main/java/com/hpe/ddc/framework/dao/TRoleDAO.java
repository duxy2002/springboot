package com.hpe.ddc.framework.dao;

import com.hpe.ddc.framework.model.TRole;
import com.hpe.ddc.framework.model.TRoleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TRoleDAO {
    int countByCriteria(TRoleCriteria example);

    int deleteByCriteria(TRoleCriteria example);

    int deleteByPrimaryKey(Long roleId);

    int insert(TRole record);

    int insertSelective(TRole record);

    List<TRole> selectByCriteria(TRoleCriteria example);

    TRole selectByPrimaryKey(Long roleId);

    int updateByCriteriaSelective(@Param("record") TRole record, @Param("example") TRoleCriteria example);

    int updateByCriteria(@Param("record") TRole record, @Param("example") TRoleCriteria example);

    int updateByPrimaryKeySelective(TRole record);

    int updateByPrimaryKey(TRole record);
}