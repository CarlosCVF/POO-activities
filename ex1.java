import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a, b, A;
		System.out.printf("Digite o número o valor da base: ");
		b = ler.nextInt();
		System.out.printf("Digite o valor da altura: ");
		a = ler.nextInt();
		A = a*b;
		System.out.printf("O valor da área é %d", A);
	}

}
