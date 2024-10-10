package br.com.fabrica;

import br.com.fabrica.concessionarias.CarroSUV;
import br.com.fabrica.concessionarias.CarroSedan;
import br.com.fabrica.montadoras.Honda;
import br.com.fabrica.montadoras.Toyota;

public class App {
    public static void main(String[] args) {

        FabricaDeCarros hondaFactory = new Honda();

        CarroSedan civic = (CarroSedan) hondaFactory.criarSedan();
        CarroSedan accord = new CarroSedan("Honda Accord");

        CarroSUV crv = (CarroSUV) hondaFactory.criarSUV();
        CarroSUV hrv = new CarroSUV("Honda HR-V");

        civic.dirigir();
        accord.dirigir();
        crv.dirigir();
        hrv.dirigir();

        FabricaDeCarros toyotaFactory = new Toyota();

        CarroSedan corolla = (CarroSedan) toyotaFactory.criarSedan();
        CarroSedan etios = new CarroSedan("Toyota Etios");

        CarroSUV rav4 = (CarroSUV) toyotaFactory.criarSUV();
        CarroSUV hilux = new CarroSUV("Toyota Hilux");

        corolla.dirigir();
        etios.dirigir();
        rav4.dirigir();
        hilux.dirigir();
    }
}
