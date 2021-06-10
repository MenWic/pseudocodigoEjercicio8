import java.util.*;

public class Ejercicio8{
	public static void main(String[] args){
		//Variables globales del algoritmo
		int num;
		String opcSalir="a";
		Scanner scanner=new Scanner(System.in);

		while(!opcSalir.equals("s")){
			num=5*(int)(Math.random()*1000);
			System.out.println("Numero multiplo de 5: "+num);
			System.out.println("Para cancelar el programa presione: s, si no, presione cualquier otra letra");
			opcSalir=scanner.nextLine();
		}
	}
}