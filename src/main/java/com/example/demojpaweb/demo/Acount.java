package com.example.demojpaweb.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Acount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "acount_no", nullable = false, unique = true, length = 10)
	private long acountNo;
	@Column(name = "ac_holder_name")
	private String acountHolderName;

	public Acount(long acountNo, String acountHolderName) {

		this.acountNo = acountNo;
		this.acountHolderName = acountHolderName;
	}
	public Acount(String acountHolderName) {

		this.acountHolderName = acountHolderName;
	}

	public Acount() {
	}

	public long getAcountNo() {
		return acountNo;
	}

	public void setAcountNo(long acountNo) {
		this.acountNo = acountNo;
	}

	public String getAcountHolderName() {
		return acountHolderName;
	}

	public void setAcountHolderName(String acountHolderName) {
		this.acountHolderName = acountHolderName;
	}

	@Override
	public String toString() {
		return "Acount [acountNo=" + acountNo + ", acountHolderName=" + acountHolderName + "]";
	}

}
