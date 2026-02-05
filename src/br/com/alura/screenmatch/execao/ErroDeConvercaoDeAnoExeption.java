package br.com.alura.screenmatch.execao;

public class ErroDeConvercaoDeAnoExeption extends RuntimeException {
    private String mensagem;
    public ErroDeConvercaoDeAnoExeption(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
