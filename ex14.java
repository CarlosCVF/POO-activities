import java.util.Scanner;

public class ex14 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		//Entrar com o peso e a altura de uma determinada pessoa. Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².
		
		double a, p, imc;
	       
        System.out.printf("Digite a sua altura: ");
        a = ler.nextDouble();
       
        System.out.printf("Digite o seu peso: ");
        p = ler.nextDouble();
       
        imc = p / (a * a);
       
        if (imc < 20) {
            System.out.printf("Abaixo peso");
        }else if(imc < 25) {
            System.out.printf("Peso ideal");
        }
        else {
            System.out.printf("Acima do peso");
        }
    }
}
