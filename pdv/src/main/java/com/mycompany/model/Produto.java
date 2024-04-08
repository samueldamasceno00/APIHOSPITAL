/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.util.Calendar;

/**
 *
 * @author 00232980
 */
public class Produto {
    private String nmProduto;
    private String nmMarca;
    private String descricaoProduto;
    private int unidadeMed;
    private double precoCusto;
    private double precoVenda;
    private String categoria;
    private String dataValidade;
    private int qtdEstoque;

    public Produto() {
    }

    public Produto(String nmProduto, String nmMarca, String descricaoProduto, int unidadeMed, double precoCusto, double precoVenda, String categoria, String dataValidade, int qtdEstoque) {
        this.nmProduto = nmProduto;
        this.nmMarca = nmMarca;
        this.descricaoProduto = descricaoProduto;
        this.unidadeMed = unidadeMed;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.categoria = categoria;
        this.dataValidade = dataValidade;
        this.qtdEstoque = qtdEstoque;
    }

    public String getNmProduto() {
        return nmProduto;
    }

    public void setNmProduto(String nmProduto) {
        this.nmProduto = nmProduto;
    }

    public String getNmMarca() {
        return nmMarca;
    }

    public void setNmMarca(String nmMarca) {
        this.nmMarca = nmMarca;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getUnidadeMed() {
        return unidadeMed;
    }

    public void setUnidadeMed(int unidadeMed) {
        this.unidadeMed = unidadeMed;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
}
