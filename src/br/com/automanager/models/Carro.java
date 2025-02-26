package br.com.automanager.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Carro extends Veiculo{
    private String potenciaMotor;
    private String banco;
    private boolean arCondicionado;
    private int qtdePortas;
    private String direcao;
    private String cambio;

    static ArrayList<String> verificaMotor = new ArrayList<>(Arrays.asList("1.0", "1.4", "1.6"));
    static ArrayList<String> verificaDirecao = new ArrayList<>(Arrays.asList("hidraulica", "eletrica", "mecanica"));
    static ArrayList<String> verificaCambio = new ArrayList<>(Arrays.asList("automatico", "cvt", "manual"));
    static ArrayList<String> carros = new ArrayList<>();

    public void adicionarCarro(){
        carros.add(getNome());
    }

    public static void exibirCarros() {
        if (carros.isEmpty()) {
            System.out.println("Nenhum carro cadastrado no sistema! :/");
        } else {
            for (int i = 0; i < carros.size(); i++) {
                System.out.println((i + 1) + " - " + carros.get(i));
            }
        }
    }

    public void setPotenciaMotor() {
        Scanner input = new Scanner(System.in);
        boolean continuar = true;
        String potenciaMotor = "";
        while (continuar) {
            System.out.println("Digite a potência do motor: ");
            potenciaMotor = input.nextLine();
            if (verificaMotor.contains(potenciaMotor)) {
                continuar = false;
            } else {
                System.out.println("Potência inválida! (1.0., 1.4, 1.6)");
            }
        }
    }

    public void setBanco() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tipo de banco do veículo: ");
        banco = input.nextLine();
    }

    public void setArCondicionado() {
        System.out.println("O carro tem ar condicionado? ");
        System.out.println("\n1 - Sim\n2 - Não");
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a opção: ");
        boolean continuar = true;
        while (continuar) {
            if (input.nextInt() == 1) {
                arCondicionado = true;
                continuar = false;
            } else if (input.nextInt() == 2) {
                arCondicionado = false;
                continuar = false;
            } else {
                System.out.println("Opção inválida! (1 -> sim e 2 -> Não)");
            }
        }
    }

    public void setQtdePortas() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de portas do veículo: ");
        qtdePortas = input.nextInt();
    }

    public void setDirecao() {
        Scanner input = new Scanner(System.in);
        boolean continuar = true;
        String direcao = "";
        while (continuar) {
            System.out.println("Digite o tipo de direção do carro: (não use acentos)");
            direcao = input.nextLine();
            if (verificaDirecao.contains(direcao.toLowerCase())) {
                continuar = false;
            } else {
                System.out.println("Direção inválida! (hidraulica, eletrica, mecanica) Digite sem acentos.");
            }
        }
    }

    public void setCambio() {
        Scanner input = new Scanner(System.in);
        boolean continuar = true;
        String cambio = "";
        while (continuar) {
            System.out.println("Digite o tipo de câmbio do carro: (não use acentos)");
            cambio = input.nextLine();
            if (verificaCambio.contains(cambio.toLowerCase())) {
                continuar = false;
            } else {
                System.out.println("Câmbio inválido! (automatico, cvt, manual) Digite sem acentos.");
            }
        }
    }
}
