package com.cg.placement.client;

import java.time.LocalDate;

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
			placement.setDate(LocalDate.parse("2022-05-04"));
			placement.setQualification("BCA");
			placement.setYear(2022);
			
			
			// One to One ( Writing data to DB in One to One Mapping
		
			service.addPlacement(placement);
			
			System.out.println("one placement entry is completed");
			
			
		}

}
	
