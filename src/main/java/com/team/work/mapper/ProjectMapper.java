package com.team.work.mapper;


import com.team.work.domain.Project;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProjectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);

    @Select("select * from project")
    List<Project> selectProAll();
}