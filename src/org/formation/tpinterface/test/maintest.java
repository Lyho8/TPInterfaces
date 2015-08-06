package org.formation.tpinterface.test;

import java.util.ArrayList;
import java.util.Iterator;

import org.formation.tpinterface.*;

public class maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Surface> t = new ArrayList<Surface>();
		t.add(new Circle(5));
		t.add(new Square(2));
		t.add(new Rectangle(3,4));
		
		((Circle) t.get(0)).printMe("Bonjour");
		System.out.println("Somme des surfaces : " + org.formation.tpinterface.AreaCalculator.sumArea(t) + " cm�.");
		
		//Plante : on ne modifie pas une liste pendant qu'on la parcourt � moins d'utiliser un it�rateur
		/*for(Surface s : t){
			if(s.getArea() > 10.0){
				System.out.println("Avant : " + t.size());
				t.remove(s);
				System.out.println("Apr�s : " + t.size());
			}
		}*/
		
		//List<Surface> l = new ArrayList<>(Arrays.asList(tableau de surfaces));
		
		for(Iterator<Surface> iterator = t.iterator(); iterator.hasNext();){
			Surface s = iterator.next();
			if(s.getArea() > 10.0){
				System.out.println("Avant : " + t.size());
				iterator.remove();
				System.out.println("Apr�s : " + t.size());
			}
		}
		
	}

}
