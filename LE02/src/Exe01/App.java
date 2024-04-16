/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe01;

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
            System.out.println("Pessoa N " + (i + 1));
            System.out.println("Nome: ");
            pessoa.setNome(tec.nextLine());
            System.out.println("Altura: ");
            pessoa.setAltura(tec.nextDouble());
            System.out.println("Peso: ");
            pessoa.setPeso(tec.nextDouble());
            tec.nextLine();
        }
        
        for (int i = 2; i >= 0; --i){
            System.out.println("Pessoa N " + (i + 1));
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Altura: " + pessoa.getAltura());
            System.out.println("Peso: " + pessoa.getPeso());
            System.out.println("Imc: " + df.format(pessoa.calcularImc()));
        }
        tec.close();
    }
}
