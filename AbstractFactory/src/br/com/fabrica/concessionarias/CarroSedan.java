package br.com.fabrica.concessionarias;

public class CarroSedan implements ICarroSedan {
    private String modelo;

    public CarroSedan(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void dirigir() {
        System.out.println("Dirigindo um " + modelo + ".");
    }
}
