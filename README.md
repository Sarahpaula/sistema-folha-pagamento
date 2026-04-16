# Sistema de Folha de Pagamento - Gestão de Colaboradores

Projeto desenvolvido para consolidar fundamentos de **Programação Orientada a Objetos (POO)** em Java.

## 🚀 Tecnologias e Conceitos Aplicados
- **Linguagem:** Java (JDK 17+)
- **Herança & Polimorfismo:** Implementação de classe base `Funcionario` e subclasses especializadas com sobrescrita de métodos (`@Override`).
- **Encapsulamento:** Uso de constantes (`SALARIO_BASE`) e organização de atributos.
- **Estruturas de Dados:** Gerenciamento dinâmico de objetos com `ArrayList`.
- **UX no Console:** Menus iterativos que permitem múltiplos cadastros sem encerrar o programa.

## 🛠️ Como rodar o projeto
1. Clone o repositório.
2. Abra em uma IDE (IntelliJ IDEA recomendada).
3. Execute a classe `Main.java`.

## 📝 Regras de Negócio
O sistema calcula o salário final com base em três modalidades, todas partindo de um salário base de R$ 2.000,00:
1. **Padrão:** Salário base fixo.
2. **Comissionado:** Salário base + porcentagem sobre o valor de vendas.
3. **Produção:** Salário base + bônus por unidade produzida.
