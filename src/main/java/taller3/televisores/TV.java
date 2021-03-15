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
	}
	
	public Marca getMarca() {
		return marca;
	}
	void setMarca(Marca marca) {
		this.marca=marca;
	}
	
	public Control getControl() {
		return control;
	} 
	void setControl(Control control) {
		this.control=control;
	}
	
	int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	
	int getVolumen() {
		return volumen;
	}
	
	public void setVolumen(int volumen) {
		this.volumen=volumen;
	}
	
	int getCanal() {
		return canal;
	}
	

	public void setCanal(int canal) {
		this.canal=canal;
	}
	
	public static int getnumTV() {
		return numTV;   //????????????
	}
	
	void turnOn() {
		if (estado) {
			estado=true;
		}
	}
	
	void turnOff() {
		return;
	}
	
	boolean getEstado() {
		return estado;
	}
	
    void canalUp() {
    	if (estado) {
    		return;   
    	}
    	if (canal>120){
    		return;
    	}    	
    	++canal;
    }
    
    void canalDown() {
    	if (estado) {
    		return;   
    	}
    	if (canal<1) {
    		return;
    	}
    	--canal;
    }
    
    void volumenUp() {
    	if (estado) {
    		return;   
    	}
    	if (volumen>7) {
    		return;
    	}
    	++volumen;
    }
    
    void volumenDown() {
    	if (estado) {
    		return;   
    	}
    	if (volumen<0) {
    		return;
    	}
    	--volumen;
    }
}