import java.util.Scanner;

public class ex42 {

	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);

		/*Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. O valor “N” será digitado, deverá ser positivo, mas menor que cinqüenta.
		Caso o valor não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente.*/
		int n;
		float a = 0, y = 1;
		
		do {
		System.out.printf("Informe o tamanho da sequencia (Sendo o numero positivo e menor que 50): ");
		n = ler.nextInt();
		}
		while(n < 0 || n > 49);
		
		for(int x = 0; x < n; x++) {
			a += y/(y+1);
			y++;
		}
		
		System.out.printf("A soma dos primerios %d numeros da sequencia é: %.2f", n, a);
		
		
		ler.close();
	}
}
