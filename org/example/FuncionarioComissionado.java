package org.example;

public class FuncionarioComissionado extends Funcionario {
    private double vendas;
    private double percentual;

    public FuncionarioComissionado(String nome, int matricula, double vendas, double percentual) {
        super(nome, matricula);
        this.vendas = vendas;
        this.percentual = percentual;

    }

    @Override
    public double calcularSalario() {
        return SALARIO_BASE + (vendas * percentual / 100);
    }

    public void exibirDados() {
        super.exibirDados();
        double comissao = calcularSalario() - SALARIO_BASE;
        System.out.println("Comissão: " + comissao);
        System.out.println("Salário Final: " + calcularSalario());
        System.out.println("-------------------------");

    }
}