package com.actions;

import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport{
	private String name;
	private String pwd;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String execute(){
		if(name.equals("admin")&&pwd.equals("admin"))
		return "success";
		else{
			return "error";
		}
	}
}
