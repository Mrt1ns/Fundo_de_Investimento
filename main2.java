package Investimento;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		float cota;
		float VDI; // Valor de Investimento
		float rendimento;
		float CVI;
		float RD;
		
		Scanner ler = new Scanner (System.in);

		System.out.println("Bem vindo ao investimento");
		
		System.out.print("Digite o valor que deseja investir: ");
		
		VDI = (float)ler.nextFloat();
		
		System.out.printf("O valor que deseja investir é %.2f", VDI);
		
		System.out.println(" ");
		
		System.out.print("Digite o valor da cota: ");
		
		cota = (float)ler.nextFloat();
		
		System.out.printf("O valor da cota é %.2f", cota);
		
		CVI = VDI / cota;
		
		System.out.println(" ");
		
		System.out.printf("A quantidade de cotas que conseguiram comprar é %.2f", CVI);
		
		System.out.println(" ");
		
		System.out.print("Digite o valor de rendimento deste fundo: ");
		
		rendimento = (float)ler.nextFloat();
		
		RD = rendimento * CVI;
		
		System.out.printf("O valor do rendimento é %.2f",RD);
		
		
		
	}

}
