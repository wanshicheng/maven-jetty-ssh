package org.wanshicheng.ssh.service.impl;

import java.util.List;

import org.wanshicheng.ssh.dao.StudentDao;
import org.wanshicheng.ssh.entity.Student;
import org.wanshicheng.ssh.service.StudentService;

public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;

	@Override
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public List<Student> getAll() {
		return studentDao.getAll();
	}
	
	
}
