import java.util.Scanner;

public class ex16 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//Verificar se três valores quaisquer (A, B, C) que serão digitados formam ou não um triângulo retângulo.
		//Lembre-se que o quadrado da hipotenusa é igual a soma dos quadrados dos catetos.
		int A, B, C, T;
		
		System.out.print("Digite o primeiro número: ");
		A = ler.nextInt();
		System.out.print("Digite o segundo número: ");
		B = ler.nextInt();
		System.out.print("Digite o terceiro número: ");
		C = ler.nextInt();
		if(A>B && A>C)
		{
			T= B*B+C*C;
			A=A*A;
			if(T==A)
				System.out.println("É um triângulo retângulo");
			else
				System.out.println("Não é um triângulo retângulo");
		}
		if(B>A && B>C)
		{
			T= A*A+C*C;
			B=B*B;
			if(T==B)
				System.out.println("É um triângulo retângulo");
			else
				System.out.println("Não é um triângulo retângulo");
		}
		if(C>B && C>A)
		{
			T= B*B+A*A;
			C=C*C;
			if(T==C)
				System.out.println("É um triângulo retângulo");
			else
				System.out.println("Não é um triângulo retângulo");
		}
		/*if(A+B<C || B+C<A || A+C<B)
			System.out.println("É um triângulo");
		else
			System.out.println("Não é um triângulo");*/
	}
}