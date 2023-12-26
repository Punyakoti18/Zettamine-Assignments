package com.zettamine.rainfall1.dto;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;


public class RainFallReport {

	public static List<RainFall> generateRainfallReport(String filePath) {
		List<RainFall> rainfallReport = new ArrayList<RainFall>();

		try {
			InputStream fin = new FileInputStream(filePath);
			Reader reader = new InputStreamReader(fin);
			BufferedReader br = new BufferedReader(reader);

			String str;

			while ((str = br.readLine()) != null) {
				String[] rainfallData = str.split(",");

				

				while (true) {
					if (!validate(rainfallData[0])) {
						{
							System.err.println("The ZipCode is Invalid");
							break;
						}
					} else {
						RainFall ar = new RainFall(Integer.parseInt(rainfallData[0]), rainfallData[1]);

						double[] monthlyAvgRainfall = new double[rainfallData.length - 2];

						for (int i = 2; i < rainfallData.length; i++) {
							monthlyAvgRainfall[i - 2] = Double.parseDouble(rainfallData[i]);
						}

						ar.calAnnualAvgRainfall(monthlyAvgRainfall);

						rainfallReport.add(ar);
						break;
					}

				}
			}

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		return rainfallReport;
	}

	public static boolean validate(String cityPincode) {

		if (cityPincode.matches("[0-9]{5}"))
			return true;

		return false;
	}
}