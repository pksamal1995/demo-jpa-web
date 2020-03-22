package com.example.demojpaweb.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "filtering_data_table")
@NamedQueries({ @NamedQuery(name = "supplierName", query = "select DISTINCT supplierName from FilteringDataModel"),
		@NamedQuery(name = "supplierContact", query = "select DISTINCT supplierContact from FilteringDataModel"),
		@NamedQuery(name = "geContentOwner", query = "select DISTINCT geContentOwner from FilteringDataModel"), 
		@NamedQuery(name = "geOwner", query = "select DISTINCT geOwner from FilteringDataModel"), 
		@NamedQuery(name = "geCommodityLeader", query = "select DISTINCT geCommodityLeader from FilteringDataModel")})
public class FilteringDataModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pageId;
	private String supplierName;
	private String supplierContact;
	private String geContentOwner;
	private String geOwner;
	private String geCommodityLeader;

	public long getPageId() {
		return pageId;
	}

	public void setPageId(long pageId) {
		this.pageId = pageId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierContact() {
		return supplierContact;
	}

	public void setSupplierContact(String supplierContact) {
		this.supplierContact = supplierContact;
	}

	public String getGeContentOwner() {
		return geContentOwner;
	}

	public void setGeContentOwner(String geContentOwner) {
		this.geContentOwner = geContentOwner;
	}

	public String getGeOwner() {
		return geOwner;
	}

	public void setGeOwner(String geOwner) {
		this.geOwner = geOwner;
	}

	public String getGeCommodityLeader() {
		return geCommodityLeader;
	}

	public void setGeCommodityLeader(String geCommodityLeader) {
		this.geCommodityLeader = geCommodityLeader;
	}

	public FilteringDataModel(String supplierName, String supplierContact, String geContentOwner, String geOwner,
			String geComodityLeader) {

		this.supplierName = supplierName;
		this.supplierContact = supplierContact;
		this.geContentOwner = geContentOwner;
		this.geOwner = geOwner;
		this.geCommodityLeader = geComodityLeader;
	}

	public FilteringDataModel() {

	}

	@Override
	public String toString() {
		return "FilteringDataModel [pageId=" + pageId + ", supplierName=" + supplierName + ", supplierContact="
				+ supplierContact + ", geContentOwner=" + geContentOwner + ", geOwner=" + geOwner + ", geContentLeader="
				+ geCommodityLeader + "]";
	}

}
