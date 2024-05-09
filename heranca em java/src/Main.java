//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criação de objetos Animal
        Animal animalGenerico = new Animal("Rex", 5, "Floresta");
        Leao reiLeao = new Leao("Simba", 8, "Savana", "Grande e densa");
        Elefante trombeta = new Elefante("Ellie", 30, "Floresta tropical", "Curta e grossa");

        // Testando métodos da classe Animal
        System.out.println("------- Animal --------");
        System.out.println("Nome: " + animalGenerico.getNome());
        System.out.println("Idade: " + animalGenerico.getIdade());
        System.out.println("Habitat: " + animalGenerico.getHabitat());
        animalGenerico.emitirSom(); // Som genérico

        // Testando métodos específicos do Leão
        System.out.println("\n------- Leão --------");
        System.out.println("Nome: " + reiLeao.getNome());
        System.out.println("Idade: " + reiLeao.getIdade());
        System.out.println("Habitat: " + reiLeao.getHabitat());
        System.out.println("Juba: " + reiLeao.getJuba());
        reiLeao.emitirSom(); // Rugido!

        // Testando métodos específicos do Elefante
        System.out.println("\n------- Elefante --------");
        System.out.println("Nome: " + trombeta.getNome());
        System.out.println("Idade: " + trombeta.getIdade());
        System.out.println("Habitat: " + trombeta.getHabitat());
        System.out.println("Tromba: " + trombeta.getTromba());
        trombeta.emitirSom(); // Barulho de trombeta!
    }
}