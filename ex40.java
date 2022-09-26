import java.util.Scanner;

public class ex40 {

	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);

		/*Exibir os vinte primeiros valores da série de Bergamaschi. A série: 1, 1, 1, 3, 5, 9, 17, ...*/
		int s, a = 1, b = 1, c = 1;
		for(int x = 0; x < 20; x++) 
		{
			if(x < 3) {
				System.out.printf("\n1");
			}
			else 
			{
				s = a + b + c;
				System.out.printf("\n%d",(s));
				c = b;
				b = a;
				a = s;
		ler.close();
			}
		}
	}
}
