package br.com.fabrica;

import br.com.fabrica.concessionarias.ICarroSedan;
import br.com.fabrica.concessionarias.ICarroSUV;

public interface FabricaDeCarros {
    ICarroSedan criarSedan();
    ICarroSUV criarSUV();
}
