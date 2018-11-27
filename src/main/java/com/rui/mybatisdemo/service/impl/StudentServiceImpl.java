package com.rui.mybatisdemo.service.impl;

import com.rui.mybatisdemo.dao.IStudentDAO;
import com.rui.mybatisdemo.service.IStudentService;
import com.rui.mybatisdemo.vo.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements IStudentService {
    @Resource
    private IStudentDAO iStudentDAO;
    @Override
    public Student list() {
        return this.iStudentDAO.findAll();
    }
}
