package com.zettamine.rainfall1.services;

import java.util.List;

import com.zettamine.rainfall1.dao.RainFallDAO;
import com.zettamine.rainfall1.dao.RainFallDAOImpl;
import com.zettamine.rainfall1.dto.RainFall;

public class RainfallServices {

	RainFallDAO dao;
	public RainfallServices() {
		dao = new RainFallDAOImpl();
	}

	
	public void addRainFall(List<RainFall> list) {

		int i = 0;
		int n = 0;
		while(i<list.size())
		{
			RainFall anr = list.get(i);
			n = n + dao.addRainFall(anr.getCityPincode(), anr.getCityName(), anr.getAvgAnnualRainfall());
			i++;
		}	
		
		if(n>0)
		{
			System.out.println("##### Added succesfully #####");
		}
		else
		{
			System.out.println("##### Operation Failed ####");
		}
	}

	
	public void getMaxRainFall() {
		
		List<RainFall> maxRainfall = dao.getMaxRainFall();
		
		System.out.println(" The Following Cities with highest rainfall.");
		for(RainFall rain : maxRainfall)
		{
			System.out.println(rain);
		}
		
	}


}