package TrocoMoedas;
import java.util.Scanner;

public class ContarMoedas {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			//Entrada
			System.out.printf("Quantidade de dinheiro em centavos: ");
			int totDinheiro = teclado.nextInt();
			
			//Variaveis
			int moeda_100 = 0;
			int valMoeda_100 = 100;
			int moeda_50 = 0;
			int valMoeda_50 = 50;
			int moeda_25 = 0;
			int valMoeda_25 = 25;
			int moeda_10 = 0;
			int valMoeda_10 = 10;
			int moeda_5 = 0;
			int valMoeda_5 = 5;
			int moeda_1 = 0;
			int valMoeda_1 = 1;
			boolean finish = false;

			//Ação
			do {
			if(totDinheiro >= valMoeda_100) {
				moeda_100 = totDinheiro / valMoeda_100; 
				totDinheiro = totDinheiro - (valMoeda_100*moeda_100);
			}else {
				if(totDinheiro >= valMoeda_50) {
					moeda_50 = totDinheiro / valMoeda_50;
					totDinheiro = totDinheiro - (valMoeda_50*moeda_50);
				}else {
					if(totDinheiro >= valMoeda_25) {
						moeda_25 = totDinheiro / valMoeda_25;
						totDinheiro = totDinheiro - (valMoeda_25*moeda_25);
					}else {
						if(totDinheiro >= valMoeda_10) {
							moeda_10 = totDinheiro / valMoeda_10;
							totDinheiro = totDinheiro - (valMoeda_10*moeda_10);
						}else {
							if(totDinheiro >= valMoeda_5) {
								moeda_5 = totDinheiro / valMoeda_5;
								totDinheiro = totDinheiro - (valMoeda_5*moeda_5);
							}else {
								if(totDinheiro >= valMoeda_1 || totDinheiro == 0) {
									moeda_1 = totDinheiro / valMoeda_1;
									totDinheiro = totDinheiro - (valMoeda_1*moeda_1);
									finish = true;
								}
							}
						}
					}
				}
			}
			}while( finish == false);
			
			
			//Saida
			System.out.println("Moeda(s) de  1 real: " + moeda_100);
			System.out.println("Moeda(s) de 50 centavos: " + moeda_50);
			System.out.println("Moeda(s) de 25 centavos: " + moeda_25);
			System.out.println("Moeda(s) de 10 centavos: " + moeda_10);
			System.out.println("Moeda(s) de  5 centavos: " + moeda_5);
			System.out.println("Moeda(s) de  1 centavos: " + moeda_1);
		}
	}

}
