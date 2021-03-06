package com.bcopstein;

public class Produto {
  private int codigo;
  private String descricao;
  private double preco;

  public Produto(int codigo, String descricao, double preco) {
    this.codigo = codigo;
    this.descricao = descricao;
    this.preco = preco;
  }

  public int getCodigo() {
    return codigo;
  }

  public String getDescricao() {
    return descricao;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  @Override
  public String toString() {
    return "Produto [codigo=" + codigo + ", descricao=" + descricao +
           ", preco=" + preco + "]";
  }
}
