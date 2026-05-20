package model;
 
public abstract class Animal {
 
    private String nome;
    private String porte; // pequeno, medio, grande
    private int idade;
 
    public Animal(String nome, String porte, int idade) {
        this.nome = nome;
        this.porte = porte;
        this.idade = idade;
    }
 
    public abstract double calcularDiaria();
 
    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
 
    public String getPorte() { return porte; }
    public void setPorte(String porte) { this.porte = porte; }
 
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
 
    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", porte=" + porte + ", idade=" + idade + "]";
    }
}
 