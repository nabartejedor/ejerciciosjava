package Ejercicio_final_java;

public class JuegoAdivinaPar extends JuegoAdivinaNumero{

	public JuegoAdivinaPar(int vidas, int nume_adi) {
		super(vidas, nume_adi);
		// TODO Auto-generated constructor stub
	}
	
    
    public boolean validaNumero(int nume_adi) {
        if(nume_adi % 2 == 0){	
           return true;
        }
        else{
         	 return false;
        }
      }
}
