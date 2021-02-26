package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double num1, num2;
        String operation;
        Scanner input = new Scanner(System.in);
        System.out.println("\u001B[31m ################################ BIENVENIDO m################################");
        System.out.println("\u001B[31m El siguiente programa requiere que inserte dos valores por favor siga las instrucciones");

        System.out.println("Inserte un numero");
        num1 = input.nextInt();

        System.out.println("Inserte un segundo numero");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);
        System.out.println("\u001B[31m################################ Menu m################################");
        System.out.println("Inserte el signo de la operación que desea realizar");
        System.out.println("1. + Para suma");
        System.out.println("2. - Para resta");
        System.out.println("3. * Para multiplicación ");
        System.out.println("4. / Para división ");
        System.out.println("\u001B[31m########################################################################");
        operation = op.next();
        Calculos calculos = new Calculos(num1, num2);
        switch(operation) {
            case "+":
                System.out.println("\u001B[31m La Suma de "+ calculos.getNum1() +" + "+ calculos.getNum2() + "  Su respuesta es  " + calculos.Suma());
                break;
            case "-":
                System.out.println("\u001B[31m La Resta de "+ calculos.getNum1() +" - "+ calculos.getNum2() + "  Su respuesta es  " + calculos.Resta());
                break;
            case "*":
                System.out.println("\u001B[31m La Multiplicación  de " + calculos.getNum1() + " * "+ calculos.getNum2() + "  Su respuesta es  " + calculos.Multi());
                break;
            case "/":
                System.out.println("\u001B[31m La División de "+ calculos.getNum1() +" / "+ calculos.getNum2() + "  Su respuesta es  " + calculos.Divi());
                break;
        }
    }
}
