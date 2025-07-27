class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}

public class Aula05_POO_Basico {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Ana";
        p.idade = 22;
        p.apresentar();
    }
}