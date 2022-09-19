import java.util.Scanner;

public class ex9 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
		//Entrar via teclado, com dois valores distintos. Exibir o menor deles.
		
		int a, b;
		
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextInt();
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextInt();
		if(a<b)
			System.out.printf("O maior valor é o %d", a);
		else
			System.out.printf("O maior valor é o %d",b);
	}
}