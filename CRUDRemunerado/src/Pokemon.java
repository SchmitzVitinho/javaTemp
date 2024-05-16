import java.util.ArrayList;
public class Pokemon {

    private String nome;
    private String tipo;
    private int nivel;

    public Pokemon(String nome, String tipo, int nivel) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Pokémon{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", nivel=" + nivel +
                '}';
    }
    ArrayList<Pokemon> pokemons = new ArrayList<>();

    public void cadastrarPokemon(String nome, String tipo, int nivel) {
        Pokemon pokemon = new Pokemon(nome, tipo, nivel);
        pokemons.add(pokemon);
        System.out.println("Pokémon cadastrado com sucesso!");
    }

    public void localizarPokemon(String nome) {
        Pokemon pokemon = pokemons.stream()
                .filter(p -> p.getNome().equals(nome))
                .findFirst()
                .orElse(null);

        if (pokemon != null) {
            System.out.println("Pokémon encontrado:");
            System.out.println(pokemon);
        } else {
            System.out.println("Pokémon não encontrado.");
        }
    }

    public void editarPokemon(String nome, String novoNome, String novoTipo, int novoNivel) {
        Pokemon pokemon = pokemons.stream()
                .filter(p -> p.getNome().equals(nome))
                .findFirst()
                .orElse(null);

        if (pokemon != null) {
            pokemon.setNome(novoNome);
            pokemon.setTipo(novoTipo);
            pokemon.setNivel(novoNivel);
            System.out.println("Pokémon editado com sucesso!");
        } else {
            System.out.println("Pokémon não encontrado.");
        }
    }

    public void apagarPokemon(String nome) {
        Pokemon pokemon = pokemons.stream()
                .filter(p -> p.getNome().equals(nome))
                .findFirst()
                .orElse(null);

        if (pokemon != null) {
            pokemons.remove(pokemon);
            System.out.println("Pokémon apagado com sucesso!");
        } else {
            System.out.println("Pokémon não encontrado.");
        }
    }

    public void mostrarTodosPokemons() {
        if (pokemons.isEmpty()) {
            System.out.println("Não há Pokémons cadastrados.");
        } else {
            System.out.println("Pokémons cadastrados:");
            for (Pokemon pokemon : pokemons) {
                System.out.println(pokemon);
            }
        }
    }

    public void gerarPokémonsFakes() {
        pokemons.add(new Pokemon("Pikachu", "Elétrico", 35));
        pokemons.add(new Pokemon("Charizard", "Fogo/Voador", 50));
        pokemons.add(new Pokemon("Blastoise", "Água", 45));
        pokemons.add(new Pokemon("Bulbasaur", "Grama/Veneno", 30));
        pokemons.add(new Pokemon("Squirtle", "Água", 25));
        pokemons.add(new Pokemon("Charmander", "Fogo", 20));
    }
}