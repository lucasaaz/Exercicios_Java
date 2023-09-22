//Pacote
package TrocoSupermercado;
//Importar
import java.util.Scanner;

public class TrocoSuper {

	public static void main(String[] args) {
		//Ler da tela
		try(Scanner teclado = new Scanner(System.in)){
	
			//Apresentação
			System.out.println("\n ---- CAIXA Supermerdados BH ----");
			
			//Entrada do valor da compra
			System.out.printf("\n Total a pagar: ");
			float valCompra = teclado.nextFloat();
			
			//Entrada do valor pago em dinheiro
			System.out.printf(" Valor pago: ");
			float valDinheiro = teclado.nextFloat();
			
			//Valor do troco
			float troco = 0;
			troco = valDinheiro - valCompra;
			
			//Separar notas das moedas
			int    partInt = 0;
			float partFrac = 0;
			partInt = (int)troco;
			partFrac = troco - partInt;
			
			//Contar notas e moeda de um real
			int    nota200 = 0;
			int valNota200 = 200;
			int    nota100 = 0;
			int valNota100 = 100;
			int     nota50 = 0;
			int  valNota50 = 50;
			int     nota20 = 0;
			int  valNota20 = 20;
			int     nota10 = 0;
			int  valNota10 = 10;
			int      nota5 = 0;
			int   valNota5 = 5;
			int      nota2 = 0;
			int   valNota2 = 2;
			int     moeda1 = 0;
			int  valMoeda1 = 1;
			boolean finish = false;
			
			
			do {
			if(partInt >= valNota200) {
				nota200 = partInt / valNota200; 
				partInt = partInt - (valNota200*nota200);
			}else {
				if(partInt >= valNota100) {
					nota100 = partInt / valNota100; 
					partInt = partInt - (valNota100*nota100);
				}else {
					if(partInt >= valNota50) {
						nota50 = partInt / valNota50; 
						partInt = partInt - (valNota50*nota50);
					}else {
						if(partInt >= valNota20) {
							nota20 = partInt / valNota20; 
							partInt = partInt - (valNota20*nota20);
						}else {
							if(partInt >= valNota10) {
								nota10 = partInt / valNota10; 
								partInt = partInt - (valNota10*nota10);
							}else {
								if(partInt >= valNota5) {
									nota5 = partInt / valNota5; 
									partInt = partInt - (valNota5*nota5);
								}else {
									if(partInt >= valNota2) {
										nota2 = partInt / valNota2; 
										partInt = partInt - (valNota2*nota2);
									}else {
										if(partInt >= valMoeda1) {
											moeda1 = partInt / valMoeda1; 
											partInt = partInt - (valMoeda1*moeda1);											
										}else {
											finish = true;
										}
									}
								}	
							}
						}
					}
				}
			}
			}while( finish == false);
			
			//Contar moedas (execeto um real)
			int     moeda50 = 0;
			float  valMoeda50 = 0.50f;
			int     moeda25 = 0;
			float  valMoeda25 = 0.25f;
			int     moeda10 = 0;
			float  valMoeda10 = 0.10f;
			int      moeda5 = 0;
			float   valMoeda5 = 0.05f;
			int     moeda01 = 0;
			float  valMoeda01 = 0.01f;
			boolean finish2 = false;
			
			do {
			if(partFrac >= valMoeda50) {
				moeda50 = (int)(partFrac / valMoeda50); 
				partFrac = partFrac - (valMoeda50*moeda50);
			}else {
				if(partFrac >= valMoeda25) {
					moeda25 = (int)(partFrac / valMoeda25); 
					partFrac = partFrac - (valMoeda25*moeda25);
				}else {
					if(partFrac >= valMoeda10) {
						moeda10 = (int)(partFrac / valMoeda10); 
						partFrac = partFrac - (valMoeda10*moeda10);
					}else {
						if(partFrac >= valMoeda5) {
							moeda5 = (int)(partFrac / valMoeda5); 
							partFrac = partFrac - (valMoeda5*moeda5);
						}else {
							if(partFrac >= valMoeda01) {
								moeda01 = (int)(partFrac / valMoeda01); 
								partFrac = partFrac - (valMoeda01*moeda01);
							}else {
								finish2 = true;
							}
						}
					}	
				}	
			}
			}while( finish2 == false);
			
			//Saida
			System.out.printf("\n Valor do troco: %.2f", troco);
			
			//Ajuda no troco
			boolean  ajudaTroco = false;
			boolean     finish3 = false;
			boolean     finish4 = false;
			int     ajudaTroco3 = 0;
			char    ajudaTroco2;
			
			System.out.printf("\n Ajuda no troco: [s/n] ");
			ajudaTroco2 = teclado.next().charAt(0);
			System.out.printf("\n");
			
			if( ajudaTroco2 == 's' || ajudaTroco2 == 'S'  ) {
				ajudaTroco = true;
			}
				
			if( ajudaTroco == true) {
				
				do {
					if(nota200 > 0 ) {
						System.out.println(" Nota(s)  de 200: " + nota200);
						nota200 = 0;
					}else {
						if(nota100 > 0) {
							System.out.println(" Nota(s)  de 100: " + nota100);
							nota100 = 0;
						}else {
							if(nota50 > 0) {
								System.out.println(" Nota(s)  de  50: " + nota50);
								nota50 = 0;
							}else {
								if(nota20 > 0) {
									System.out.println(" Nota(s)  de  20: " + nota20);
									nota20 = 0;
								}else {
									if(nota10 > 0) {
										System.out.println(" Nota(s)  de  10: " + nota10);
										nota10 = 0;
									}else {
										if(nota5 > 0) {
											System.out.println(" Nota(s)  de   5: " + nota5);
											nota5 = 0;
										}else {
											if(nota2 > 0) {
												System.out.println(" Nota(s)  de   2: " + nota2);
												nota2 = 0;
											}else {
												if(moeda1 > 0) {
													System.out.println(" Moeda(s) de 1,00: " + moeda1);
													moeda1 = 0;
												}else {
													finish3 = true;
												}
											}
										}	
									}
								}
							}
						}
					}
					}while( finish3 == false);	
				
				do {
					if(moeda50 > 0 ) {
						System.out.println(" Moeda(s) de 0,50: " + moeda50);
						moeda50 = 0;
					}else {
						if(moeda25 > 0) {
							System.out.println(" Moeda(s) de 0,25: " + moeda25);
							moeda25 = 0;
						}else {
							if(moeda10 > 0) {
								System.out.println(" Moeda(s) de 0,10: " + moeda10);
								moeda10 = 0;
							}else {
								if(moeda5 > 0) {
									System.out.println(" Moeda(s) de 0,05: " + moeda5);
									moeda5 = 0;
								}else {
									if(moeda01 > 0) {
										System.out.println(" Moeda(s) de 0,01: " + moeda01);
										moeda01 = 0;
									}else {
										finish4 = true;
										System.out.println("\n Finalizado com Sucesso!!");
									}
								}
							}
						}
					}
					}while( finish4 == false);	
		
			}else {
				System.out.println(" Finalizado com Sucesso!!");
			}
			
		}//end Try
		
	}//end Main
	
}//end Class
