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
    
        private double altura; // altura e peso são atributos
        private double peso;
        private String nome;
        
        double calcularImc(){ //calcularImc é uma operação
        return peso/ Math.pow(altura,2); //devolve o valor do calculo
        }
        
        public void setAltura(double novaAltura){
            altura = novaAltura;        
        }
        
        public double getAltura(){
            return altura;
        }
        public void setPeso(double novoPeso){
            peso = novoPeso;        
        }
        
        public double getPeso(){
            return peso;
        }
        public void setNome(String novoNome){
            nome = novoNome;        
        }
        
        public String getNome(){
            return nome;
        }  
}

    
