package br.ufpb.dcx.laurindo.cleyton.Atividade11;

import java.util.Objects;

public abstract class AtrativoTuristico {

    // 1. Declaração de atributos
    private String nome;
    private double latitude;
    private double longitude;
    private String comoChegar;
    private String cidade;
    private String estado;

    // 2. Construtor
    public AtrativoTuristico() {
        this.nome = "";
        this.latitude = 0.0;
        this.longitude = 0.0;
        this.comoChegar = "";
        this.cidade = "";
        this.estado = "";
    }

    // 3. Construtor com todos os parâmetros
    public AtrativoTuristico(String nome, double latitude, double longitude, String comoChegar, String cidade, String estado) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.comoChegar = comoChegar;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cidade, estado);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AtrativoTuristico other = (AtrativoTuristico) obj;
        return Objects.equals(nome, other.nome) &&
                Objects.equals(cidade, other.cidade) &&
                Objects.equals(estado, other.estado);
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getComoChegar() {
        return this.comoChegar;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setComoChegar(String comoChegar) {
        this.comoChegar = comoChegar;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}