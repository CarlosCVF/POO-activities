import java.util.Scanner;

public class ex49 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*Crie um programa que solicite que o usuário entre com dois números (inicial e final).
		Ao final o programa deverá apresentar o valor total da soma de todos os números do intervalo digitado pelo usuário*/
		int soma=0;
		
		System.out.printf("Insira o numero inicial: ");
		int ni = ler.nextInt();
		System.out.printf("Insira o numero final: ");
		int nf = ler.nextInt();
		while(nf <= ni) 
		{
			System.out.printf("O numero final deve ser maior que o inicial: ");
			nf = ler.nextInt();
		}
		for(int x = ni; x <= nf; x++) 
		{
			soma+=x;
		}
		System.out.printf("A soma da sequencia de numeros entre %d e %d e: %d", ni, nf, soma);
	

	}
}
