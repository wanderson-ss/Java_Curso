package Hoje;

public class Hoje {
	
	public static void main(String[]args) {
		
		int x = 5;
		
		
		
		System.out.println("Olá mundo");
		
		if(x<0) {	
			System.out.println("Boa tarde");	
		}
		System.out.println("Boa noite");

		
	}
	
	

}


//Condição composta

package Hoje;

import java.util.Scanner;

public class Hoje {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int hora;
		
		
		
			System.out.println("Quantas horas?");
			hora = sc.nextInt();
		// condicional simples
			if(hora<12) {
				System.out.println("Bom dia");
			}else {
				System.out.println("Boa tarde");
			}
	
	sc.close();
	}
}



///Encadeamento 

package Hoje;

import java.util.Scanner;

public class Hoje {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int hora;
		
		
		
			System.out.println("Quantas horas?");
			hora = sc.nextInt();
			
		// condicional simples
			
			
			if(hora<12) {
				System.out.println("Bom dia");
			}else{
				//Encadeamento de estruturas condicionais
			if(hora < 18){
				System.out.println("Boa tarde");

			}
	//Nunca colocar condição no else
			else{
				System.out.println("Boa noite");

			}	
				
		
	
	sc.close();
	}
}
}
