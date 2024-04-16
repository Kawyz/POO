/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe02;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author kakaw
 */
public class App {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        
        System.out.println("Digite sua altura: ");
        pessoa.altura = tec.nextDouble();
        System.out.println("Digite seu peso: ");
        pessoa.peso = tec.nextDouble();
        
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Imc: " + df.format(pessoa.calculoImc()));      
        
        tec.close();
    }
}
