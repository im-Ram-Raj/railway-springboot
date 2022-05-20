package com.ram.railway.services;

import java.util.List;

import com.ram.railway.entity.Railway;

public interface IRailwayServices {

		public Railway addRailway(Railway add);
		
		public Railway updateRailway(Railway update);
		
		public void removeRailway(int id);
		
		public List<Railway> viewAllBooking();
		
		public Railway viewRailwayBookingByID(int id);
}
