package org.example;

import org.example.ejs.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){



        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;

        while (eleccion != 12) {
            menu();
            eleccion = teclado.nextInt();

            switch (eleccion) {

                case 1:
                    LaNotaMediaV1 ejercicio1 = new LaNotaMediaV1();
                    ejercicio1.notaMedia(teclado);
                    break;
                case 2:
                    LaNotaMediaV2 ejercicio2 = new LaNotaMediaV2();
                    ejercicio2.notaMedia(teclado);
                    break;
                case 3:
                    LaNotaMediaV3 ejercicio3 = new LaNotaMediaV3();
                    ejercicio3.notaMedia(teclado);
                    break;
                case 4:
                    AdivinarNumero ejercicio4 = new AdivinarNumero();
                    ejercicio4.adivinarNum(teclado);
                    break;
                case 5:
                    EncontrarloYo ejercicio5 = new EncontrarloYo();
                    ejercicio5.numero(teclado);
                    break;
                case 6:
                    CapitalFrancia ejercicio6 = new CapitalFrancia();
                    ejercicio6.capital(teclado);
                    break;
                case 7:
                    PeliculasV1 ejercicio7 = new PeliculasV1();
                    ejercicio7.cartelera(teclado);
                    break;
                case 8:
                    PeliculasV2 ejercicio8 = new PeliculasV2();
                    ejercicio8.carteleraV2(teclado);
                    break;
                case 9:
                    MultiploDe3 ejercicio9 = new MultiploDe3();
                    ejercicio9.multiplo(teclado);
                    break;
                case 10:
                    ArteASCIIv1 ejercicio10 = new ArteASCIIv1();
                    ejercicio10.figura(teclado);
                    break;
                case 11:
                    ArteASCIIv2 ejercicio11 = new ArteASCIIv2();
                    ejercicio11.figuras(teclado);
                    break;
                default:
                    System.out.println("\nOpcion no valida\n");
                    break;
            }
        }
        System.out.println("Saliendo . . .");
    }


    private static void menu(){
        System.out.println("\nQue ejercicio quieres ver: \n" );
        System.out.println("1. La nota media (versi??n 1)");
        System.out.println("2. La nota media (versi??n 2)");
        System.out.println("3. La nota media (versi??n 3)");
        System.out.println("4. Adivine en qu?? n??mero estoy pensando");
        System.out.println("5. Ahora tengo que encontrarlo yo");
        System.out.println("6. ??Qu?? hace este algoritmo?");
        System.out.println("7. Visualizaci??n de citas de pel??culas (versi??n 1)");
        System.out.println("8. Visualizaci??n de citas de pel??culas (versi??n 2)");
        System.out.println("9. Escribir un m??ltiplo de tres");
        System.out.println("10. Arte ASCII 1");
        System.out.println("11. Arte ASCII 2");
        System.out.println("12. Salir\n");
    }





}