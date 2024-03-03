package com.aj.oto.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_passport")
public class Passport {
	@Id
	@Column(name="pass_id")
	private Integer passportId;
	
	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", expireDate=" + expireDate + "]";
	}

	@Column(name="expire_date")
	private LocalDate expireDate;

	public Integer getPassportId() {
		return passportId;
	}

	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}
	
	

}
