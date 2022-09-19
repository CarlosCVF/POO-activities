import java.util.Scanner;
import java.io.IOException;

public class ex17 {
	
	  public static void main(String[] args) throws IOException 
	  {
		Scanner ler = new Scanner(System.in);
		
		//Entrar com o peso, o sexo e a altura de uma determinada pessoa.
		//Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².
		
		double a, b, imc;
		char s;
		
		System.out.printf("Digite seu sexo(F/M): ");
	    s = (char)System.in.read();
		System.out.printf("Digite a sua altura: ");
		a = ler.nextDouble();
		System.out.printf("Digite o seu peso: ");
		b = ler.nextDouble();
		imc= b/(a*a);
		if(s=='F')
		{
			if(imc<19)
				System.out.println("Abaixo do peso");
			else if(imc >=19 && imc<24)
				System.out.println("peso ideal");
			else
				System.out.println("Acima do peso");
		}
		else
		{
			if(imc<20)
				System.out.println("Abaixo do peso");
			else if(imc >= 20 && imc < 25)
				System.out.println("Peso ideal");
			else
				System.out.println("Acima do peso");
		}
	}
}