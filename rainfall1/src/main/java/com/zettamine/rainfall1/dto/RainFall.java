package com.zettamine.rainfall1.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RainFall {

	private int cityPincode;
	private String cityName;
	private double avgAnnualRainfall;
	
	
	public RainFall(int cityPincode, String cityName) {
		super();
		this.cityPincode = cityPincode;
		this.cityName = cityName;
	}
	
	
	
	
	public void calAnnualAvgRainfall(double[] rainfall) {
		
		double avgRainfall = 0;
		for(double rain : rainfall)
		{
			avgRainfall = avgRainfall+rain;
		}
		
		this.avgAnnualRainfall = avgRainfall/rainfall.length;
		
	}




	@Override
	public String toString() {
		
		String str = String.format("%d | %-10s | %.2f",cityPincode,cityName,avgAnnualRainfall);
		return str;
	}
	
	
}
