import java.util.Scanner;

public class ex5 {
	
	public static void main(String[] args) {
        //Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.
		Scanner ler = new Scanner(System.in);
        
        Double C, F;
        
        System.out.printf("Digite a temperatura em Celsius: ");
        C = ler.nextDouble();
        F = C*1.8 + 32;
        System.out.printf("O Valor em Fahrenheit é: %.2f",F);
	}
}