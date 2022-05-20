package com.cg.placement.service;

import com.cg.placement.entities.Placement;
import com.cg.placement.repository.IPlacementRepository;
import com.cg.placement.repository.PlacementRepositoryImpl;

public class PlacementServiceImpl implements IPlacementService {
private IPlacementRepository dao;
	
	
	public PlacementServiceImpl() {
		dao = new PlacementRepositoryImpl();
	}

	public Placement addPlacement(Placement placement) {
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	public Placement updatePlacement(Placement placement) {
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	public Placement searchPlacement(int id) {
		Placement placement = dao.searchPlacement(id);
		return placement;
	}

	public Placement cancelPlacement(int id) {
		
		dao.beginTransaction();
		dao.cancelPlacement(id);
		dao.commitTransaction();
		return null;
	}

}
