package bank;

import java.util.Scanner;

public class Bank {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Conta c; 
        c = new Conta();
        
        System.out.println("Saldo da conta R$:" +c.retornarSaldo());
        
        
        double x;
        System.out.println("Informe o valor para deposito: ");
        x = sc.nextDouble();
        
        c.depositar(x);
        System.out.println("Saldo da conta R$: " +c.retornarSaldo());
        
        System.out.println("Informe o valor do saque R$: ");
        x = sc.nextDouble();
        
        c.sacar(x);
        System.out.println("Saldo da conta após saque é R$: " +c.retornarSaldo());
                
    }
    
}
