package RegistroVenda;

public class Vendedor {

    private String nome;
    private int codigo;
    public static double COMISSAO = 15;
    private String endereco;

    public Vendedor(String nome, int codigo, String endereco) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static double getCOMISSAO() {
        return COMISSAO;
    }

    public static void setCOMISSAO(double COMISSAO) {
        Vendedor.COMISSAO = COMISSAO;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
