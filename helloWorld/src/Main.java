//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int numeroInteiro = 22;
        float numeroReal = 3.1434f;
        char letra = 'A';
        boolean terminou = false;

        System.out.println("Inteiro: " + numeroInteiro);
        System.out.println("Float: " + numeroReal);
        System.out.println("Char: " + letra);
        System.out.println("lógico: " + terminou);
        System.out.println("================");

        System.out.printf("\no valor do float: %.4f", numeroReal);

        String nome = "Java";
        float media = 8.9f;
        System.out.printf("\na nota de %s é %.3f", nome, media);
        System.out.format("\na nota de %s é %.3f", nome, media);

    }
}