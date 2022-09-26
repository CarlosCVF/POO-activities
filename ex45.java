import java.util.Scanner;

public class ex45 {

	public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
	/*Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de números) será digitado, deverá ser positivo, mas menor que vinte. Caso a quantidade não satisfaça a restrição,
	 enviar mensagem de erro e solicitar o valor novamente. Após a digitação dos “N” valores, exibir:
	 a) O maior valor;
	 b) O menor valor;
	 c) A soma dos valores;
 	 d) A média aritmética dos valores;
	 e) A porcentagem de valores que são positivos;
	 f) A porcentagem de valores negativos;*/
        
        int N ,aux=0, aux2=0, soma=0, aux3;
        int i = 0;
		int[] a = new int[i];
        
        do 
        {
        System.out.printf("Digite o valor de N: ");
        N = ler.nextInt();
        if(N < 0 || N>20)
        {
        	System.out.println("Número inválido!!\nTente Novamente!!\n");
        }
        }while(N < 0 || N > 20);
        for(i=0; i < N;i++)
        {
        	System.out.print("Digite um valor: ");
        	a [i] = ler.nextInt();
        	if(a[i] > aux)
        	{
        		aux = a[i];
        	}
        	soma += a[i];
        	if(i==0)
        		aux2 = a[i];
        	if(a[i]<aux2)
        		aux2 = a[i];
        	aux3 = soma/N;
        }
        
	}
}
