package ex52;
import java.util.Scanner;

public class ex52 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
				
				Product[] listaProd = new Product[10];
				
				for (int i=0; i<=2; i++) {
					
				Product x = new Product();		
				System.out.printf("Digite o id do produto: ");
				x.id = ler.nextInt();
				System.out.printf("Digite a descricao do produto: ");
				x.descricao = ler.next();
				System.out.printf("Digite o valor do produto: ");
				x.valor = ler.nextDouble();
				System.out.printf("Digite a quantidade do produto: ");
				x.quantidade = ler.nextDouble();			
				
				listaProd[i] = x;
				}	
				
				for (int i=0; i<=2; i++) {
				if(listaProd[i].valor <100) {
					System.out.printf("id: %d Descrição:%s  Valor:%f \n\n", listaProd[i].id, listaProd[i].descricao, listaProd[i].valor);
					
				}
			}

		}
}
