public class ImoveldeVenda extends Imovel{
    private double preco;

    public ImoveldeVenda(int numeroQuartos, String endereco, String area, int id, String tipo, String padrao, double preco) {
        super(numeroQuartos, endereco, area, id, tipo, padrao);
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
