package com.cg.placement.service;

import com.cg.placement.entities.College;
import com.cg.placement.entities.Placement;
import com.cg.placement.entities.User;
import com.cg.placement.repository.CollegeRepositoryImpl;
import com.cg.placement.repository.ICollegeRepository;

public class CollegeServiceImpl implements ICollegeService{
	//Step 1 : Establishing connection between Service and Repo
		private ICollegeRepository dao;

		public CollegeServiceImpl() 
		{
			dao = new CollegeRepositoryImpl();
		}
	@Override
	public College addCollege(College college) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
	    dao.addCollege(college);
	    dao.commitTransaction();
		return college;
	}

	@Override
	public College updateCollege(College college) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
	    dao.updateCollege(college);
	    dao.commitTransaction();
		return college;
	}

	@Override
	public College searchCollege(int id) {
		College college = dao.searchCollege(id);
		return college;
	}

	@Override
	public Boolean deleteCollege(int id) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
	    dao.deleteCollege(id);
	    dao.commitTransaction();
		return false;
	}
	@Override
	public Boolean schedulePlacement(Placement placement) {
		dao.beginTransaction();
	    dao.schedulePlacement(placement);
	    dao.commitTransaction();
		return true;
	}
	

	

}