import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        String nome, nomeUsuario;
//        nome = JOptionPane.showInputDialog("nome:");
//        nomeUsuario = JOptionPane.showInputDialog("nome usuario:");
//        if (nome.equals(nomeUsuario)){
//            System.out.println("iguais");
//        }else{
//            System.out.println("diferentes");
//        }
        int numero ;
        int numeroMaior = 0;
        int i = 1;
        while (i <= 5){
        numero = Integer.parseInt(JOptionPane.showInputDialog((i+1) +"escreva um número: "));
            i++;

            if (numero > numeroMaior){
                numeroMaior = numero;
            }
        }
        System.out.println("Maior numero: " + numeroMaior);
    }
}