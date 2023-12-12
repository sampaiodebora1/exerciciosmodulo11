package java07_vetores_matrizes;

import java.util.Scanner;

public class exercicio01 {
	
	public static void main(String[] args) {
		
		int[] vetor = {7,0,2,1,6,5,3,8,9,4};
		
		boolean valorencontrado = false;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite o número que você deseja encontrar:");
		int numero = leia.nextInt();
		
        for (int i = 0; i < vetor.length; i++) {        	
        	
            if (vetor[i] == numero) {
                System.out.println("Valor encontrado na posição " + i);
                valorencontrado = true;
                break;
             }
            
        }
        
        if(valorencontrado == false)       
         System.out.println("VAlor não encontrado");
        
			
	}

}
