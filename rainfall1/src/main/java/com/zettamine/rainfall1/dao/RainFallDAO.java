package com.zettamine.rainfall1.dao;

import java.util.List;

import com.zettamine.rainfall1.dto.RainFall;

public interface RainFallDAO 
{
    int addRainFall(int pincode, String cityName, double avgRainfall);
	List<RainFall> getMaxRainFall();

}
