import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
    }

    private static String lerEntrada(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    // Função para gerar Pokémons fakes (opcional)
    private static void gerarPokémonsFakes() {
        pokemons.add(new Pokemon("Pikachu", "Elétrico", 35));
        // ... (adicione outros Pokémons fakes aqui)
    }

    while (true) {
        System.out.println("\n**Menu Principal**");
        System.out.println("1. Cadastrar Pokémon");
        System.out.println("2. Localizar Pokémon");
        System.out.println("3. Editar Pokémon");
        System.out.println("4. Apagar Pokémon");
        System.out.println("5. Mostrar Todos os Pokémons");
        System.out.println("6. Gerar Pokémons Fakes");
        System.out.println("0. Sair");

        int opcao = lerEntrada("Digite a opção desejada: ");

        switch (opcao) {
            case 1:
                cadastrarPokemon();
                break;
            case 2:
                localizarPokemon();
                break;
            case 3:
                editarPokemon();
                break;
            case 4:
                apagarPokemon();
                break;
            case 5:
                mostrarTodosPokemons();
                break;
            case 6:
                gerarPokémonsFakes();
                break;
            case 0:
                System.out.println("Saindo do programa...");
                return;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void cadastrarPokémon() {
        System.out.println("\n**Cadastro de Pokémon**");
        String nome = lerEntrada("Nome do Pokémon: ");
        String tipo = lerEntrada("Tipo do Pokémon (separados por vírgula): ");
        int nivel = Integer.parseInt(lerEntrada("Nível do Pokémon: "));

        cadastrarPokemon(nome, tipo, nivel);
        System.out.println("Pokémon cadastrado com sucesso!");
    }
}