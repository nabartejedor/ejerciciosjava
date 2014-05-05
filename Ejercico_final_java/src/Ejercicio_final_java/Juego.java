package Ejercicio_final_java;

public abstract class Juego {
	private int vidas;
	   private final int todas_vidas = 3;
	   private int record = 0;
	   
	   //public abstract void juega();

	   
	   
	   
	   public Juego(int vidas){
	 	     this.vidas = vidas;
	  }
	   
	   public int muestraVidasRestantes(){
		   return this.vidas;
	   }
	   
	   public void mostrarFinJuego(){
		   String texto = "no quedan mas vidas, fin del juego";
		   System.out.println(texto);
	   }
	      
	   
	   public void reiniciaPartida(){
		   this.vidas = this.todas_vidas;
	   }
	   
	   public void actualizaRecord(int vidas){
		   String texto = "";
		   if(vidas > this.record){
			   texto = "Has batido el record! Marca: " + vidas;
			   this.record = vidas;
			   System.out.println(texto);
		   }
		   else if(vidas == this.vidas){
			   texto = "Record igualado";
		   }
	   }
	   
	   public boolean restarVidas(){
		   this.vidas--;
		   if(this.vidas <= 0){  
		     return true;
		   }
		   else{
			   return false;
		   }
	   }
	   
	   public void anadirVidas(){
		   this.vidas++;
	   }
	   
	   
	}
