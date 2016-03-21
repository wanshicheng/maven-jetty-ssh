package org.wanshicheng.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.wanshicheng.ssh.dao.StudentDao;
import org.wanshicheng.ssh.entity.Student;

public class StudentDaoImpl implements StudentDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	@Override
	public List<Student> getAll() {
		String hql = "FROM Student";
		return getSession().createQuery(hql).list();
	}
}
