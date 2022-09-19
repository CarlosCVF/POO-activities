import java.util.Scanner;

public class ex13 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//Entrar via teclado com três valores distintos. Exibir o maior deles.
		int a, b, c;
		
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextInt();
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextInt();
		System.out.printf("Digite o terceiro valor: ");
		c = ler.nextInt();
		if(a>b && a>c) 
		{
			System.out.printf("O maior valor é o a = %d", a);
		}
			else if(b>a && b>c) 
			{
			System.out.printf("O maior valor é o b = %d",b);
			}
			else
			System.out.printf("O maior valor é o c = %d",c);
	}
}