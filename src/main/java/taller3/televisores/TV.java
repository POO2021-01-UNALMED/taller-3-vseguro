package taller3.televisores;

public class TV {
	Marca marca;
	int canal=1;
	int precio=500;
	boolean estado;
	int volumen=1;
	Control control;
	static int numTV;
	
	public TV(Marca marca, boolean estado ){ //constructor
		this.marca=marca;
		this.estado=estado;
		TV.numTV++;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca=marca;
	}
	
	public Control getControl() {
		return control;
	} 
	public void setControl(Control control) {
		this.control=control;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setVolumen(int volumen) {
		this.volumen=volumen;
	}
	
	public int getCanal() {
		return canal;
	}
	

	public void setCanal(int canal) {
		this.canal=canal;
	}
		
	public static int getNumTV() {
		return numTV;  
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	
}