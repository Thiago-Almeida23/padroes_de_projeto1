package br.com.fabrica.concessionarias;

public class CarroSUV implements ICarroSUV {
    private String modelo;

    public CarroSUV(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void dirigir() {
        System.out.println("Dirigindo um " + modelo + ".");
    }
}
