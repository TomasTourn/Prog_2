package personaVideo;

public class Persona {

	int edad;
	String nombre;
	int altura;
	
	public Persona(int edad,String nombre, int altura) {//creo constructor con parametros que voy a llenar en el main
		
		// al usar this aclaro que la variable a la que hago referencia es el atributo y no el parametro 
		this.edad =edad;
		this.nombre=nombre;
		this.altura=altura;
	}
	
	public String data () {
		return "la edad es "+edad+" se llama "+nombre +"  y mide "+altura;
	}
	}
