import java.util.Scanner;

public class ex25 {
	
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
	/* Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar. Utilize o operador %*/
		
		int a, r;
		System.out.print("Digite o um número: ");
		a = ler.nextInt();
		r= a%2;
		if(r == 0)
		{
			System.out.print("O valor é par");
		}
		else
			System.out.print("O valor é ímpar");
	}
}