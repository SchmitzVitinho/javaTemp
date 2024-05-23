public class Professor extends Pessoa{
    private String area;

    public Professor(String nome, int id, String senha, String area) {
        super(nome, id, senha);
        this.area = area;
    }

    public void fazerChamada(){
        System.out.println("vitinho");
        System.out.println("theo");
        System.out.println("kike");
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
