package com.jpa.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Skill {
	
	@Id
	@GeneratedValue
	int sid;
	String sname;
	
	public Skill() {	}
	public Skill(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	
	public Skill(String sname) {
		super();
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Skill [sid=" + sid + ", sname=" + sname + "]";
	}

}
