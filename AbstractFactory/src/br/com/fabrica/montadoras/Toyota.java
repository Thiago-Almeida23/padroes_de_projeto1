package br.com.fabrica.montadoras;

import br.com.fabrica.FabricaDeCarros;
import br.com.fabrica.concessionarias.CarroSedan;
import br.com.fabrica.concessionarias.CarroSUV;
import br.com.fabrica.concessionarias.ICarroSedan;
import br.com.fabrica.concessionarias.ICarroSUV;

public class Toyota implements FabricaDeCarros {
    @Override
    public ICarroSedan criarSedan() {
        return new CarroSedan("Toyota Corolla");
    }

    @Override
    public ICarroSUV criarSUV() {
        return new CarroSUV("Toyota RAV4");
    }
}
