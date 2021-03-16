package taller3.televisores;

public class prueba {

	public static void main(String[] args) {
        TV.setNumTV(0);
		
		Marca marca =  new Marca("Semsung");
	   
		TV tv1 =  new TV(marca, true);
		TV tv2 =  new TV(marca, true);
		TV tv3 =  new TV(marca, true);
		
		System.out.print(TV.getNumTV());
	}

}
