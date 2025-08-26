/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fuentesperla20250825;

/**
 *
 * @author UFG
 */

import java.util.Scanner; 
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ingresar_datos();
    }
    
    @SuppressWarnings("empty-statement")
    public static void ingresar_datos (){
        
        //INICIAR CLASE SCANNER
        Scanner scanner = new Scanner(System.in);
        
        //DECLARACIÓN DE VARIABLES
        int[] edades = new int [10];
        int suma = 0;
        int total_pares = 0;
        int total_impares = 0;
        
        //MENSAJE AL USUARIO
        System.out.println("Ingrese " + edades.length + " edades");
        
        //SE RECORRE EL ARREGLO
        for(int i = 0; i < edades.length; i++) {
        
        //SE SOLICITA AL USUARIO EL INGRESO DE UN VLOR 
            System.out.println("Edad "+i+" :");
            
            //SE LEE DESDE EL TECLADO EL VALOR DIGITADO POR EL USUARIO Y SE 
            //ASIGNA A LA VARIABLE EDAD QUE CORRESPONDE SEGÚN LA ITERACIÓN 
            edades[i] = scanner. nextInt ();
            
            //PARA CALCULAR EL PROMEDIO SE REQUIERE SUMAR TODAS LAS EDAES 
            suma += edades [i];
            
            //ESTABLECER SI EL VALOR ES PAR O IMPAR
            //PARA ELLO SE CALCULA EL MÓDULO DEL NÚMERO DIGITADO
            if( (edades[i] % 2) ==0){
                //ES PAR
                //SE INCREMENTA LA VARIABLE ACUMULADORA
                total_pares++;
            }
            else{
                total_impares++;
            }
        }
        //SE CALCULA EL PROMEDIO D LAS EDADES
        double promedio = (double)suma/edades.length;
        
        //SE IMPRIME LA SALIDA
        System.out.println("Usted ha ingresado: " +edades.length+" edades");
        System.out.println("El promedio de las edades ingresadas es: " +promedio);
        System.out.println("Ingresó: " +total_pares+" edades pares y "+total_impares+" edades impares");
        
        //SE CIERRA EL OBJETO DE TIPO scanner, PORQUE YA NO HABRÁ MÁS LECTURAS
        scanner.close();
        
    }
}
