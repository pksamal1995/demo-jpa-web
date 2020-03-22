package com.example.demojpaweb.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demojpaweb.repo.FilterRepo;

@Service
public class DropDownService {

	@Autowired
	private FilterRepo f_repo;

	public List<String> getfilteredData(String filterName, Map<String, String> filters) {

		if (!filters.isEmpty()) {

			if (filterName.equalsIgnoreCase("supplierContact")) {
				return f_repo.getSupplierContactWithFilter(filters.get("supplierName"));
			}else if (filterName.equalsIgnoreCase("geContentOwner")) {
				//return f_repo.getGeContentOwner();
			} else if (filterName.equalsIgnoreCase("geOwner")) {
			//	return f_repo.getGeOwner();
			} else if (filterName.equalsIgnoreCase("geCommodityLeader")) {
			//	return f_repo.getGeCommodityLeader();
			}
		} else if (filters.isEmpty()) {
			if (filterName.equalsIgnoreCase("supplierName")) {
				return f_repo.getSupplierNames();
			} else if (filterName.equalsIgnoreCase("supplierContact")) {
				return f_repo.getSupplierContact();
			} else if (filterName.equalsIgnoreCase("geContentOwner")) {
				return f_repo.getGeContentOwner();
			} else if (filterName.equalsIgnoreCase("geOwner")) {
				return f_repo.getGeOwner();
			} else if (filterName.equalsIgnoreCase("geCommodityLeader")) {
				return f_repo.getGeCommodityLeader();
			}
		}
		return null;
	}

}
