
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConsultaApi consulta = new ConsultaApi();
        Conversao conversao = new Conversao();

        Scanner leitura = new Scanner(System.in);

        System.out.println("Selecione a moeda do valor a ser convertido: ");
        System.out.println("""
                1)Dolar     3)Peso Argentino
                2)Real      4)Peso Colombiano
                """);
        String moedaBase = conversao.obtemMoeda(leitura.nextInt());

        System.out.println("Selecione para qual moeda será convertido: ");
        System.out.println("""
                1)Dolar     3)Peso Argentino
                2)Real      4)Peso Colombiano
                """);
        String moedaAlvo = conversao.obtemMoeda(leitura.nextInt());

        System.out.println("Quanto deseja converter?");
        double valorASerConvertido = leitura.nextDouble();
        leitura.close();

        double cotacao = consulta.buscaCotacao(moedaBase, moedaAlvo);

        System.out.println("O valor: " + valorASerConvertido + " " + moedaBase
                + " é igual a " + conversao.ConverteMoeda(valorASerConvertido, cotacao)
                + " " + moedaAlvo + " com cotação de " + cotacao);

    }
}