public class Animal {
    private String nome;
    private int idade;
    private String habitat;

    public Animal(String nome, int idade, String habitat) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void emitirSom() {
        System.out.println("Som genérico de animal");
    }
}

// Subclasse Leão
class Leao extends Animal {
    private String juba;

    public Leao(String nome, int idade, String habitat, String juba) {
        super(nome, idade, habitat);
        this.juba = juba;
    }

    public String getJuba() {
        return juba;
    }

    public void setJuba(String juba) {
        this.juba = juba;
    }

    @Override
    public void emitirSom() {
        System.out.println("Rugido!");
    }
}

// Subclasse Elefante
class Elefante extends Animal {
    private String tromba;

    public Elefante(String nome, int idade, String habitat, String tromba) {
        super(nome, idade, habitat);
        this.tromba = tromba;
    }

    public String getTromba() {
        return tromba;
    }

    public void setTromba(String tromba) {
        this.tromba = tromba;
    }

    @Override
    public void emitirSom() {
        System.out.println("Barulho de trombeta!");
    }
}
