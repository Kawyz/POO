/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe04;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author kakaw
 */
public class App {
    public static void main(String[] args){
    Scanner tec = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    Pessoa pessoa = new Pessoa();
    
    for (int i = 0; i <= 2; i++){
        System.out.println("Pessoa " + (i+1));
        System.out.println("Informe o Nome: ");
        pessoa.nome = tec.next();
        System.out.println("Informe a altura: ");
        pessoa.altura = tec.nextDouble();
        System.out.println("Informe o peso: ");
        pessoa.peso = tec.nextDouble();
    }
        
    for (int i = 2; i >= 0; --i){
        System.out.println("Pessoa " + (i+1));
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Altura: " + pessoa.altura);
        System.out.println("Peso: " + pessoa.peso);
        System.out.println("Imc: " + df.format(pessoa.calcularImc()));
    
    }
    tec.close();
    }
}
