/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe02;

/**
 *
 * @author kakaw
 */
public class ContaBancaria {
    
    private String numero;
    private String titular;
    private double saldo;
           
    
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
        
    public double getSaldo(){
        return saldo;
    }
    
    public void depositar(double valor){
        if (valor < 0){
            throw new IllegalArgumentException("Valor de depósito inválido, não pode ser negativo");
        }
        saldo = saldo + valor;
    }
    
    public void sacar(double valor){
        if (valor < 0){
            throw new IllegalArgumentException("Valor de Saque inválido, não pode ser negativo");
        } if (valor > saldo){
            throw new IllegalArgumentException("Valor de Saque inválido, saldo insuficiente!");
        }
        saldo = saldo - valor;
    }
    
    public void transferir(ContaBancaria contaDestino, double valor){
        sacar(valor);
        contaDestino.depositar(valor);
    }  
}
