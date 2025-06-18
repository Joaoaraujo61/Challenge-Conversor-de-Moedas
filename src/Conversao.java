public class Conversao{
    /*private double valorASerConvertido;
    private double cotacao;

    public Conversao(double cotacao, double valorASerConvertido){
        this.cotacao = cotacao;
        this.valorASerConvertido = valorASerConvertido;
    }*/

    public String obtemMoeda(int codigoMoeda){
        String codigo = "";
        switch(codigoMoeda){
            case 1:
                codigo = "USD";
                break;
            case 2:
                codigo = "BRL";
                break;
            case 3:
                codigo = "ARS";
                break;
            case 4:
                codigo = "COP";
                break;
        }
        return codigo;
    }

    public double ConverteMoeda(double valorASerConvertido, double cotacao){
        return valorASerConvertido * cotacao;
    }
}
