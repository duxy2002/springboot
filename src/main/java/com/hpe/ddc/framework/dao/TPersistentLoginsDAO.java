package com.hpe.ddc.framework.dao;

import com.hpe.ddc.framework.model.TPersistentLogins;
import com.hpe.ddc.framework.model.TPersistentLoginsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TPersistentLoginsDAO {
    int countByCriteria(TPersistentLoginsCriteria example);

    int deleteByCriteria(TPersistentLoginsCriteria example);

    int deleteByPrimaryKey(String series);

    int insert(TPersistentLogins record);

    int insertSelective(TPersistentLogins record);

    List<TPersistentLogins> selectByCriteria(TPersistentLoginsCriteria example);

    TPersistentLogins selectByPrimaryKey(String series);

    int updateByCriteriaSelective(@Param("record") TPersistentLogins record, @Param("example") TPersistentLoginsCriteria example);

    int updateByCriteria(@Param("record") TPersistentLogins record, @Param("example") TPersistentLoginsCriteria example);

    int updateByPrimaryKeySelective(TPersistentLogins record);

    int updateByPrimaryKey(TPersistentLogins record);
}