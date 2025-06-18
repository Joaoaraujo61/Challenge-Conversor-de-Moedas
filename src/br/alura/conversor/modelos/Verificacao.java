package br.alura.conversor.modelos;

import br.alura.conversor.excecao.ErroOpcaoInvalida;

public class Verificacao {
    public int VerificaOpcao(int opcao){
        if(opcao > 4 || opcao < 1){
            throw new ErroOpcaoInvalida();
        }else{
            return opcao;
        }
    }
}
