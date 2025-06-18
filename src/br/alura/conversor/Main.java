package br.alura.conversor;

import br.alura.conversor.api.ConsultaApi;
import br.alura.conversor.modelos.Conversao;
import br.alura.conversor.modelos.Verificacao;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConsultaApi consulta = new ConsultaApi();
        Conversao conversao = new Conversao();
        Verificacao verificacao = new Verificacao();
        String respostaUser = "";

        Scanner leitura = new Scanner(System.in);

        while (!respostaUser.equalsIgnoreCase("sair")){
            try {
                System.out.println("Selecione a moeda do valor a ser convertido: ");
                System.out.println("""
                    1)Dolar     3)Peso Argentino
                    2)Real      4)Peso Colombiano
                    """);

                String moedaBase = conversao.obtemMoeda(verificacao.VerificaOpcao(leitura.nextInt()));
                leitura.nextLine();

                System.out.println("Selecione para qual moeda será convertido: ");
                System.out.println("""
                    1)Dolar     3)Peso Argentino
                    2)Real      4)Peso Colombiano
                    """);

                String moedaAlvo = conversao.obtemMoeda(verificacao.VerificaOpcao(leitura.nextInt()));
                leitura.nextLine();

                System.out.println("Quanto deseja converter?");
                double valorASerConvertido = leitura.nextDouble();
                leitura.nextLine();

                double cotacao = consulta.buscaCotacao(moedaBase, moedaAlvo);

                System.out.println("O valor: " + valorASerConvertido + " " + moedaBase
                        + " é igual a " + conversao.ConverteMoeda(valorASerConvertido, cotacao)
                        + " " + moedaAlvo + " com cotação de " + cotacao);

                System.out.println("Deseja sair? Digite sair, ou qualquer caractére para continuar!");
                respostaUser = leitura.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número válido.");
                leitura.nextLine();
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }
        }
        leitura.close();
    }
}