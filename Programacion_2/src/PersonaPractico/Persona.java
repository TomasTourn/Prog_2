package PersonaPractico;

import java.time.LocalDate;
import java.time.Period;
public class Persona {

	
	private String nombre,apellido,sexo;
	private int edad;
	private double altura,peso;//altura en metros
	private LocalDate fecha,fechaActual=LocalDate.now();
	private long dni;
	private final double minMasa=18;
	private final double maxMasa=25;
	private  Period periodo;
	private int anios,mayorEdad=18,edadVotar=16;
	
	
	String mesActual;
	
	public Persona(long dni) {
		this(dni,"N","N");
	}
	
	public Persona (long dni, String nombre, String apellido) {
		this(dni,nombre,apellido,"femenino");
	}
	
	public Persona (long dni,String nombre,String apellido,String sexo) {
		this(dni,nombre,apellido,sexo,1);
	}
	public Persona (long dni,String nombre,String apellido, String sexo,double peso) {
		this(dni,nombre,apellido,sexo,peso,1);
	}
	public  Persona (long dni,String nombre,String apellido, String sexo, double peso, double altura) {
		this(dni,nombre,apellido,sexo,peso,altura,LocalDate.of(2000, 1, 1));
	}
	public Persona (long dni,String nombre,String apellido,String sexo,double peso,double altura, LocalDate fecha ) {
		this(dni,nombre,apellido,sexo,peso,altura,LocalDate.of(2000, 1, 1),1);
	}
	public Persona (long dni,String nombre,String apellido,String sexo,double peso,double altura, LocalDate fecha,int edad ) {
		setDni(dni);
		this.dni=dni;
		this.nombre=nombre;
		this.apellido=apellido;
		this.sexo=sexo;
		this.peso=peso;
		this.altura=altura;
		this.fecha=fecha;
		this.edad=edad;
	}
	
	public void setDni(long dni) {
		if(dni>0) {
			this.dni=dni;
		}
		else {
			this.dni=0;		
			}
	}
	
	
	public long getDni() {
		return dni;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		
			this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public LocalDate getFnac() {
		return fecha;
	}
	public void setFnac(LocalDate fnac) {
		this.fecha = fnac;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public String imprimir() {
		return  "dni: "+ dni+ " nombre: "+ nombre +" apellido "+apellido+" sexo: "+sexo+"  peso "+peso+" altura "+altura+" fecha "+fecha;
	}
	
	public double masaCorporal() {//calculo masa corporal (peso/altura al cuadrado)
		return (this.getPeso()/(this.getAltura()*this.getAltura()));	
		}
	
	public boolean enForma() {
		double masa= this.masaCorporal();//llamo al metodo para calcular la masa 
		return ((masa>minMasa)&&(masa<maxMasa));//si cumple estas condiciones retorno true
	}
	
	
	//porque no funciona con 3 metodos? como llamo a getPeriodo dentro de setAnios?
	/*
	public void getPeriodo() {
		this.periodo=Period.between(fecha, fechaActual);
	}
	
	public void setAnios() {
		
		this.anios=periodo.getYears();
	}
	public void setAnios2(){
		*this.anios=this.getPeriodo()*
		return anios.getYears()
	}
	
	public int getAnios() {
		return anios;
	}*/
	
	public int setAnios() {//checkear si esta bien, tenia 3 metodos hechos separados y no funcionaba
		//con period calculo la diferencia entre fecha y fecha actual 
		this.periodo=Period.between(fecha, fechaActual);
		this.anios=periodo.getYears();//obtengo los años
		return anios;
	}
	
	//quiero saber si es su cumpleaños
	
	//ya tengo la fecha de nacimiento y la actual
	
	//obtengo dia y mes de ambos
	// si ambos son iguales es true
	
    public boolean cumpleAnios(){
    	return((this.fecha.getMonth())==(this.fechaActual.getMonth())&&((this.fecha.getDayOfMonth())==(this.fechaActual.getDayOfMonth())));
    }
    
    public int getEdadF() {
    	return (this.fecha.getYear()-(this.fechaActual.getYear()));
    }
    
   public boolean esMayor() {
	   return(this.getEdadF()>=mayorEdad);
   }
   public boolean puedeVotar() {
	   return(this.getEdadF()<=edadVotar);
   }
	public boolean esCoherente() {
		return(this.getEdadF()==this.getEdad());
	}
	
}
