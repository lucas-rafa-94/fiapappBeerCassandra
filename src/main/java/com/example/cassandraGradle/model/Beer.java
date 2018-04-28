package com.example.cassandraGradle.model;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;

@Table("beers")
public class Beer implements Serializable {

    @PrimaryKeyColumn(name = "marca", type = PrimaryKeyType.PARTITIONED)
    private String marca;
    @PrimaryKeyColumn(name = "tipoEmbalagem", type = PrimaryKeyType.PARTITIONED)
    private String tipoEmbalagem;
    private String unidadeMedida;
    private double valorMedida;
    private double preco;

    public Beer(String marca, String tipoEmbalagem, String unidadeMedida, double valorMedida, double preco) {
        this.marca = marca;
        this.tipoEmbalagem = tipoEmbalagem;
        this.unidadeMedida = unidadeMedida;
        this.valorMedida = valorMedida;
        this.preco = preco;
    }

    public Beer() { }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoEmbalagem() {
        return tipoEmbalagem;
    }

    public void setTipoEmbalagem(String tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public double getValorMedida() {
        return valorMedida;
    }

    public void setValorMedida(double valorMedida) {
        this.valorMedida = valorMedida;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
