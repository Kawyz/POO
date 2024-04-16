/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe01;

/**
 *
 * @author kakaw
 */
public class Pessoa {
    
        double altura; // altura e peso são atributos
        double peso;
        
        double calcularImc(){ //calcularImc é uma operação
        return peso/ Math.pow(altura,2); //devolve o valor do calculo
        
        }        
    }

