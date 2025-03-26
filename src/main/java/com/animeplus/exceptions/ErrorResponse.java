package com.animeplus.exceptions;
import java.time.LocalDateTime;

public class ErrorResponse {
    private String mensagem;
    private String detalhes;
    private String timestamp;

    // Construtor com todos os parâmetros
    public ErrorResponse(String mensagem, String detalhes, String timestamp) {
        this.mensagem = mensagem;
        this.detalhes = detalhes;
        this.timestamp = timestamp;
    }

    // Construtor para mensagens simples de erro
    public ErrorResponse(String mensagem) {
        this.mensagem = mensagem;
        this.timestamp = String.valueOf(System.currentTimeMillis());
    }

    public ErrorResponse(String message, int value) {
    }

    // Getter para mensagem
    public String getMensagem() {
        return mensagem;
    }

    // Setter para mensagem
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    // Getter para detalhes
    public String getDetalhes() {
        return detalhes;
    }

    // Setter para detalhes
    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    // Getter para timestamp
    public String getTimestamp() {
        return timestamp;
    }

    // Setter para timestamp
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    // Método toString para representar o objeto como uma string
    @Override
    public String toString() {
        return "ErrorResponse{" +
                "mensagem='" + mensagem + '\'' +
                ", detalhes='" + detalhes + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
