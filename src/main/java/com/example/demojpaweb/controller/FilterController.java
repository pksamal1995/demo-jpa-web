package com.example.demojpaweb.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demojpaweb.service.DropDownService;

@RestController
@RequestMapping("/filter")
public class FilterController {

	@Autowired
	private DropDownService dropDownService;

	@PostMapping("/{filterName}")
	public ResponseEntity<List<String>> getDropfilter(@PathVariable("filterName") String filterName,
			@RequestBody Map<String, String> filters) {
		List<String> responseBody = dropDownService.getfilteredData(filterName, filters);
		if (responseBody != null) {
			return new ResponseEntity<List<String>>(responseBody, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<String>>(Arrays.asList(), HttpStatus.NO_CONTENT);
		}

	}
}
