import java.util.Scanner;

public class ex44 {

	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
	/*Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de erro, se necessário. Após a digitação, exibir:
	a) O maior valor;
	b) A soma dos valores;
	c) A média aritmética dos valores;*/

		int a[] = new int[10];
		int i=0;
		int d=0, b=0, c=0;
		for(i=0;i<10;i++)
        {
        	do 
        	{
            	System.out.print("Digite um valor positivo: ");
            	a [i] = ler.nextInt();
            	if(a[i] < 0)
            		System.out.println("Número inválido!!\nTente Novamente!!\n");
			} while (a[i] < 0);
        	if(a[i] > d)
        	{
        		d = a[i];
        	}
        	b += a[i];
        }
        
        System.out.printf("O maior valor é: %d\n", d);
        System.out.printf("O valor da soma é: %d\n", b);
        c = b/10;
        System.out.printf("O valor da média aritmética é: %d", c);
		
	}
}
