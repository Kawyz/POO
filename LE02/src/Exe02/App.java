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
    DecimalFormat df = new DecimalFormat("0.00");
    
    
    ContaBancaria conta1 = new ContaBancaria();
    System.out.println("Numero da conta1: ");
    conta1.setNumero(tec.nextLine());
    System.out.println("Titular da conta " + conta1.getNumero() + ": ");
    conta1.setTitular(tec.nextLine());
    
    
    ContaBancaria conta2 = new ContaBancaria();
    System.out.println("Numero da conta2: ");
    conta2.setNumero(tec.nextLine());
    System.out.println("Titular da conta " + conta1.getNumero() + ": ");
    conta2.setTitular(tec.nextLine());
    
    //deposita os valores na c1
    conta1.depositar(1000);
    conta1.depositar(700);
    
    //deposita 5000 na c2
    conta2.depositar(5000);
    
    //saca 300 da c2
    conta2.sacar(3000);
    
    //transfere 1800 da c2 para a c1
    conta2.transferir(conta1, 1800);
    
    System.out.println("Conta1 - Titular: " + conta1.getTitular() + " Saldo: " + df.format(conta1.getSaldo()));
    System.out.println("Conta2 - Titular: " + conta2.getTitular() + " Saldo: " + df.format(conta2.getSaldo()));
    
    
    
    
            
       
    }  
}
