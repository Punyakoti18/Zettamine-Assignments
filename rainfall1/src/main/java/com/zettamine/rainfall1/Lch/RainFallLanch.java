package com.zettamine.rainfall1.Lch;

import com.zettamine.rainfall1.dto.RainFallReport;
import com.zettamine.rainfall1.services.RainfallServices;

public class RainFallLanch {

	public static void main(String[] args) {
		

				RainfallServices services = new RainfallServices();
				
				services.addRainFall(RainFallReport.generateRainfallReport("D:\\JavaWorkSpace\\RainFall\\src\\main\\resources\\AllCityMonthlyRainfall.txt"));
				
				services.getMaxRainFall();
			}



}
