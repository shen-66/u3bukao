package com.team.work.service.Impl;

import com.team.work.domain.Workorder;
import com.team.work.mapper.WorkorderMapper;
import com.team.work.service.WorkorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WorkorderServiceImpl implements WorkorderService {
    @Autowired
    private WorkorderMapper workorderMapper;
    @Override
    public List<Workorder> selectOrder() {
        return workorderMapper.selectOrder();
    }

    @Override
    public int insert(Workorder record) {
        return workorderMapper.insert(record);
    }

    @Override
    public List<Workorder> selectAllWork() {
        return workorderMapper.selectAllWork();
    }
}
