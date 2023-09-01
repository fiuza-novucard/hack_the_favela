package exercicio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String opcao = "";
        List<Pessoa> pessoas = new ArrayList<>();

        while (!opcao.equals("6")){
            opcao = JOptionPane.showInputDialog("Selecione uma opção:\n\n" +
                    "1 - Cadastrar pessoa\n" +
                    "2 - Ver o nome do mais velho\n" +
                    "3 - Ver o nome do mais novo\n" +
                    "4 - Remover pessoa\n" +
                    "5 - Mostrar todas as pessoas\n" +
                    "6 - Sair\n\n");

            switch (opcao) {
                case "1":
                    String nome = JOptionPane.showInputDialog("Digite o nome:");
                    String idade = JOptionPane.showInputDialog("Digite a idade:");
                    Pessoa pessoa = new Pessoa(nome, Integer.parseInt(idade));
                    pessoas.add(pessoa);
                    break;
                case "2":
                    Collections.sort(pessoas);
                    JOptionPane.showMessageDialog(null,
                            pessoas.get(pessoas.size()-1));
                    break;
                case "3":
                    Collections.sort(pessoas);
                    JOptionPane.showMessageDialog(null,
                            pessoas.get(0));
                    break;
                case "4":
                    if (pessoas.isEmpty()) {
                        JOptionPane.showMessageDialog(null,
                                "Você não cadastrou ninguem ainda.");
                        break;
                    }
                    String nomeRemover = JOptionPane.showInputDialog("Digite o nome de quem você irá remover: ");
                    boolean achei = false;
                    for (Pessoa pessoa1 : pessoas){
                        if(pessoa1.getNome().equals(nomeRemover)){
                            achei = true;
                            pessoas.remove(pessoa1);
                            JOptionPane.showMessageDialog(null, "Pessoa removida com sucesso.");
                            break;
                        }
                    }
                    if(!achei){
                        JOptionPane.showMessageDialog(null, "Não encontramos nenhuma pessoa com esse nome.");
                    }
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, pessoas);
                    break;
                case "6":
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Você digitou uma opção inválida!");
                    break;
            }
        }
    }
}
