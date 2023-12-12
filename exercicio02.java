package java07_vetores_matrizes;

public class exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[][] matriz = {
	            {4.0, 5.0, 7.0, 3.0},
	            {2.5, 6.5, 4.7, 8.0},
	            {10.0, 8.5, 9.5, 8.0},
	            {9.0, 6.5, 7.6, 8.2},
	            {5.0, 5.0, 5.0, 6.3},
	            {7.0, 8.0, 9.0, 8.5},
	            {5.5, 3.5, 2.5, 1.0},
	            {8.0, 9.0, 10.0, 9.5},
	            {5.6, 5.8, 6.5, 7.0},
	            {7.5, 8.5, 9.5, 10.0}
	        };
		double [] medias = {0,0,0,0,0,0,0,0,0,0};
		
		 for (int i = 0; i < matriz.length; i++) {
	         double soma = 0;   
			 for (int j = 0; j < matriz[i].length; j++) {
	                soma = soma + matriz[i][j];
	         }			 
			 medias[i] = soma / 4 ; 	
	        }
		 
		 for(int i=0;i<medias.length;i++)
			 System.out.println(medias[i]);

	}

}
