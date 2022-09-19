import java.util.Scanner;

public class ex15 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*A partir de três valores que serão digitados, verificar se formam ou não um triângulo. 
		//Em caso positivo, exibir sua classificação: “Isósceles, escaleno ou eqüilátero”.
		//Um triângulo escaleno possui todos os lados diferentes, o isósceles, dois lados iguais e o eqüilátero, todos os lados iguais.
		//Para existir triângulo é necessário que a soma de dois lados quaisquer seja maior que o outro, isto, para os três lados.
		um de seus lados deve ser maior que o valor absoluto (módulo) da diferença dos outros dois lados e menor que a soma dos outros dois lados*/
		
		int a, b ,c;
		
		do
		{
			System.out.printf("Digite o primeiro valor");
			a = ler.nextInt();
			System.out.printf("Digite o segundo valor");
			b = ler.nextInt();
			System.out.printf("Digite o terceiro valor");
			c = ler.nextInt();
		}while(a+b<c || b+c<a || a+c<b);
		if(a==b && a==c)
		{
			System.out.printf("O triângulo é equilátero");
		}
		else if(a!=b && a!=c)
		{
			System.out.printf("O triângulo é escaleno");
		}
		else
		{
			System.out.println("O triângulo é isóceles");
		}
	}
}