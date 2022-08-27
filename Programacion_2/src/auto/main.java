package auto;

public class main {

	public static void main(String[]Args) {
		
		automovil auto1 = new automovil();//creo objeto 1
		System.out.println(auto1.get());//obtengo objeto e imprimo
		automovil auto2= new automovil ();//creo objeto 2
		auto2.set();// cambio el valor de auto2
		System.out.println(auto2.get());
	}
	
	
}
