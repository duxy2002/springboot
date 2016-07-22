package com.hpe.ddc.framework.dao;

import com.hpe.ddc.framework.model.TPicture;
import com.hpe.ddc.framework.model.TPictureCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TPictureDAO {
    int countByCriteria(TPictureCriteria example);

    int deleteByCriteria(TPictureCriteria example);

    int deleteByPrimaryKey(Long pictureId);

    int insert(TPicture record);

    int insertSelective(TPicture record);

    List<TPicture> selectByCriteriaWithBLOBs(TPictureCriteria example);

    List<TPicture> selectByCriteria(TPictureCriteria example);

    TPicture selectByPrimaryKey(Long pictureId);

    int updateByCriteriaSelective(@Param("record") TPicture record, @Param("example") TPictureCriteria example);

    int updateByCriteriaWithBLOBs(@Param("record") TPicture record, @Param("example") TPictureCriteria example);

    int updateByCriteria(@Param("record") TPicture record, @Param("example") TPictureCriteria example);

    int updateByPrimaryKeySelective(TPicture record);

    int updateByPrimaryKeyWithBLOBs(TPicture record);

    int updateByPrimaryKey(TPicture record);
}