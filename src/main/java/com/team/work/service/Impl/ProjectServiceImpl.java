package com.team.work.service.Impl;

import com.team.work.domain.Project;
import com.team.work.mapper.ProjectMapper;
import com.team.work.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public List<Project> selectProAll() {
        System.out.println('s');
        System.out.println('s');
        System.out.println('s');
        System.out.println('s');
        return projectMapper.selectProAll();
    }
}
