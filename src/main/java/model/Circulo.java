package model;

public class Circulo {

    private Double raio;

    public Circulo() {
        this (0.0);
    }
    
    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
    
    public Double getArea(){
        return (getRaio()*getRaio()*3.14);
    }
    
    public Double getCircunferencia(){
        return (getRaio()*2*3.14);
    }
}
