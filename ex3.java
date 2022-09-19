import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int b, a, A;
        
        System.out.printf("Digite a base do triângulo: ");
        b = ler.nextInt();
        System.out.printf("Digite a altura do triângulo: ");
        a = ler.nextInt();
        A = (b*a)/2;
        System.out.printf("O valor da área do triângulo é: %d",A);
	}
}
