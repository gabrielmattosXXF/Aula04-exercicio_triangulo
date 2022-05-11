/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula04_exercicio02;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Mattos
 */
public class Aula04_exercicio02
{
    public static double calcTamLado(double x1, double y1, double x2, double y2)
    {
        return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
    }
    
    public static boolean condicaoExistencia(double lado1, double lado2, double lado3)
    {
        if((lado1+lado2>lado3) && (lado1+lado3>lado2) && (lado2+lado3>lado1))
        {
            return true;
        }
        else 
            return false;
    }
    
    public static String tipoTriangulo(double lado1, double lado2, double lado3)
    {
        if(!condicaoExistencia(lado1, lado2, lado3))
        {
            return "Invalido!";
        }
        else if(lado1==lado2 && lado2==lado3 && lado1==lado3)
        {
            return "Equilatero";
        }
        else if(lado1!=lado2 && lado2!=lado3 && lado1!=lado3)
        {
            return "Escaleno";
        }
        else //if(else if((lado1==lado2 && lado2==lado3 && lado1!=lado3) || (lado1==lado2 && lado2!=lado3 && lado1==lado3) || (lado1!=lado2 && lado2==lado3 && lado1==lado3)))
        {
            return "Isoceles";
        }
    }
    
    
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe as coordenadas do ponto p1:");
        double x1 = teclado.nextDouble();
        double y1 = teclado.nextDouble();
        
        System.out.println("Informe as coordenadas do ponto p2:");
        double x2 = teclado.nextDouble();
        double y2 = teclado.nextDouble();
        
        System.out.println("Informe as coordenadas do ponto p3:");
        double x3 = teclado.nextDouble();
        double y3 = teclado.nextDouble();
        
        double lado1 = calcTamLado(x1, y1, x2, y2);
        double lado2 = calcTamLado(x2, y2, x3, y3);
        double lado3 = calcTamLado(x1, y1, x3, y3);
        
        System.out.println("O Triangulo formado pelos tres pontos he "+tipoTriangulo(lado1, lado2, lado3));
        
        
    }
}
