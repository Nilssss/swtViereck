package Vierecke;


public class IstQuadrat {

	static int PunktAX;
	static int PunktBX;
	static int PunktCX;
	static int PunktDX;
	
	static int PunktAY;
	static int PunktBY;
	static int PunktCY;
	static int PunktDY;
	
	static double AB;
	static double AC;
	static double AD;
	static double BC;
	static double BD;
	static double CD;
	
	public static void istQuadrat()
	{	
		if (AB == AC && AB == BD && AC == BD && AD == BC){
			System.out.println("Ist Quadrat");
		}
		else{
			System.out.println("Ist kein Quadrat");
		}
		
	}
	
	public static void istTrapez()
	{
		
		if(AB != CD && AC == BD && AD == BC){
			System.out.println("Ist Trapez");
		}
		else {
			System.out.println("Ist kein Trapez");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		PunktAX=Integer.parseInt(args[0]);
		PunktAY=Integer.parseInt(args[1]);
		PunktBX=Integer.parseInt(args[2]);
		PunktBY=Integer.parseInt(args[3]);
		PunktCX=Integer.parseInt(args[4]);
		PunktCY=Integer.parseInt(args[5]);
		PunktDX=Integer.parseInt(args[6]);
		PunktDY=Integer.parseInt(args[7]);
		
		AB=(((PunktBX-PunktAX)*(PunktBX-PunktAX))+((PunktBY-PunktAY)*(PunktBY-PunktAY)));
		AC=(((PunktCX-PunktAX)*(PunktCX-PunktAX))+((PunktCY-PunktAY)*(PunktCY-PunktAY)));
		AD=(((PunktDX-PunktAX)*(PunktDX-PunktAX))+((PunktDY-PunktAY)*(PunktDY-PunktAY)));
		BC=(((PunktCX-PunktBX)*(PunktCX-PunktBX))+((PunktCY-PunktBY)*(PunktCY-PunktBY)));
		BD=(((PunktDX-PunktBX)*(PunktDX-PunktBX))+((PunktDY-PunktBY)*(PunktDY-PunktBY)));
		CD=(((PunktDX-PunktCX)*(PunktDX-PunktCX))+((PunktDY-PunktCY)*(PunktDY-PunktCY)));
				
		istQuadrat();
		//istParallelogram.istParallelogram(AB,BD,AC,CD);
		istTrapez();
	}
	
}
