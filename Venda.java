package RegistroVenda;

import java.util.Scanner;

public class Venda {

    Produto produto;
    Vendedor vendedor;

    private double desconto;
    private int qntdDeItens;
    private double valor;

    public Venda(Produto produto, Vendedor vendedor, int qntdDeItens, double valor) {
        this.produto = produto;
        this.vendedor = vendedor;
        this.desconto = 0;
        this.qntdDeItens = qntdDeItens;
        this.valor = valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getQntdDeItens() {
        return qntdDeItens;
    }

    public void setQntdDeItens(int qntdDeItens) {
        this.qntdDeItens = qntdDeItens;
    }

    public void efetuarDesconto (double porcentagemDesconto){

        double valorVenda = produto.getValorVenda();
        double valorCusto = produto.getValorCusto();

        double precoDescontado = valorVenda * (porcentagemDesconto / 100);

        if ((valorVenda - precoDescontado) >  valorCusto){
            this.desconto = precoDescontado;
        } else{
            System.out.println("Não é possível efetuar o desconto");
        }
    }

    public void calcularValor(){
        double valorVenda = produto.getValorVenda();

        this.valor = (valorVenda - desconto) * qntdDeItens;
    }

    public void calcularComissao(){
       double comissao = vendedor.getCOMISSAO();

       if (produto.getPromocao()){
           double comissaoVendedor = ((comissao / 100) * valor) / 2;
           System.out.println("A comissão é: "+ comissaoVendedor +" reais");
       } else {
           double comissaoVendedor = (comissao / 100) * valor;
           System.out.println("A comissão é: "+ comissaoVendedor +" reais");
       }
    }

    public void imprimir(){
        System.out.println("O código do vendedor é: " + vendedor.getCodigo());
        System.out.println("O nome do vendedor é: " + vendedor.getNome());
        System.out.println("A porcentagem de comissão do vendedor é: " + Vendedor.getCOMISSAO());

        System.out.println("A quantidade de itens vendidos é: " + qntdDeItens);

        System.out.println("O código do produto é: " + produto.getCodigo());
        System.out.println("A descrição do produto é: " + produto.getDescricao());

        System.out.println("O produto está em promoção? " + produto.getPromocao());
        System.out.println("O valor de desconto sobre o produto é: " + desconto);
        System.out.println("O valor total da venda é: " + valor);
        System.out.println("------------------------------------------------------------------------------ ");
    }
}
