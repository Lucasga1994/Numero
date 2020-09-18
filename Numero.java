package numeros;
import java.util.Arrays;
import java.util.Scanner;
public class Numero  {


	        public static void main(String[] args) {
				try (java.util.Scanner lector = new java.util.Scanner(System.in)) {
					System.out.println("Ingresar cantidad de elementos: ");
					String num=lector.nextLine();
					int[] elementos=convertirListaSeparadaPorComaEnArrayDeEnteros(num);
					System.out.println("Ingresar numeros del vector");
					String num1 = lector.nextLine();
					int[] vector = convertirListaSeparadaPorComaEnArrayDeEnteros(num1);
					System.out.println("Ingresar otro numero: ");
					String num2 = lector.nextLine();
					int[] vector2 = convertirListaSeparadaPorComaEnArrayDeEnteros(num2);
					System.out.println("Resultado:");
					mostrarElementos(num);
					ordenarNumeros (vector);
					mostrarPrimo(vector);
					mostrarPerfecto (vector);
					mostrarAmigo(vector,vector2);
				}
	        }
	        static void mostrarElementos (String  num) {
	    		
	        	Scanner lector = null;
				String[] arrayNumeros = new String[Integer.parseInt(lector.nextLine())];
	    		for(int i = 0; i<arrayNumeros.length; i++) {  			//repeticion para pedir ingreso de numeros y colocar en el array por orden de ingreso
	    		System.out.println("Ingresar numero " + (i+1));
	    		arrayNumeros[i] = lector.nextLine();
	    		}
	        }
	        static void ordenarNumeros(int[] vector) {
	        int n=vector.length;
	        for (int i = 0; i < n-1; i++) {
	        int indiceDelMenorValor = i;
	        for (int j = i+1; j < n; j++) {
	        if (vector[j] < vector[indiceDelMenorValor]) {
	        indiceDelMenorValor = j;
	        }
	        }
	        intercambiar(vector, i, indiceDelMenorValor);
	        imprimirVector(vector);
	        }
	        }
	        static void intercambiar(int[] array, int a, int b) {
	            int valor = array[b];
	            array[b] = array[a];
	            array[a] = valor;
	          }

	      

	        static void mostrarPrimo(int[] vector) {
				
	        	int contador=0;
	        	int n=vector.length;
				do{
	              for(int i=1;i<=n;i++){
	              if( i==2 || i==3 || i==5 || i==7){
	        	  System.out.print("Es primo: "+ i);
	        	  }
	        	  if (i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0 ){
	        	  System.out.print("Es primo: "+ i);
	        	  }
	        	  contador++;
	              }
	            	
	              
	              }
				while (contador <=2);			
	        	  }
	         static void mostrarPerfecto(int[] vector) {
					
		        	
		       int n=vector.length;
		       for(int i=1;i <=n ;i++){      
		       int suma=0; 
		       for(int j = 1;j < i;j++){                              
		       if(i % j==0){
		       suma = suma + j; 
		      
		       }
		       }
		       if(i == suma){                           
			   
		      System.out.println("Es perfecto:" +i);
		      
		       }else{ 
		    	   System.out.println("No es perfecto: "+i);
		       }
		       }
	           }
		       
	         static void mostrarAmigo(int[] vector, int [] vector2) {
					
		        	
		        	int n1=vector.length;
		        	int n2=vector2.length;
		        	int suma=0;
		            for(int i = 1;i <= n1;i++){                                     
		            if(n1%i==0){
		             suma=suma+i;
		                 }
		            }
		      
		           
		            if(suma==n2) {
		               for(int i = 1;i < n2;i++){                                             
		                    if(n2%i==0){
		                       System.out.println("Son amigos: "+n1+" y "+n2);
		                    }   
		                    
			            }   
		           
		               if(suma==n1){
		                  System.out.println("Son Amigos "+n1+"y "+n2);
		                 
		               }
		               }
		               
	                
	         }        
	        	

	        static int[] convertirListaSeparadaPorComaEnArrayDeEnteros(String lista) {
	          int[] numeros = Arrays.asList(lista.split(",")).stream()
	            .map(String::trim)
	            .mapToInt(Integer::parseInt).toArray();    
	          return numeros;      
	        }
	        
	        static void imprimirVector(int[] array) {
	          for (int i = 0; i <  array.length; i++) {
	            System.out.print(array[i] + " ");
	          }
	          System.out.println();
	        }

}