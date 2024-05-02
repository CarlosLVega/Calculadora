/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora1;

/**
 *
 * @author carlo
 */
public class Calculadora extends javax.swing.JFrame{
    int num1, num2;
    String signo;

    public Calculadora() {
    }

    public Calculadora(int num1, int num2, String signo) {
        this.num1 = num1;
        this.num2 = num2;
        this.signo = signo;
    }
    
    
    
    public static int calcular(int num1, int num2, String signo) {
        switch (signo) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("División por cero");
                }
            default:
                throw new IllegalArgumentException("Operador no válido: " + signo);
        }
    }
}


