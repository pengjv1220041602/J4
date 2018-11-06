package com.u4.service;

import com.u4.entry.Student;

import java.util.List;

/**
 * @Author ZhPJ
 * @Date 2018/11/6 000613:47
 * @Version 1.0
 * @Description:
 */
public interface IStudentService {

    Student queryStudentById (String id);

    List<Student> queryStudents(Student student);

    boolean insertOrUpdateStudent (Student student);

    boolean deleteStudent (Student student);

}
