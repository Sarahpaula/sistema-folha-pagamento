package org.example;

public abstract class Funcionario {
    protected String nome;
    protected int matricula;
    protected static final double SALARIO_BASE = 2000.0;

    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;

    }

    public abstract double calcularSalario();

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário Fixo: " + SALARIO_BASE);

    }

}