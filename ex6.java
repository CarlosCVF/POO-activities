import java.util.Scanner;

public class ex6 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).

		
		double D, qtD, R;
		
		System.out.printf("Digite a cotação do Dólar: ");
		D = ler.nextDouble();
		System.out.printf("Digite a quantidade de Dólares: ");
		qtD = ler.nextDouble();
		R = D*qtD;
		System.out.printf("O valor em Dólares é: %.2f", R);
	}
}