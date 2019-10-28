package com.team.work.controller;

import com.team.work.domain.Project;
import com.team.work.domain.Workorder;
import com.team.work.service.Impl.ProjectServiceImpl;
import com.team.work.service.Impl.WorkorderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;


@Controller
public class WorkController {
    @Autowired
    private ProjectServiceImpl projectService;
    @Autowired
    private WorkorderServiceImpl workorderService;

    @RequestMapping("/add1")
    public ModelAndView add1(ModelAndView mv){
        List<Project> projects = projectService.selectProAll();
        mv.addObject("pro",projects);
        mv.setViewName("add1");
        return mv;
    }

    @RequestMapping("/add2")
    private ModelAndView add2(ModelAndView mv, HttpSession session, @RequestParam("projectid") Integer id){
        List<Workorder> workorderList = workorderService.selectOrder();
        session.setAttribute("order",workorderList);
        System.out.println(id);
        mv.addObject("projectid",id);
        mv.setViewName("add2");
        return mv;
    }
    @RequestMapping("/add")
    public ModelAndView add(ModelAndView mv,Workorder workorder){
        workorder.setCreatedate(new Date());
        System.out.println(workorder);
        int insert = workorderService.insert(workorder);
        if (insert>0){
            mv.addObject("insert","ss");
        }else {
            mv.addObject("insert","er");
        }
        List<Workorder> workorderList = workorderService.selectAllWork();
        System.out.println(workorderList);
        mv.addObject("work",workorderList);
        mv.setViewName("list");
        return mv;
    }
}
