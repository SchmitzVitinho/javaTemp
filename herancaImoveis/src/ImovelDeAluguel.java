public class ImovelDeAluguel extends Imovel {
    private int valorDoAluguel;
    private boolean disponibilidade;

    public ImovelDeAluguel(int numeroQuartos, String endereco, String area, int id, String tipo, String padrao, int valorDoAluguel, boolean disponibilidade) {
        super(numeroQuartos, endereco, area, id, tipo, padrao);
        this.valorDoAluguel = valorDoAluguel;
        this.disponibilidade = disponibilidade;
    }

    public void alugar(boolean disponibilidade){
        setDisponibilidade(disponibilidade);
    }

    public void devolver(boolean disponibilidade){
        setDisponibilidade(disponibilidade);
    }

    public int getValorDoAluguel() {
        return valorDoAluguel;
    }

    public void setValorDoAluguel(int valorDoAluguel) {
        this.valorDoAluguel = valorDoAluguel;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
