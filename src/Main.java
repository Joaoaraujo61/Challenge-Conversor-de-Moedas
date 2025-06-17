import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConsultaApi consulta = new ConsultaApi("BRL", "USD");
        Conversao conversao = new Conversao(consulta.buscaCotacao(), 30);
        System.out.println(conversao.ConverteMoeda());
    }
}