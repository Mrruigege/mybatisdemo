package com.rui.mybatisdemo.dao;

import com.rui.mybatisdemo.vo.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IStudentDAO {
    public Student findAll();
}
