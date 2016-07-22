package com.hpe.ddc.framework.dao;

import com.hpe.ddc.framework.model.TCompany;
import com.hpe.ddc.framework.model.TCompanyCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TCompanyDAO {
    int countByCriteria(TCompanyCriteria example);

    int deleteByCriteria(TCompanyCriteria example);

    int deleteByPrimaryKey(Long companyId);

    int insert(TCompany record);

    int insertSelective(TCompany record);

    List<TCompany> selectByCriteria(TCompanyCriteria example);

    TCompany selectByPrimaryKey(Long companyId);

    int updateByCriteriaSelective(@Param("record") TCompany record, @Param("example") TCompanyCriteria example);

    int updateByCriteria(@Param("record") TCompany record, @Param("example") TCompanyCriteria example);

    int updateByPrimaryKeySelective(TCompany record);

    int updateByPrimaryKey(TCompany record);
}