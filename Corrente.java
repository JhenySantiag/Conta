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
public class Corrente extends Conta {
    Double limite;
    public Corrente(String Nome, String Cpf, String Agencia, String Conta, double Saldo, LocalDate DataAbertura, Double par1) {
        super(Nome, Cpf, Agencia, Conta, Saldo, DataAbertura);
        this.limite=limite;
    }
 
    @Override
    public boolean Deposito(Double valor) {
        this.setSaldo(valor);
        return true;
    }
 
    @Override
    public boolean Saque(Double valor) {
        if ((this.getSaldo()+this.limite)>=valor){
          this.setSaldo(this.getSaldo()-valor);
            return true;
        }else{
            return false;
        }
    }
 
   
}

