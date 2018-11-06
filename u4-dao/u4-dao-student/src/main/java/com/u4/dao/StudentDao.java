package com.u4.dao;

import com.u4.entry.Student;

import java.util.List;

/**
 * @Author ZhPJ
 * @Date 2018/11/6 000616:44
 * @Version 1.0
 * @Description:
 */
public interface StudentDao {

    Student queryStudentById (String id);

    List<Student> queryStudents(Student student);

    boolean insertOrUpdateStudent (Student student);

    boolean deleteStudent (Student student);

}
