package com.web.model;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Member")
public class MemberBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="seqNo")
	
	private Integer pkey;
	private String accoun;
	@Column(name="password")
	private String password;
	private String first_name;
	private String last_name;
	@Column(name="address")
	private String address;
	private String phone;
	private String email;
	private String user_type;
	private Timestamp registerTime;
	@Column(columnDefinition="decimal(12, 1)")
	private Double total_amt;
	@Column(name="memberImage")	
	private Blob memberImage;
	@Column(name="fileName")
	private String fileName;
	@Column(columnDefinition="decimal(12, 1)")
	private Double unpaid_amt;
	
	public MemberBean(Integer pkey, String accoun, String password, String first_name, String last_name, String address,
			String phone, String email, String user_type, Timestamp registerTime, Double total_amt, Blob memberImage,
			String fileName, Double unpaid_amt) {
		super();
		this.pkey = pkey;
		this.accoun = accoun;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.user_type = user_type;
		this.registerTime = registerTime;
		this.total_amt = total_amt;
		this.memberImage = memberImage;
		this.fileName = fileName;
		this.unpaid_amt = unpaid_amt;
	}
		
	public MemberBean() {
		
	}
	public Integer getPkey() {
		return pkey;
	}
	public void setPkey(Integer pkey) {
		this.pkey = pkey;
	}
	public String getAccoun() {
		return accoun;
	}
	public void setAccoun(String accoun) {
		this.accoun = accoun;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public Timestamp getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Timestamp registerTime) {
		this.registerTime = registerTime;
	}
	public Double getTotal_amt() {
		return total_amt;
	}
	public void setTotal_amt(Double total_amt) {
		this.total_amt = total_amt;
	}
	public Blob getMemberImage() {
		return memberImage;
	}
	public void setMemberImage(Blob memberImage) {
		this.memberImage = memberImage;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Double getUnpaid_amt() {
		return unpaid_amt;
	}
	public void setUnpaid_amt(Double unpaid_amt) {
		this.unpaid_amt = unpaid_amt;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "MemberBean [pkey=" + pkey + ", accoun=" + accoun + ", password=" + password + ", first_name="
				+ first_name + ", last_name=" + last_name + ", address=" + address + ", phone=" + phone + ", email="
				+ email + ", user_type=" + user_type + ", registerTime=" + registerTime + ", total_amt=" + total_amt
				+ ", memberImage=" + memberImage + ", fileName=" + fileName + ", unpaid_amt=" + unpaid_amt + "]";
	}
	
	


}
