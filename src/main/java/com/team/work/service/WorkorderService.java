package com.team.work.service;

import com.team.work.domain.Workorder;

import java.util.List;

public interface WorkorderService {
    List<Workorder> selectOrder();

    int insert(Workorder record);

    List<Workorder> selectAllWork();
}
