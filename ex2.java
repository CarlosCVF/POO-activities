import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
		int a,A;
		
		System.out.printf("Digite o valor da aresta: ");
		a = ler.nextInt();
		A= a*a;
		System.out.printf("O valor da área do quadrado é: %d",A);
		
	}

}
