package com.cg.placement.repository;

import com.cg.placement.entities.Placement;

 public interface IPlacementRepository {
	Placement addPlacement(Placement placement);
	Placement updatePlacement(Placement placement);
	Placement searchPlacement(int id);
	public Placement cancelPlacement(int id);
	void beginTransaction();
	void commitTransaction();
}
