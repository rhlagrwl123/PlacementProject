package com.cg.placement.client;

import com.cg.placement.entities.Placement;
import com.cg.placement.service.IPlacementService;
import com.cg.placement.service.PlacementServiceImpl;

public class client 
	{
		public static void main(String[] args) 
		{
			// Creating an object of all entity files
			Placement placement = new Placement();
			IPlacementService service = new PlacementServiceImpl();
			
			placement.setId(75845);
			placement.setName("Rahul");
			placement.setCollege("Delhi University");
			placement.setDate(12 May 2017);
			placement.setQualification("BCA");
			placement.setYear(2022);
			
			
			// One to One ( Writing data to DB in One to One Mapping
		
			service.addStudent(placement);
			
			System.out.println("one placement entry is completed");
			
			
		}

}
	
