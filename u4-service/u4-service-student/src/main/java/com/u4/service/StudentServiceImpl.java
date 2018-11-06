package com.u4.service;

import com.u4.dao.StudentDao;
import com.u4.entry.Student;
import com.u4.utils.UUIDUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @Author ZhPJ
 * @Date 2018/11/6 000613:47
 * @Version 1.0
 * @Description:
 */
public class StudentServiceImpl implements IStudentService {

    StudentDao studentDao;

    public Student queryStudentById(String id) {
        return null;
    }

    public List<Student> queryStudents(Student student) {
        return null;
    }

    public boolean insertOrUpdateStudent(Student student) {
        if (StringUtils.isNotBlank(student.getId())) {
            student.setId(UUIDUtils.getUUID());
            return studentDao.insertStudent(student) > 0;
        } else {
            return studentDao.updateStudent(student) > 0;
        }
    }

    public boolean deleteStudent(Student student) {
        return false;
    }
}
