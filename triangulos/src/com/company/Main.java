package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int lado1,lado2,lado3;

        try{
            System.out.println("Ingrese la longitud del primer lado: ");
            lado1 = scanner.nextInt();

            System.out.println("Ingrese la longitud del segundo lado: ");
            lado2 = scanner.nextInt();

            System.out.println("Ingrese la longitud del tercer lado: ");
            lado3 = scanner.nextInt();
        }catch (InputMismatchException exception){
            System.out.println("Error : La longitud del lado debe ser entera");
            return;
        }


        if(!esValidoTriangulo(lado1,lado2,lado3)){
            System.out.println("El triángulo no es válido.\nLa suma de dos lados no puede ser menor o igual al lado restante.");
            return;
        }

        if(lado1 == lado2 && lado1 == lado3){
            System.out.println("El triángulo es equilátero");
            return;
        }
        
        if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.println("El triángulo es isóceles");
            return;
        }

        System.out.println("El triángulo es escaleno");
        return;

    }

    private static boolean esValidoTriangulo(int lado1, int lado2, int lado3) {
        if(lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1){
            return false;
        }else{
            return true;
        }
    }
}
