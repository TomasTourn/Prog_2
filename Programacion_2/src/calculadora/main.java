package calculadora;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class main {

	public static void main (String []Args) {
		
		int n1=50;
		int n2=10;
		operaciones op = new operaciones();//creo objeto
		
		//uso los metodos de la clase operaciones en el objeto op
		System.out.println("la resta es "+ op.restar(n1,n2));
		System.out.println("la multiplicacion es "+ op.multiplicar(n1,n2));
		System.out.println("la divicion es "+ op.dividir(n1,n2));
		System.out.println("la suma es "+op.suma(n1,n2));

		
	}
	
}
