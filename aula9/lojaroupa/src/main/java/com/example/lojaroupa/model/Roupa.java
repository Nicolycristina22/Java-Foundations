package com.example.lojaroupa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "roupa")
@Entity(name = "Roupa")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Roupa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double valor;


    public Roupa(DadosRoupa dadosRoupa) {
        this.marca = dadosRoupa.marca();
        this.tipo = dadosRoupa.tipo();
        this.tamanho = dadosRoupa.tamanho();
        this.quantidade = dadosRoupa.quantidade();
        this.valor = dadosRoupa.valor();

    }
}
