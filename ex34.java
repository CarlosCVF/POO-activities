package lista_4e5;

import java.util.Scanner;

public class ex34 {

	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);

		/*Exibir a tabuada do número cinco no intervalo de um a dez.*/
		int a, i;
		for(i=1;i<=10;i++)
		{
			a = 5*i;
			System.out.print(a);
			System.out.print("\n");
		}
	}
}