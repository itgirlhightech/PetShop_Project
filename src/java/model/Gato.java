package java.model;

public class Gato extends Animal {

    public Gato(String nome, String porte, int idade) {
        super(nome, porte, idade);

    }
 
    @Override
    public double calcularDiaria() {
        double diaria = 40.0;

        return diaria;
    }

 
    @Override
    public String toString() {
        return "Gato [nome=" + getNome() + ", porte=" + getPorte() +
               ", idade=" + getIdade() + "]";
    }
}
 