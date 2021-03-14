package taller3.televisores;

public class TV {
	Marca marca;
	int canal=1;
	int precio=500;
	boolean estado;
	int volumen=1;
	Control control;
	static TV numTV;
	
	public TV(Marca marca, boolean estado){ //constructor
		this.marca=marca;
		this.estado=estado;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public Control getControl() {
		return control;
	} 
	
	public void setprecio(int precio) {
		this.precio=precio;
	}
	
	public void setvolumen(int volumen) {
		this.volumen=volumen;
	}
	
	public void setcanal(int canal) {
		this.canal=canal;
	}
	
	static void setnumTV(TV numTV) {
		numTV=numTV;   //????????????
	}
	
	void turnOn(boolean estado) {
		if (estado) {
			estado=true;
		}
	}
	
	void turnOff(boolean estado) {
		return;
	}
	
	boolean getEstado() {
		return estado;
	}
	
    void canalUp(int canal) {
    	if (estado) {
    		return;   
    	}
    	if (estado) {
    		return;   
    	}
    	if (canal>120){
    		return;
    	}    	
    	++canal;
    }
    
    void canalDown(int canal) {
    	if (estado) {
    		return;   
    	}
    	if (canal<-1) {
    		return;
    	}
    	--canal;
    }
    
    void volumenUp(int volumen) {
    	if (estado) {
    		return;   
    	}
    	if (volumen>7) {
    		return;
    	}
    	++volumen;
    }
    
    void volumenDown(int volumen) {
    	if (estado) {
    		return;   
    	}
    	if (volumen<0) {
    		return;
    	}
    	--volumen;
    }
}
