package org.example;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);
        ArrayList<Funcionario> lista = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n--- SISTEMA DE GESTÃO FOLHAS DE PAGAMENTOS---");
            System.out.println("1 - Cadastrar Funcionário Padrão");
            System.out.println("2 - Cadastrar Funcionário Comissionado");
            System.out.println("3 - Cadastrar Funcionário Produção");
            System.out.println("4 - Gerar Folha de Pagamento");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            int continuar;

            switch (opcao) {
                case 1:
                    do {
                        System.out.println("\n[Cadastro Padrão]");
                        System.out.print("Nome: "); String nome = leitor.nextLine();
                        System.out.print("Matrícula: "); int mat = leitor.nextInt();
                        lista.add(new FuncionarioPadrao(nome, mat));

                        System.out.print("Funcionário cadastrado! \n O que deseja fazer agora? \n 1 - Novo cadastro \n 0 - Voltar ");
                        continuar = leitor.nextInt();
                        leitor.nextLine();
                    } while (continuar != 0);
                    break;

                case 2:
                    do {
                        System.out.println("\n[Cadastro Comissionado]");
                        System.out.print("Nome: "); String nome = leitor.nextLine();
                        System.out.print("Matrícula: "); int mat = leitor.nextInt();
                        System.out.print("Informe valor das vendas: "); double vendas = leitor.nextDouble();
                        System.out.print("Informe comissão percentual: "); double perc = leitor.nextDouble();
                        lista.add(new FuncionarioComissionado(nome, mat, vendas, perc));

                        System.out.print("Funcionário cadastrado! \n O que deseja fazer agora? \n 1 - Novo cadastro \n 0 - Voltar ");
                        continuar = leitor.nextInt();
                        leitor.nextLine();
                    } while (continuar != 0);
                    break;

                case 3:
                    do {
                        System.out.println("\n[Cadastro Produção]");
                        System.out.print("Nome: "); String nome = leitor.nextLine();
                        System.out.print("Matrícula: "); int mat = leitor.nextInt();
                        System.out.print("Informe qtde de peças: "); int qtd = leitor.nextInt();
                        System.out.print("Informe valor da peça: "); double vPeca = leitor.nextDouble();
                        lista.add(new FuncionarioProducao(nome, mat, qtd, vPeca));

                        System.out.print("Funcionário cadastrado! \n O que deseja fazer agora? \n 1 - Novo cadastro \n 0 - Voltar ");
                        continuar = leitor.nextInt();
                        leitor.nextLine();

                        if(opcao >3 ){
                            System.out.println("opcao invalida");
                        }
                    }

                    while (continuar != 0);
                    break;

                case 4:
                    System.out.println("\n--- FOLHA DE PAGAMENTO ATUAL ---");
                    System.out.println("Total de pessoas cadastradas: " + lista.size());
                    for (Funcionario f : lista) {
                        f.exibirDados();
                    }
                    break;

                case 5:
                    System.out.println("Finalizando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        leitor.close();
    }
}