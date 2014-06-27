/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Gleywson
 */
@Entity
public class InformacaoBancaria implements Serializable{
    @Id
    @GeneratedValue
    private Long Id;
   
    private String banco;
    private String agencia;
    private String conta;

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco.toUpperCase();
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

 
    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }
    
    
    
}
