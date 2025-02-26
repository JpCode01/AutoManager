package br.com.automanager.menu;

import java.util.Scanner;

public class Menu {
    public void Titulo() {
        System.out.println("Auto Manager");
        for (int i = 0; i < 8; i++) {
            System.out.print("―");
        }
    }

    public int opcoesUsuario() {
        System.out.println("\n OPÇÕES USUÁRIO: \n1 - Ver Carros\n2 - Adicionar veículo");
        boolean continuar = true;
        int opcaoUsuario = 0;
        Scanner input = new Scanner(System.in);
        while (continuar) {
            System.out.println("Digite a opção desejada: ");
            opcaoUsuario = input.nextInt();
            if (opcaoUsuario == 1 || opcaoUsuario == 2) {
                continuar = false;
            } else {
                System.out.println("Opção inválida! Digite 1 ou 2.");
            }
        }
        return opcaoUsuario;
    }

    public int continuar() {
        System.out.println("\n CONTINUAR? \n1 - SIM\n2 - NÃO");
        boolean continuar = true;
        int opcaoUsuario = 0;
        Scanner input = new Scanner(System.in);
        while (continuar) {
            System.out.println("Digite a opção desejada: ");
            opcaoUsuario = input.nextInt();
            if (opcaoUsuario == 1 || opcaoUsuario == 2) {
                continuar = false;
            } else {
                System.out.println("Opção inválida! Digite 1 ou 2.");
            }
        }
        return opcaoUsuario;
    }

}
