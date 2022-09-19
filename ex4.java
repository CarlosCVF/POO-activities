import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int a, b, c, d, M;
        System.out.printf("Digite o primeiro valor: ");
        a = ler.nextInt();
        System.out.printf("Digite o segundo valor: ");
        b = ler.nextInt();
        System.out.printf("Digite o terceiro valor: ");
        c = ler.nextInt();
        System.out.printf("Digite o quarto valor: ");
        d = ler.nextInt();
        M= (a+b+c+d)/4;
        System.out.printf("O valor da média %d", M);
		}
}