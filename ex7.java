import java.util.Scanner;

public class ex7 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor referente ao pagamento da somatória destes valores.
		//Calcular e exibir o troco que deverá ser devolvido.

		double a, b, c, d, e, p, t, S;
		
        System.out.printf("Digite o valor do primeiro produto: ");
        a = ler.nextDouble();
        System.out.printf("Digite o valor do segundo produto: ");
        b = ler.nextDouble();
        System.out.printf("Digite o valor do terceiro produto: ");
        c = ler.nextDouble();
        System.out.printf("Digite o valor do quarto produto: ");
        d = ler.nextDouble();
        System.out.printf("Digite o valor do quinto produto: ");
        e = ler.nextDouble();
        S = a + b + c + d + e;
        System.out.printf("Qual o valor do pagamento? ");
        p = ler.nextDouble();
        t = p - S;
        System.out.printf("O valor do troco é: %.2f",t);
	}
}