import javax.swing.*;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public static void main(String[] args) {
//        Pessoa p = new Pessoa("vit", 7);
//        //p.setIdade(16);
//        //p.setIdade(p.getIdade() + 1);
//        System.out.println(p.getNome()+" tem "+ p.getIdade()+ " anos");

        for (int i=0; i<3; i++){
            String nome =
                    JOptionPane.showInputDialog("digite o nome da pessoa "+(i+1));
            int idade = Integer.parseInt(JOptionPane.showInputDialog("idade:"));
            Pessoa p = new Pessoa(nome, idade);
            pessoas.add(p);
        }

        System.out.println(pessoas);
    }
}