package com.zettamine.rainfall.dao;

import java.util.List;

import com.zettamine.rainfall.data.RainFall;

public interface RainfallDAO 
{
	Integer addRainFall(RainFall rain);
	
	List<RainFall> gettingRainFalls();
	
	Float getAvg(Integer cityPin);
	
	void close();

}
