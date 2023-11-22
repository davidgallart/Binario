/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenej1;

import java.util.Scanner;
// Java Program to convert from decimal to binario

//Programa Java para pasar de decimal a binario

//this program reads an integer number that id given by the final user and it shows its value in the binary numeric system (0,1)

//el programa lee un número entero que se le pide al usuario y muestra su valor en sistema binario(0,1)
public class ExamenEj1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=0;   
	int i=0;
        do {
        System.out.print("Introduzca un número que sea mayor que 0");                                                           
            n = sc.nextInt();
        } while (n <= 0);

        System.out.print("\nBinario: ");
        decBin(n);
         System.out.println("");
    }

  
    //Método para pasar de decimal a binario
    public static void decBin(int n) {
       
        if (n < 2) {
            System.out.print(n);
        } else {
           decBin(n / 2);
            System.out.print(n%2 );
        }
    }
}

/*
Primero en el do while cambiamos la variable del while que hace que salga del bucle por la variable que recoge el valor que escribe el usuario
Segundo ponemos el nombre correcto del metodo de pasar de decimal a bianrio
Tercero hacemos que el metodo en la parte del primer if no sea menor o igual solo menor
Y por ultimo que printe el resto de 2 del metodo recursivo para que transforme el numero a binario 

*/