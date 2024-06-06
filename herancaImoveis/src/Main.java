import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Imovel> imoveis = new ArrayList<>();

        ImoveldeVenda imoveldeVenda = new ImoveldeVenda(3, "rua das manjubas", "50m", 1, "casa", "classe média", 200.000);
        imoveis.add(imoveldeVenda);
    }
}