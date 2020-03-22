package com.example.demojpaweb.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demojpaweb.demo.FilteringDataModel;

@Repository
public interface FilterRepo extends JpaRepository<FilteringDataModel, Long>{ 

	@Query(name = "supplierName")
	public List<String> getSupplierNames();

	@Query(name = "supplierContact")
	public List<String> getSupplierContact();
	
	@Query(name = "geContentOwner")
	public List<String> getGeContentOwner();

	@Query(name = "geCommodityLeader")
	public List<String> getGeCommodityLeader();

	@Query(name = "geOwner")
	public List<String> getGeOwner();

	@Query(value = "select DISTINCT supplierContact from FilteringDataModel where supplierName = ?1")
	public List<String> getSupplierContactWithFilter(String string);


}
