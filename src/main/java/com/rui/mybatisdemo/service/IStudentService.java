package com.rui.mybatisdemo.service;

import com.rui.mybatisdemo.vo.Student;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IStudentService {
    @Transactional(readOnly = true)
    public Student list();
}
