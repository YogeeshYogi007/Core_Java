package com.cg.placement.service;

import com.cg.placement.entities.Placement;

public interface IPlacementService {
	public Placement addPlacement(Placement placement);
	public Placement updatePlacement(Placement placement);
	public Placement searchCollegeByPlacementId(int id);
	public Placement deletePlacement(Placement placement);
	
	public Placement addQualification(Placement placement);
}