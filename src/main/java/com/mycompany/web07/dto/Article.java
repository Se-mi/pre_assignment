package com.mycompany.web07.dto;

import java.sql.Date;

public class Article {
	private int uid;
	private String email;
	private String password;
	private String contents;
	private Date upload_time;
	private Date revise_time;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getUpload_time() {
		return upload_time;
	}
	public void setUpload_time(Date upload_time) {
		this.upload_time = upload_time;
	}
	public Date getRevise_time() {
		return revise_time;
	}
	public void setRevise_time(Date revise_time) {
		this.revise_time = revise_time;
	}
	
}
