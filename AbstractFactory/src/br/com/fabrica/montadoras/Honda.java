package br.com.fabrica.montadoras;

import br.com.fabrica.FabricaDeCarros;
import br.com.fabrica.concessionarias.CarroSedan;
import br.com.fabrica.concessionarias.CarroSUV;
import br.com.fabrica.concessionarias.ICarroSedan;
import br.com.fabrica.concessionarias.ICarroSUV;

public class Honda implements FabricaDeCarros {
    @Override
    public ICarroSedan criarSedan() {
        return new CarroSedan("Honda Civic");
    }

    @Override
    public ICarroSUV criarSUV() {
        return new CarroSUV("Honda CR-V");
    }
}
