package PersonaPractico;

import java.time.LocalDate;
import java.time.Period;

public class main {
	public static void main (String []Args) {
		Persona p1= new Persona(34);
		//p1.setDniNameLastname(43542315,"eduardo","vegano");
		
		p1.setPeso(70);
		p1.setAltura(1.7);
		System.out.println("el indice de masa corporal es " + p1.masaCorporal()+" esta en forma: "+ p1.enForma());
		
		System.out.println(p1.setAnios());
	
		System.out.println("es el cumpleaños: "+p1.cumpleAnios());
		
		
		
	 System.out.println(p1.imprimir())	;
	 }

	
	
}
