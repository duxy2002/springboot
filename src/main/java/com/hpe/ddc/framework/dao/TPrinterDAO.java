package com.hpe.ddc.framework.dao;

import com.hpe.ddc.framework.model.TPrinter;
import com.hpe.ddc.framework.model.TPrinterCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TPrinterDAO {
    int countByCriteria(TPrinterCriteria example);

    int deleteByCriteria(TPrinterCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(TPrinter record);

    int insertSelective(TPrinter record);

    List<TPrinter> selectByCriteria(TPrinterCriteria example);

    TPrinter selectByPrimaryKey(Long id);

    int updateByCriteriaSelective(@Param("record") TPrinter record, @Param("example") TPrinterCriteria example);

    int updateByCriteria(@Param("record") TPrinter record, @Param("example") TPrinterCriteria example);

    int updateByPrimaryKeySelective(TPrinter record);

    int updateByPrimaryKey(TPrinter record);
}