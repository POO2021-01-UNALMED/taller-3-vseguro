package taller3.televisores;

public class prueba {

	public static void main(String[] args) {
		Marca marca =  new Marca("Semsung");
		TV tv1 =  new TV(marca, true);
		
		tv1.setVolumen(5);
		tv1.volumenUp();
		
		TV tv2 =  new TV(marca, false);
		Control control =  new Control();
		control.enlazar(tv2);
		control.turnOn();
		control.volumenUp();
		
		TV tv3 =  new TV(marca, true);
		tv3.setVolumen(7);
		tv3.volumenUp();
		
		//boolean ok = false;
		
		//if(tv1.getVolumen() == 6 && tv2.getVolumen() == 2 && tv3.getVolumen() == 7) {
			//ok = true;
		
		//assertTrue(ok, "Hay un problema con los metodos y restricciones del cambio de volumen del televisor");
		 System.out.println(tv1.getVolumen());
		 System.out.println(tv2.getVolumen());
		 System.out.println(tv3.getVolumen());
		 //System.out.println(tv1.getCanal());
	
	}

}
