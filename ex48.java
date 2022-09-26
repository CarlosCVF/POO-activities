import java.util.Scanner;

public class ex48 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		/*Crie um programa em que o usuário entre com um número inteiro qualquer, e o programa imprima os 20 números 
		subsequentes ao que foi digitado pelo usuário*/
		System.out.printf("Insira um numero: ");
		int n = ler.nextInt();
		for(int x = 1; x < 21; x++) 
		{
			System.out.printf("%d\n", n+x);
		}
	}
}