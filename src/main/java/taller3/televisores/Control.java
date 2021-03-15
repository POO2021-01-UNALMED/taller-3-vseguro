package taller3.televisores;

public class Control {
	TV tv;
	
	 public void enlazar(TV tv){
		this.tv=tv;
		tv.control=this;
	}

	void setEnlazar(TV tv) {
		this.tv=tv;
	}
	
	TV getEnlazar() {
		return tv;
	}
	
	void turnOn() {
		if (tv.estado) {
			tv.estado=true;
		}
	}
	
	void turnOff() {
		return;
	}
	
	 void canalUp() {
	    	if (tv.estado) {
	    		return;   
	    	}
	    	if (tv.canal>120){
	    		return;
	    	}    	
	    	++tv.canal;
	    }
	 
	 void canalDown() {
	    	if (tv.estado) {
	    		return;   
	    	}
	    	if (tv.canal<1) {
	    		return;
	    	}
	    	--tv.canal;
	    }
	    
	    void volumenUp() {
	    	if (tv.estado) {
	    		return;   
	    	}
	    	if (tv.volumen>7) {
	    		return;
	    	}
	    	++tv.volumen;
	    }
	    
	    void volumenDown() {
	    	if (tv.estado) {
	    		return;   
	    	}
	    	if (tv.volumen<0) {
	    		return;
	    	}
	    	--tv.volumen;
	    }
	    
	    public void setCanal(int canal) {
			this.tv.canal=canal;
		}
}
