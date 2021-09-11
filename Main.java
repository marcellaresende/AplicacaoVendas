package RegistroVenda;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(10,"Computador Acer", 3596.99f, 2500f, false);
        Vendedor vendedor1 = new Vendedor("Zezinho", 1414, "Av Pará, 189");
        Venda venda1 = new Venda(produto1, vendedor1, 1, 3596.99);

        venda1.setQntdDeItens(2);

        venda1.calcularValor();
        venda1.calcularComissao();
        venda1.imprimir();

        Produto produto2 = new Produto(10,"Liquidificador Britania", 100f, 80f, true);
        Vendedor vendedor2 = new Vendedor("Carlos", 1356, "Av Pará, 1999");
        Venda venda2 = new Venda(produto2, vendedor2, 1, 100);

        venda2.setQntdDeItens(3);

        venda2.efetuarDesconto(10);
        venda2.calcularValor();
        venda2.calcularComissao();
        venda2.imprimir();

        Venda venda3 = new Venda(produto2, vendedor2, 1,100);

        venda3.setQntdDeItens(2);

        venda3.efetuarDesconto(30);
        venda3.calcularValor();
        venda3.calcularComissao();
        venda3.imprimir();
    }
}
