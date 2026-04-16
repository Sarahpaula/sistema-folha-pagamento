package org.example;

public class FuncionarioPadrao extends Funcionario {
    public FuncionarioPadrao(String nome, int matricula) {
        super(nome, matricula);

    }

    @Override
    public double calcularSalario() {
        return SALARIO_BASE;
    }
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Extras: 0.0");
        System.out.println("Salário Final: " + calcularSalario());
        System.out.println("-------------------------");

    }
}