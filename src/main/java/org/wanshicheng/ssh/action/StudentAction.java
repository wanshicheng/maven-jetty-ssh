package org.wanshicheng.ssh.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.wanshicheng.ssh.service.StudentService;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport implements RequestAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private StudentService studentService;
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	public String list() {
		request.put("students", studentService.getAll());
		return "list";
	}
	
	private Map<String, Object> request;

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

}
