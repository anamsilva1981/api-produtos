package com.api.Api.Rest.model.error;

public class ErrorMessage {
    private String titulo;
    private Integer status;
    private String message;


    // Constructor
    public ErrorMessage(String titulo, Integer status, String message) {
        this.titulo = titulo;
        this.status = status;
        this.message = message;
    }

    // Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
