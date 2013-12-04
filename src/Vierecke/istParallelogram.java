package Vierecke;

import java.math.*;

public class istParallelogram {

	public static void istParallelogram(double AB, double BD, double AC, double CD)
	{
		
		System.out.println(AB+" "+CD);
		System.out.println(AB+" "+BD);
		System.out.println(AC+" "+BD);
		
		if(AB==CD && BD==AC){
			System.out.println("Ist Parallelogram");
		}
		else{
			System.out.println("Ist kein Parallelogram");
		}
	}
}
asfdadfsdfsd