package com.cg.placement.service;

import com.cg.placement.entities.Placement;

public interface IPlacementService {
	Placement addPlacement(Placement placement);
	Placement updatePlacement(Placement placement);
	Placement searchPlacement(int id);
	Placement cancelPlacement(int id);

}
