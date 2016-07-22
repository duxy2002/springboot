package com.hpe.ddc.framework.dao;

import com.hpe.ddc.framework.model.TOrderDetail;
import com.hpe.ddc.framework.model.TOrderDetailCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TOrderDetailDAO {
    int countByCriteria(TOrderDetailCriteria example);

    int deleteByCriteria(TOrderDetailCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(TOrderDetail record);

    int insertSelective(TOrderDetail record);

    List<TOrderDetail> selectByCriteria(TOrderDetailCriteria example);

    TOrderDetail selectByPrimaryKey(Long id);

    int updateByCriteriaSelective(@Param("record") TOrderDetail record, @Param("example") TOrderDetailCriteria example);

    int updateByCriteria(@Param("record") TOrderDetail record, @Param("example") TOrderDetailCriteria example);

    int updateByPrimaryKeySelective(TOrderDetail record);

    int updateByPrimaryKey(TOrderDetail record);
}