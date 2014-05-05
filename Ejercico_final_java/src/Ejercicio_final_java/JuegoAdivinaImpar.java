package Ejercicio_final_java;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero{
	
	public JuegoAdivinaImpar(int vidas, int nume_adi) {
		super(vidas, nume_adi);
		// TODO Auto-generated constructor stub
	}

	@Override
    public boolean validaNumero(int nume_adi) {
        if(nume_adi % 2 != 0){	
           return true;
        }
        else{
        	String texto = "El numero no es impar. Selecciona otro.";
    		System.out.println(texto);
            return false;
            
        }
    }
    
    @Override
	public void muestraNombre() {
		String texto = "juego de numero impar.";
		System.out.println(texto);
	}
    
    @Override
   	public void muestraInfo() {
    	String texto = "Tienes que adivinar un numero impar entre 0 y 10. Para ello tienes 3 intentos que equivalen a 3 vidas.";
   		System.out.println(texto);
   	}

}

