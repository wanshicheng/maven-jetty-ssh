package org.wanshicheng.ssh.service;

import java.util.List;

import org.wanshicheng.ssh.dao.StudentDao;
import org.wanshicheng.ssh.entity.Student;

public interface StudentService {
	void setStudentDao(StudentDao studentDao);
	public List<Student> getAll();
}
