package projetoeidi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean cast;
		int sexo;
		int qtd = 0;
		
		cachorro cachorro1 = new cachorro("Cleiton",true,2);
		cachorro cachorro2 = new cachorro("Josias",true,1);
		cachorro cachorro3 = new cachorro("Claudio",true,2);
		cachorro cachorro4 = new cachorro("Rebeco",true,2);
		
		ArrayList<cachorro> cachorros = new ArrayList<>();
		
		cachorros.add(cachorro1);
		cachorros.add(cachorro2);
		cachorros.add(cachorro3);
		cachorros.add(cachorro4);
		
		
	    	

			System.out.println("estes são os nossos cachorros");
			for(int i = 0; i < 4;i++) {
			System.out.println(cachorros.get(i));
			}
			
			System.out.println("Deseja adotar quantos?");
			qtd = input.nextInt();
			
			for(int i = 0; qtd != i ; i++ ){
				System.out.println("Filtrar Se esta castrado?");
				System.out.println("Sim = 1");
				System.out.println("Não = 0");
				int r = input.nextInt();
				
				switch(r){
				case 0 :
					cast = false;
				case 1 : 
					cast = true;
					
				System.out.println("Masculino = 1");
				System.out.println("Feminino = 2");
				sexo = input.nextInt();
				
				for(int h = 0; h < 4; h++){
					if(cachorros.get(h).castrado == cast && cachorros.get(h).sexo == sexo)
						System.out.println(cachorros.get(h));
				
				}
			}
			}
			
				
			
		
	}

}
