package Hoje;

/*********************************************************************************************
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

************************************************************************************************/
import java.util.Scanner;

public class Hoje {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		
		
			System.out.println("Favor informar o numero:");
			numero = sc.nextInt();
			
		// condicional simples
			
			
			if(numero <-1) {
				System.out.println("Negativo");
			}else{
				//Encadeamento de estruturas condicionais
			if(numero > 0){
				System.out.println("Não negativo");

			}
	//Nunca colocar condição no else
			else{
				System.out.println("Boa noite");

			}	
				
		
	
	sc.close();
	}
}
}
