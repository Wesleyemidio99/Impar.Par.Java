package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        int valor;

        System.out.println("Digite um numero");
        valor= numero.nextInt();

        if(valor % 2 == 0){
            System.out.println("O Numero digitado = Par");

        }
        else{
            System.out.println("O numero digitado = Impar");
        }
        numero.close();
    }
}