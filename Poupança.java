/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

import java.time.LocalDate;

/**
 *
 * @author jheniffer.ssantos1
 */
public class Poupança extends Conta {
    
     public Poupança(String Nome, String Cpf, String Agencia, String Conta, Double Saldo, LocalDate DataAbertura) {
        super(Nome, Cpf, Agencia, Conta, Saldo, DataAbertura);
    }
 
   
 
    @Override
    public boolean Deposito(Double valor) {
     this.setSaldo(valor);
     return true;
    }
 
    @Override
    public boolean Saque(Double valor) {
        if(this.getSaldo()>=valor){
           this.setSaldo(valor);
           this.setSaldo(this.getSaldo()-valor);
            return true;
        }else{
            return false;
        }
        }  

 
   
    }
    

