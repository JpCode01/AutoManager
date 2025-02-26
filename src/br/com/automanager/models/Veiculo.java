package br.com.automanager.models;

import java.util.Scanner;

public class Veiculo {
    private String nome;
    private String cor;
    private double preco;
    private int ano;
    private int kmRodados;
    private String marca;
    private String modelo;
    private String tipo;
    private String descricao;

    public void setNome() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do veículo: ");
        nome = input.nextLine();
    }

    public String getNome() {
        return nome;
    }

    public void setCor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a cor: ");
        cor = input.nextLine();
    }

    public void setPreco() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o preço do veículo: ");
        preco = input.nextDouble();
    }

    public void setAno() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ano do veículo: ");
        ano = input.nextInt();
    }

    public void setKmRodados() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de kms rodados do veículo: ");
        kmRodados = input.nextInt();
    }

    public void setMarca() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a marca do veículo: ");
        marca = input.nextLine();
    }

    public void setModelo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o modelo do veículo: ");
        modelo = input.nextLine();
    }

    public void setTipo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tipo do veículo: ");
        tipo = input.nextLine();
    }
}
