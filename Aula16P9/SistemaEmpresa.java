package Aula16P9;

import java.util.ArrayList;
import java.util.Scanner;
//
public class SistemaEmpresa {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>(); 
        int opcao;

        do {
            System.out.println("\n--- MENU DE RH ---");
            System.out.println("1. Adicionar gerente");
            System.out.println("2. Adicionar atendente");
            System.out.println("3. Listar todos os funcionários");
            System.out.println("4. Mostrar salário de funcionário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = leitor.nextInt();
            leitor.nextLine(); 

            if (opcao == 1) {
                System.out.print("Nome: "); String nome = leitor.nextLine();
                System.out.print("CPF: "); String cpf = leitor.nextLine();
                System.out.print("Nascimento: "); String data = leitor.nextLine();
                System.out.print("Salário Base: R$ "); double salario = leitor.nextDouble();
                
                listaFuncionarios.add(new Gerente(nome, cpf, salario, data));
                System.out.println("Gerente cadastrado com sucesso!");

            } else if (opcao == 2) {
                System.out.print("Nome: "); String nome = leitor.nextLine();
                System.out.print("CPF: "); String cpf = leitor.nextLine();
                System.out.print("Nascimento: "); String data = leitor.nextLine();
                System.out.print("Salário Base: R$ "); double salario = leitor.nextDouble();
                System.out.print("Comissão: R$ "); double comissao = leitor.nextDouble();
                
                listaFuncionarios.add(new Atendente(nome, cpf, salario, data, comissao));
                System.out.println("✅ Atendente cadastrado com sucesso!");

            } else if (opcao == 3) {
                System.out.println("\n--- LISTA DE FUNCIONÁRIOS ---");
                if (listaFuncionarios.isEmpty()) {
                    System.out.println("Nenhum funcionário cadastrado.");
                } else {
                    for (Funcionario f : listaFuncionarios) {
                        System.out.println("- " + f.getNome() + " (CPF: " + f.getCpf() + ")");
                    }
                }

            } else if (opcao == 4) {
                System.out.print("Digite o CPF do funcionário: ");
                String cpfBusca = leitor.nextLine();
                boolean achou = false;

                for (Funcionario f : listaFuncionarios) {
                    if (f.getCpf().equals(cpfBusca)) {
                        System.out.println("\nFuncionário encontrado: " + f.getNome());
                        System.out.printf("Salário a receber: R$ %.2f\n", f.getSalario());
                        achou = true;
                        break; 
                    }
                }

                if (!achou) {
                    System.out.println("Funcionário com este CPF não encontrado.");
                }

            } else if (opcao == 5) {
                System.out.println("Encerrando o sistema...");
            } else {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 5);
        
        
        leitor.close();
    }
}