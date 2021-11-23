package com.gasbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.gasbooking.entity.SurrenderCylinder;
import com.gasbooking.service.ISurrenderCylinderService;

@Controller
public class SurrenderCylinderController {

	@Autowired
	ISurrenderCylinderService surrendercylinderservice;
	@PostMapping("/add")
	public ResponseEntity<?> updateSurrenderCylinder(@RequestBody SurrenderCylinder surrendercylinder) {
		SurrenderCylinder updatedcylinder = surrendercylinderservice.insertSurrenderCylinder(surrendercylinder);
		return new ResponseEntity<SurrenderCylinder>(updatedcylinder, HttpStatus.CREATED);
	}
}

