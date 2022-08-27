package Clase_1;

public class Ejemplo_Avion {// clase Avion

	//atributos del avion 
	int capacidad;
	
	String estado;
	
	String color;
	
	String marca;
	
	//Supongamos que queremos cambiar el color del avión o preguntarle su color
	
	public void setColor(String unColor) {//metodo(son acciones que van a modificar o consultar el estado de una clase)
		color= unColor;
	}
	
	public String getColor() {
		return color;
	}
	
	//usamos un constructor sin argumentos para declarar los valores por defecto de  nuestros atributos
	
	public Ejemplo_Avion() {//<--constructor(metodo invocado para la creacion de objetos)
		//establezco valores por defecto
		capacidad=300;
		estado="en tierra";
		color="blanco";
		marca="boing";
	}
	
	public Ejemplo_Avion(int cap,String est) {//constructor con parametros
		capacidad=cap;
		estado=est;			
		//al no definir color ni marca esos atributos tomaran los valores por defecto
		
	}
	
	//Un objeto puede tener múltiples constructores todos ellos
	//deben tener una signatura diferente. Cuando se llama a un
	//constructor es cuando se decide cual se invoca.

	
	//clase       Nombre Objeto       constructor    
	
	
	public static void main(String[]args) {// uso esto solo xq quiero imprimir para entender
		Ejemplo_Avion     a234      = new Ejemplo_Avion(); //por defecto
		Ejemplo_Avion     a235      = new Ejemplo_Avion(25, "Rojo"); 
		System.out.println("el color de avion a234 es " + a234.color+" su estado es "+ a234.estado +" su marca es " +
		a234.marca +" y su capacidad es "+ a234.capacidad);
	}
}
