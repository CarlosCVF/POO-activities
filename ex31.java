package lista_4e5;
import java.util.Scanner;

public class ex31 {
	
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);

		/*Criar uma rotina de entrada que aceite somente um valor positivo*/
		
		double a;
		
		do {
			System.out.print("Digite qualquer valor: ");
			a = ler.nextDouble();
		}while(a<0);
	}
}