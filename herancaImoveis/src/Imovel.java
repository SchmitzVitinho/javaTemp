public class Imovel {
    private int numeroQuartos;
    private String endereco;
    private String area;
    private int id;
    private String tipo;
    private String padrao;

    public Imovel(int numeroQuartos, String endereco, String area, int id, String tipo, String padrao) {
        this.numeroQuartos = numeroQuartos;
        this.endereco = endereco;
        this.area = area;
        this.id = id;
        this.tipo = tipo;
        this.padrao = padrao;
    }

    public void reformar(String area, int numeroQuartos, String padrao){
        setArea(area);
        setNumeroQuartos(numeroQuartos);
        setPadrao(padrao);
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = this.area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPadrao() {
        return padrao;
    }

    public void setPadrao(String padrao) {
        this.padrao = padrao;
    }
}
