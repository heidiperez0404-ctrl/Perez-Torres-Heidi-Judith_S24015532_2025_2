//Ejercicio 16

import java.util.Scanner;

public class E16TiendaRopa 
{
    public static void main(String[] args) 
    {
    
        Scanner tp = new Scanner(System.in);
        String articulos[][] = new String[3][4];  
        
        for(int i = 0; i < 3; i++) 
        {
            System.out.print("Ingresa el nombre del articulo " + (i + 1) + ": ");
            articulos[i][0] = tp.nextLine();
        
            for(int j = 1; j < 4; j++) 
            {
                switch(j) 
                {
                    case 1 -> System.out.print("Ingresa la talla del articulo: ");
                    case 2 -> System.out.print("Ingresa el color del articulo: ");
                    case 3 -> System.out.print("Ingresa el precio del articulo: ");
                }
                
                articulos[i][j] = tp.nextLine();
            }
        }
        
        System.out.println("\n\tInformación de los artículos");
        System.out.printf("%-10s %-8s %-12s %-10s\n", 
            "Artículo", "Talla", "Color", "Precio");
        
        for(int i = 0; i < 3; i++) 
        {
            for(int j = 0; j < 4; j++) 
            {
                System.out.printf("%-10s ", articulos[i][j]);
            }
            System.out.println();
        }
        
        tp.close();
    }
}

