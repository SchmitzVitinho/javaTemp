public class Funcionario extends Pessoa{
    private String cargo;

    public Funcionario(String nome, int id, String senha, String cargo) {
        super(nome, id, senha);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
