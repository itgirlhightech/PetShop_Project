package model;
 
public class Cao extends Animal {
 
    private boolean incluiPasseio;
 
    public Cao(String nome, String porte, int idade, boolean incluiPasseio) {
        super(nome, porte, idade);
        this.incluiPasseio = incluiPasseio;
    }
 
    @Override
    public double calcularDiaria() {
        double diaria = 50.0; 
 
        if (getPorte().equalsIgnoreCase("grande")) {
            diaria += 20.0;
        }
 
        return diaria;
    }
 
    public double adicionarPasseio() {
        return incluiPasseio ? 30.0 : 0.0;
    }
 
    public double calcularTotal() {
        return calcularDiaria() + adicionarPasseio();
    }
 
    // Getters e Setters
    public boolean isIncluiPasseio() { return incluiPasseio; }
    public void setIncluiPasseio(boolean incluiPasseio) { this.incluiPasseio = incluiPasseio; }
 
    @Override
    public String toString() {
        return "Cao [nome=" + getNome() + ", porte=" + getPorte() +
               ", idade=" + getIdade() + ", incluiPasseio=" + incluiPasseio + "]";
    }
}
 