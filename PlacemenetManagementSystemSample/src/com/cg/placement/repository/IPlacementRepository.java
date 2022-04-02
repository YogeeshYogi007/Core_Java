package com.cg.placement.repository;

import com.cg.placement.entities.Placement;

public interface IPlacementRepository {
	public Placement addPlacement(Placement placement);
	public Placement updatePlacement(Placement placement);
	public Placement searchCollegeByPlacementId(int id);
	public Placement deletePlacement(Placement placement);
	
	public Placement addQualification(Placement placement);
	
    public abstract void beginTransaction();
	public abstract void commitTrasaction();
	void deleteplacement(int id);
}