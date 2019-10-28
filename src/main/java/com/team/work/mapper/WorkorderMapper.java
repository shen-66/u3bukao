package com.team.work.mapper;


import com.team.work.domain.Workorder;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WorkorderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Workorder record);

    int insertSelective(Workorder record);

    Workorder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Workorder record);

    int updateByPrimaryKey(Workorder record);

    @Select("select * from workorder")
    List<Workorder> selectOrder();

    List<Workorder> selectAllWork();
}