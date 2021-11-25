package com.gasbooking.controller;

import java.util.InputMismatchException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gasbooking.entity.SurrenderCylinder;
import com.gasbooking.exception.CylinderNotFoundException;
import com.gasbooking.exception.SurrenderCylinderNotFoundException;
import com.gasbooking.service.ISurrenderCylinderService;

@RestController
@RequestMapping("/surrendercylinder")
public class SurrenderCylinderController {

	@Autowired
	ISurrenderCylinderService surrendercylinderservice;
	
	@PostMapping("/insert")
	public ResponseEntity<?> insertSurrenderCylinder(@RequestBody SurrenderCylinder surrendercylinder) {
			SurrenderCylinder insertedcylinder = surrendercylinderservice.insertSurrenderCylinder(surrendercylinder);
			return new ResponseEntity<SurrenderCylinder>(insertedcylinder, HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/update/{surrenderId}")
	public ResponseEntity<?> updateSurrenderCylinder(@PathVariable int surrenderId, @Valid  @RequestBody SurrenderCylinder surrendercylinder) {
		SurrenderCylinder updatedCylinder = surrendercylinderservice.updateSurrenderCylinder(surrenderId, surrendercylinder);
		return new ResponseEntity<SurrenderCylinder>(updatedCylinder, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/deleteCustomer/{surrenderId}")
	public ResponseEntity<?> deleteSurrenderCylinder(@PathVariable int surrenderId,SurrenderCylinder surrendercylinder)throws CylinderNotFoundException {
		SurrenderCylinder deletedCylinder = surrendercylinderservice.deleteSurrenderCylinder(surrenderId);
		return new ResponseEntity<SurrenderCylinder>(deletedCylinder, HttpStatus.OK);
	}
	
	@GetMapping("/count")
	public int countSurrenderCylinder( )
	{
		return surrendercylinderservice.CountSurrenderCylinders();
		
	}
	
}

