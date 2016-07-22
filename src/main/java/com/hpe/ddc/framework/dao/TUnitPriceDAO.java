package com.hpe.ddc.framework.dao;

import com.hpe.ddc.framework.model.TUnitPrice;
import com.hpe.ddc.framework.model.TUnitPriceCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TUnitPriceDAO {
    int countByCriteria(TUnitPriceCriteria example);

    int deleteByCriteria(TUnitPriceCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(TUnitPrice record);

    int insertSelective(TUnitPrice record);

    List<TUnitPrice> selectByCriteria(TUnitPriceCriteria example);

    TUnitPrice selectByPrimaryKey(Long id);

    int updateByCriteriaSelective(@Param("record") TUnitPrice record, @Param("example") TUnitPriceCriteria example);

    int updateByCriteria(@Param("record") TUnitPrice record, @Param("example") TUnitPriceCriteria example);

    int updateByPrimaryKeySelective(TUnitPrice record);

    int updateByPrimaryKey(TUnitPrice record);
}