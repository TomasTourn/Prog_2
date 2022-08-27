package auto;

public class automovil {

	private String marca;
	private int km;
	private String color;
	
	public automovil() {
		marca="chevrolet";
		km=3;
		color="azul";
	}
	
	public void  set() {
		marca="audi";
		km=0;
		color="Blanco";
	}
	 

	 public String get() {
		 return "la marca es "+ marca +" tiene "+km+" km" + " y es de color "+color;
	 }
}
