package com.ram.railway.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.railway.dao.IRailwayDao;
import com.ram.railway.entity.Railway;

@Service("railway")
public class RailwayServiceImpl implements IRailwayServices {

	@Autowired
	IRailwayDao railwaydao;

	@Override
	public Railway addRailway(Railway add) {

		return railwaydao.save(add);
	}

	@Override
	public Railway updateRailway(Railway update) {

		return railwaydao.save(update);
	}

	@Override
	public void removeRailway(int id) {

		if (railwaydao.existsById(id))
			railwaydao.deleteById(id);

	}

	@Override
	public List<Railway> viewAllBooking() {

		return railwaydao.findAll();
	}

	@Override
	public Railway viewRailwayBookingByID(int id) {
		Optional<Railway> c = railwaydao.findById(id);
		if (c.isPresent())
			return c.get();
		else
			return null;
	}

	@Override
	public List<Railway> addAllRailway(List<Railway> add) {
		// TODO Auto-generated method stub
		List<Railway> response = railwaydao.saveAll(add);
		return response;
	}


}
