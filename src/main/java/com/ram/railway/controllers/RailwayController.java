package com.ram.railway.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ram.railway.entity.Railway;
import com.ram.railway.services.IRailwayServices;

@RestController
public class RailwayController {

	@Autowired
	IRailwayServices railwayservice;

	//Add Railway Booking
	@PostMapping("/railway")
	public ResponseEntity<String> addRailwayBooking(@Valid @RequestBody Railway railway) {
		railwayservice.addRailway(railway);
		return new ResponseEntity<>("Data added successfully!!", HttpStatus.CREATED);
	}
	
	//Get All Railway Bookings
	@GetMapping("/railway/viewAll")
	public List<Railway> getAllRailwayBooking() {
		StringBuilder rb = new StringBuilder();
		railwayservice.viewAllBooking().stream().forEach(t -> rb.append(t.toString()));
		return railwayservice.viewAllBooking();
	}
	
	//Get Railway Booking By Id
	@GetMapping("/railway/view/{id}")
	public Railway getRailwayBookingById(@PathVariable("id") int rid) {
		return railwayservice.viewRailwayBookingByID(rid);
	}
	
	//Update Railway Booking
	@PutMapping("/railway")
	public ResponseEntity<String> updateRailwayBooking(@Valid @RequestBody Railway railway) {

		railwayservice.updateRailway(railway);
		return new ResponseEntity<>("Data updated successfully!!", HttpStatus.ACCEPTED);
	}
	
	//Delete Railway Booking
	@DeleteMapping("/railway/delete/{RailwayId}")
	public ResponseEntity<String> deleteContact(@PathVariable("RailwayId") int rid) {
		railwayservice.removeRailway(rid);
		return new ResponseEntity<>("Deleted", HttpStatus.OK);
	}
}