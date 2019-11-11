package model;

import java.io.Serializable;

/**
 *
 * @author xande
 */
public class Proposta implements Serializable{
    private final String text;
    private final int custo;
    private final Service service;
    private final User prestador;
    
    public Proposta(String text, int custo, Service service, User prestador) {
        this.text = text;
        this.custo = custo;
        this.service = service;
        this.prestador = prestador;
    }

    public String getText() {
        return text;
    }

    public int getCusto() {
        return custo;
    }

    public Service getService() {
        return service;
    }
    
    public User getClient(){
        return this.service.owner;
    }

    public User getPrestador() {
        return prestador;
    }
    
    
    
}
