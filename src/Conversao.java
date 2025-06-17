public class Conversao{
    private double valorASerConvertido;
    private double cotacao;

    public Conversao(double cotacao, double valorASerConvertido){
        this.cotacao = cotacao;
        this.valorASerConvertido = valorASerConvertido;
    }

    public double ConverteMoeda(){
        return valorASerConvertido * cotacao;
    }
}
