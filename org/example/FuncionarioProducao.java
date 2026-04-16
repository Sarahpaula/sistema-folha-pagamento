package org.example;

public class FuncionarioProducao extends Funcionario {
    private int quantidade;
    private double valorPeca;

    public FuncionarioProducao(String nome, int matricula, int quantidade, double valorPeca) {
        super(nome, matricula);
        this.quantidade = quantidade;
        this.valorPeca = valorPeca;

    }

    @Override
    public double calcularSalario() {
        return SALARIO_BASE + (quantidade * valorPeca);
    }

    public void exibirDados() {
        super.exibirDados();
        double bonus = calcularSalario() - SALARIO_BASE;
        System.out.println("Produtividade: " + bonus);
        System.out.println("Salário Final: " + calcularSalario());
        System.out.println("-------------------------");

    }
}