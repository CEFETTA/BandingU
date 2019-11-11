package model;

/**
 *
 * @author xande
 */
public class Proposta {
    private final String text;
    private final int custo;
    private Service service;
    
    public Proposta(String text, int custo, Service service) {
        this.text = text;
        this.custo = custo;
        this.service = service;
    }

    public String getText() {
        return text;
    }

    public int getCusto() {
        return custo;
    }
    
    
}
