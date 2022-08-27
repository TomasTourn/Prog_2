import java.time.LocalDate;

public class Persona {

	private String nombre,apellido;
	private int edad;
	
	private LocalDate fnac;
	private long dni;
	private String sexo;
	private double altura,peso;
	
	private static final double minimoMasa = 18.5;
	private static final double maxMasa = 25;
	
	public Persona(long dni) {
	  this(dni,"N","N");
	}
	public Persona(long dni, String nombre, String apellido) {
       this(dni,nombre,apellido, "femenino");
     
	}
	public Persona(long dni, String nombre, String apellido, 
			String sexo) {
		this(dni,nombre,apellido,sexo, LocalDate.of(2000, 1, 1));
		
	}
	
	public Persona(long dni, String nombre, String apellido, 
			String sexo, LocalDate fnac) {
		this(dni,nombre,apellido,sexo,fnac,1);
		
	}
	public Persona(long dni, String nombre, String apellido, 
			String sexo, LocalDate fnac, double peso) {
		this(dni,nombre,apellido,sexo,fnac,peso,1);
		
	}
	public Persona(long dni, String nombre, String apellido, 
			String sexo, LocalDate fnac, double peso, double altura) {
	    setDni(dni);	
		this.nombre = nombre;
		this.apellido = apellido;
		this.fnac = fnac;
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
	}
	
	
	
	public long getDni() {
		return dni;
	}
	
	private  void setDni(long dni) {
		if (dni>0) {
			this.dni=dni;
		}else {
			dni = 0;
		}
	}
	
	
	public String getInformacion() {
		return nombre +"-"+ apellido+"-"+dni +"-"+ sexo;
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
		return fnac;
	}
	public void setFnac(LocalDate fnac) {
		this.fnac = fnac;
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
	
	public double indiceMasaCorporal() {
		return (this.getPeso()/(this.getAltura()*this.getAltura()));
	}
	
	public boolean estaEnForma() {
		double masa = this.indiceMasaCorporal();
		return ((masa>minimoMasa)&&(masa<maxMasa));
				
	}

	
	
	
	public static void main(String[] args) {
		Persona pp = new Persona(1);
		Persona pp2 = new Persona(2, "juan", "perez");
	}
	
}