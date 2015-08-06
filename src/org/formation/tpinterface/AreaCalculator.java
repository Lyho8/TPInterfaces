package org.formation.tpinterface;

import java.util.ArrayList;

public class AreaCalculator {
	
	public static double sumArea(ArrayList<Surface> t){
		double res = 0.0;
		for(Surface s : t){
			res+=s.getArea();
		}
		return res;
	}
	
}
