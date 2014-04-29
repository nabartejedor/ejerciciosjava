package Ejercicio_final_java;

public abstract class Juego {
   private int vidas;
   private final int todas_vidas = 5;
   private static int record = 0;
   
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
   
   public String actualizaRecord(int vidas){
	   String texto = "";
	   if(vidas > this.vidas){
		   texto = "Has batido el record! Marca: " + vidas;
		   this.vidas = vidas;
		   System.out.println(texto);
	   }
	   else if(vidas == this.vidas){
		   texto = "Record igualado";
	   }
	return texto;
   }
   
   public boolean restarVidas(){
	   this.vidas--;
	   if(this.vidas <= 0){
		 mostrarFinJuego();  
	     return false;
	   }
	   else{
		   return true;
	   }
   }
   
   public void anadirVidas(){
	   this.vidas++;
   }
   
   
}
