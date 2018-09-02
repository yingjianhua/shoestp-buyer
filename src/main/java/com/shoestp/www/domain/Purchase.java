package com.shoestp.www.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usr_purchase")
public class Purchase {
	@Id
	@GeneratedValue
	private int pkey;
	private String name;
	@Column(name="login_name")
	private String loginName;
	private String password;

	public int getPkey() {
		return pkey;
	}
	public void setPkey(int pkey) {
		this.pkey = pkey;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Purchase [pkey=" + pkey + ", name=" + name + ", loginName=" + loginName + ", password=" + password
				+ "]";
	}
}
