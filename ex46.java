import java.util.Scanner;

public class ex46 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		/*Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de números) será digitado, deverá ser positivo, 
		mas menor que vinte. Caso a quantidade não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. 
		Após a digitação dos “N” valores, exibir:
		a) O maior valor;
		b) O menor valor;
		c) A soma dos valores;
		d) A média aritmética dos valores;
		e) A porcentagem de valores que são positivos;
		f) A porcentagem de valores negativos;
		Após exibir os dados, perguntar ao usuário se deseja ou não uma nova execução do programa.
		Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o programa em função dessa resposta.*/
		Character resposta;
		do
		{
			int a = 0;
			double n, M = 0, m = 0, media = 0, percNeg = 0, s = 0;
			System.out.printf("Quantos numeros serão inseridos?: ");
			a = ler.nextInt();
			while(a < 1 || a > 20) 
			{
				System.out.printf("Tente novamente!!\nValor inválido!! insira entre 1 e 20: ");
				a = ler.nextInt();
			}
			for(int x = 0; x < a; x++) 
			{
				System.out.printf("Insira um numero: ");
				n = ler.nextDouble();
				if(n > M || x == 0)
				{
					M = n;
				}
				if(n < m || x == 0)
				{
					m = n;
				}
				if(n < 0)
				{
					percNeg += 1;
				}
				s += n; 
			}
			media = media/a;
			System.out.printf("O maior valor e: %.2f\n", M);
			System.out.printf("O menor valor e: %.2f\n", m);
			System.out.printf("A soma dos valores e: %.2f\n", s);
			System.out.printf("A media e: %.2f\n", media);
			System.out.printf("A porcentagem dos valores positivos e: %.2f%%\n", ((n-percNeg)*100)/n);
			System.out.printf("A porcentagem dos valores negativos e: %.2f%%\n", (percNeg*100)/n);
			System.out.printf("Deseja continuar o programa?(S/N): ");
			resposta = ler.next().charAt(0);
			while(resposta != 's' && resposta != 'S' && resposta != 'n' && resposta != 'N') 
			{
				System.out.printf("Insira apenas as respostas S para sim ou N para não\n");
				resposta = ler.next().charAt(0);
			}
		}
		while(resposta == 's' || resposta == 'S');
		System.out.printf("PROGRAMA FINALIZADO!");

	}

}
