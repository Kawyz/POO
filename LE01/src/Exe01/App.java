/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe01;

import java.text.DecimalFormat;
/**
 *
 * @author kakaw
 */
public class App {
    public static void main (String[] args){
        DecimalFormat df = new DecimalFormat ("0.00");

        Pessoa pessoa = new Pessoa(); //Pessoa é a usado p acessar o outro programa com esse nome
        pessoa.altura = 1.75; //pessoa: identificação e .altura: membro
        pessoa.peso = 78;
        
        System.out.println("Imc: " + df.format(pessoa.calcularImc()));
    }
}
