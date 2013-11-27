package Vierecke;


public class IstQuadrat {

	static double PunktAX;
	static double PunktBX;
	static double PunktCX;
	static double PunktDX;
	
	static double PunktAY;
	static double PunktBY;
	static double PunktCY;
	static double PunktDY;
	
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
	
		
	public static void main(String[] args) {
		PunktAX=Integer.parseDouble(args[0]);
		PunktAY=Integer.parseDouble(args[1]);
		PunktBX=Integer.parseDouble(args[2]);
		PunktBY=Integer.parseDouble(args[3]);
		PunktCX=Integer.parseDouble(args[4]);
		PunktCY=Integer.parseDouble(args[5]);
		PunktDX=Integer.parseDouble(args[6]);
		PunktDY=Integer.parseDouble(args[7]);
		
		AB=(((PunktBX-PunktAX)*(PunktBX-PunktAX))+((PunktBY-PunktAY)*(PunktBY-PunktAY)));
		AC=(((PunktCX-PunktAX)*(PunktCX-PunktAX))+((PunktCY-PunktAY)*(PunktCY-PunktAY)));
		AD=(((PunktDX-PunktAX)*(PunktDX-PunktAX))+((PunktDY-PunktAY)*(PunktDY-PunktAY)));
		BC=(((PunktCX-PunktBX)*(PunktCX-PunktBX))+((PunktCY-PunktBY)*(PunktCY-PunktBY)));
		BD=(((PunktDX-PunktBX)*(PunktDX-PunktBX))+((PunktDY-PunktBY)*(PunktDY-PunktBY)));
		CD=(((PunktDX-PunktCX)*(PunktDX-PunktCX))+((PunktDY-PunktCY)*(PunktDY-PunktCY)));
				
		istQuadrat();
		//istParallelogram.istParallelogram(AB,BD,AC,CD);
		ist 
	}
	
}
