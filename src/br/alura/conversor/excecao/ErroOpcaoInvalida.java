package br.alura.conversor.excecao;

public class ErroOpcaoInvalida extends RuntimeException{
    @Override
    public String getMessage() {
        return "Opção inválida! Tente um numero de 1-4";
    }
}
