/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author mathe
 */
public class Conta {
    int numero;
    double saldo;
    
    double retornarSaldo() {
        return saldo;
    }
    void sacar(double valor) {
        saldo = saldo - valor;
    }
    
    void depositar(double valor) {
        saldo = saldo + valor;
    }
}