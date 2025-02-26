package br.com.automanager.principal;

import br.com.automanager.menu.Menu;
import br.com.automanager.models.Carro;

public class Principal {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.Titulo();

        //Instância carro
        while (true) {
            if(menu.opcoesUsuario() == 1){
                Carro.exibirCarros();
            } else {
                Carro carro = new Carro();
                carro.setNome();
                carro.setPreco();
                carro.setModelo();
                carro.setMarca();
                carro.setTipo();
                carro.setAno();
                carro.setBanco();
                carro.setCambio();
                carro.setDirecao();
                carro.setArCondicionado();
                carro.setPotenciaMotor();
                carro.setQtdePortas();
                carro.setKmRodados();
                carro.setCor();
                carro.adicionarCarro();
            }
            if (menu.continuar() == 1) {
                continue;
            } else {
                break;
            }
        }
    }
}
