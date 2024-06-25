import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Pokemon> pokemons = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n**Menu Principal**");
            System.out.println("1. Cadastrar Pokémon");
            System.out.println("2. Localizar Pokémon");
            System.out.println("3. Editar Pokémon");
            System.out.println("4. Apagar Pokémon");
            System.out.println("5. Mostrar Todos os Pokémons");
            System.out.println("6. Gerar Pokémons Fakes");
            System.out.println("0. Sair");

            int opcao = Integer.parseInt(lerEntrada("Digite a opção desejada: "));

            switch (opcao) {
                case 1:
                    cadastrarPokémon();
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
    }

    private static String lerEntrada(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    private static void gerarPokémonsFakes() {
        pokemons.add(new Pokemon("Pikachu", "Elétrico", 35));
        // Adicione outros Pokémons fakes aqui
        System.out.println("Pokémons fakes gerados com sucesso!");
    }

    private static void cadastrarPokémon() {
        System.out.println("\n**Cadastro de Pokémon**");
        String nome = lerEntrada("Nome do Pokémon: ");
        String tipo = lerEntrada("Tipo do Pokémon: ");
        int nivel = Integer.parseInt(lerEntrada("Nível do Pokémon: "));

        pokemons.add(new Pokemon(nome, tipo, nivel));
        System.out.println("Pokémon cadastrado com sucesso!");
    }

    private static void localizarPokemon() {
        String nome = lerEntrada("Digite o nome do Pokémon que deseja localizar: ");
        for (Pokemon p : pokemons) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                System.out.println(p);
                return;
            }
        }
        System.out.println("Pokémon não encontrado!");
    }

    private static void editarPokemon() {
        String nome = lerEntrada("Digite o nome do Pokémon que deseja editar: ");
        for (Pokemon p : pokemons) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                String novoPokemon = lerEntrada("Digite o novo tipo do Pokémon: ");
                int novoNivel = Integer.parseInt(lerEntrada("Digite o novo nível do Pokémon: "));
                System.out.println("Pokémon atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Pokémon não encontrado!");
    }

    private static void apagarPokemon() {
        String nome = lerEntrada("Digite o nome do Pokémon que deseja apagar: ");
        for (Pokemon p : pokemons) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                pokemons.remove(p);
                System.out.println("Pokémon removido com sucesso!");
                return;
            }
        }
        System.out.println("Pokémon não encontrado!");
    }

    private static void mostrarTodosPokemons() {
        if (pokemons.isEmpty()) {
            System.out.println("Nenhum Pokémon cadastrado.");
        } else {
            for (Pokemon p : pokemons) {
                System.out.println(p);
            }
        }
    }
}