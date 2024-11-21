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

public abstract class Conta {
    private String Nome;
    private String Cpf;
    private String Agencia;
    private String Conta;
    private Double Saldo;
    private LocalDate DataAbertura;
    public Conta (String Nome, String Cpf,String Agencia,String Conta,Double Saldo,LocalDate DataAbertura){
    this.Nome=Nome;
    this.Cpf=Cpf;
    this.Agencia=Agencia;
    this.Conta=Conta;
    this.Saldo=Saldo;
    this.DataAbertura= DataAbertura;
    }
    abstract public  boolean Deposito(Double valor);
    abstract public  boolean Saque(Double valor);

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }
 
    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
 
    /**
     * @return the Cpf
     */
    public String getCpf() {
        return Cpf;
    }
 
    /**
     * @param Cpf the Cpf to set
     */
    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }
 
    /**
     * @return the Agencia
     */
    public String getAgencia() {
        return Agencia;
    }
 
    /**
     * @param Agencia the Agencia to set
     */
    public void setAgencia(String Agencia) {
        this.Agencia = Agencia;
    }
 
    /**
     * @return the Conta
     */
    public String getConta() {
        return Conta;
    }
 
    /**
     * @param Conta the Conta to set
     */
    public void setConta(String Conta) {
        this.Conta = Conta;
    }
 
    /**
     * @return the Saldo
     */
    public Double getSaldo() {
        return Saldo;
    }
 
    /**
     * @param Saldo the Saldo to set
     */
    public void setSaldo(Double Saldo) {
        this.Saldo = Saldo;
    }
 
    /**
     * @return the DataAbertura
     */
    public LocalDate getDataAbertura() {
        return DataAbertura;
    }
 
    /**
     * @param DataAbertura the DataAbertura to set
     */
    public void setDataAbertura(LocalDate DataAbertura) {
        this.DataAbertura = DataAbertura;
    }
}
