package com.hpe.ddc.framework.dao;

import com.hpe.ddc.framework.model.TPrintError;
import com.hpe.ddc.framework.model.TPrintErrorCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TPrintErrorDAO {
    int countByCriteria(TPrintErrorCriteria example);

    int deleteByCriteria(TPrintErrorCriteria example);

    int deleteByPrimaryKey(Integer errorCode);

    int insert(TPrintError record);

    int insertSelective(TPrintError record);

    List<TPrintError> selectByCriteria(TPrintErrorCriteria example);

    TPrintError selectByPrimaryKey(Integer errorCode);

    int updateByCriteriaSelective(@Param("record") TPrintError record, @Param("example") TPrintErrorCriteria example);

    int updateByCriteria(@Param("record") TPrintError record, @Param("example") TPrintErrorCriteria example);

    int updateByPrimaryKeySelective(TPrintError record);

    int updateByPrimaryKey(TPrintError record);
}