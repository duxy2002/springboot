package com.hpe.ddc.framework.dao;

import com.hpe.ddc.framework.model.TOrder;
import com.hpe.ddc.framework.model.TOrderCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TOrderDAO {
    int countByCriteria(TOrderCriteria example);

    int deleteByCriteria(TOrderCriteria example);

    int deleteByPrimaryKey(Long orderId);

    int insert(TOrder record);

    int insertSelective(TOrder record);

    List<TOrder> selectByCriteria(TOrderCriteria example);

    TOrder selectByPrimaryKey(Long orderId);

    int updateByCriteriaSelective(@Param("record") TOrder record, @Param("example") TOrderCriteria example);

    int updateByCriteria(@Param("record") TOrder record, @Param("example") TOrderCriteria example);

    int updateByPrimaryKeySelective(TOrder record);

    int updateByPrimaryKey(TOrder record);
}