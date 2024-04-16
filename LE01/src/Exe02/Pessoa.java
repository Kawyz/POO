/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe02;

/**
 *
 * @author kakaw
 */
public class Pessoa {
      
    double altura;
    double peso;
    
    double calculoImc(){
        return peso / Math.pow(altura, 2);
    }    
    
}
