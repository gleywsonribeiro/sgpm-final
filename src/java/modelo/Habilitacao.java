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
public class Habilitacao implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    
    private String numeroHabilitacao;
    private String categoria;

    public String getNumeroHabilitacao() {
        return numeroHabilitacao;
    }

    public void setNumeroHabilitacao(String numeroHabilitacao) {
        this.numeroHabilitacao = numeroHabilitacao.toUpperCase();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria.toUpperCase();
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
