import java.util.Scanner;

public class ex12 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão digitados. 
		//Se a área for maior que 100, exibir a mensagem “Terreno grande”, caso contrário, exibir a mensagem “Terreno pequeno”.
		int a,b ,A;
		System.out.printf("Digite o valor da base: ");
		b = ler.nextInt();
		System.out.printf("Digite o valor da altura: ");
		a = ler.nextInt();
		A = a*b;
		System.out.printf("Digite o valor da área é: %d\n",A);
		if(A > 100)
			System.out.printf("Terreno Grande");
		else
			System.out.printf("Terreno pequeno");
	}
}
