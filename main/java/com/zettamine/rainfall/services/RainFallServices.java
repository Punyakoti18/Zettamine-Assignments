package com.zettamine.rainfall.services;

import java.util.List;

import com.zettamine.rainfall.dao.RainFallDAOImplementation;
import com.zettamine.rainfall.data.RainFall;

public class RainFallServices 
{
	RainFallDAOImplementation rainImpl;
	
	

	public RainFallServices() {
		rainImpl=new RainFallDAOImplementation();
	}

	public void addRainFall(RainFall rain)
	{
		int row=rainImpl.addRainFall(rain);
		if(row>0)
		{
			System.out.println("Row gets Added in the DataBase.");
		}
		else
		{
			System.out.println("Adding gets Falied.");
		}
	}
	
	public void gettingRainFalls()
	{
		List<RainFall> list=rainImpl.gettingRainFalls();
		
		for (RainFall ele : list) 
		{
			System.out.printf("%-10d |%-15s |%-5 0.2f |%-5 0.2f |%-5 0.2f |%-4 0.2f |%-5 0.2f |%-5 0.2f"
					+ "%-5 0.2f |%-5 0.2f |%-5 0.2f |%-5 0.2f |%-5 0.2f |%-5 0.2f",ele.getCityPin(),ele.getCityName(),ele.getJan(),ele.getFeb(),ele.getMar(),ele.getApr(),
					ele.getMay(),ele.getJun(),ele.getJul(),ele.getAug(),ele.getSep(),ele.getOct(),ele.getNov(),ele.getDec());
		
		}
	}
	
	public void getAvg(Integer cityPin)
	{
		Float avg=rainImpl.getAvg(cityPin);
		System.out.println("The Average RainFall of CityPin = "+cityPin+" is "+avg);
	}
	
	public  void close()
	{
		rainImpl.close();
	}

}
