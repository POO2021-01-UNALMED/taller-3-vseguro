package taller3.televisores;

public class Control {
	private TV tv;
	
	 public void enlazar(TV tv){
		this.tv=tv;
		tv.control=this;
		tv.numTV++;
	}

	public void setTv(TV tv) {
		this.tv=tv;
	}
	
	public TV getTv() {
		return tv;
	}
	
	public void turnOn() {
		if (tv.estado==false) {
			tv.estado=true;
		}
	}
	
	public void turnOff() {
		if (tv.estado==true) {
			tv.estado=false;
		}
	}
	
	 public void canalUp() {
	    	if (tv.estado==false) {
	    		return;   
	    	}
	    	if (tv.canal>120){
	    		return;
	    	}    	
	    	++tv.canal;
	    }
	 
	 public void canalDown() {
	    	if (tv.estado==false) {
	    		return;   
	    	}
	    	if (tv.canal<1) {
	    		return;
	    	}
	    	--tv.canal;
	    }
	    
	  
	     public void volumenUp() {
	    	if (tv.estado==false) {
	    		return;   
	    	}
	    	if (tv.volumen>7) {
	    		return;
	    	}
	    	++tv.volumen;
	    }
	    
	    public void volumenDown() {
	    	if (tv.estado==false) {
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
