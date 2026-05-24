package java.model;

public class Gato extends Animal {
 
    private boolean ambienteEspecial;
 
    public Gato(String nome, String porte, int idade, boolean ambienteEspecial) {
        super(nome, porte, idade);
        this.ambienteEspecial = ambienteEspecial;
    }
 
    @Override
    public double calcularDiaria() {
        double diaria = 40.0;
        if (ambienteEspecial) {
            diaria += 10.0;
        }
        return diaria;
    }
 
    public double calcularTotal() {
        return calcularDiaria();
    }
 
    
    public boolean isAmbienteEspecial() { return ambienteEspecial; }
    public void setAmbienteEspecial(boolean ambienteEspecial) {
        this.ambienteEspecial = ambienteEspecial; }
 
    @Override
    public String toString() {
        return "Gato [nome=" + getNome() + ", porte=" + getPorte() +
               ", idade=" + getIdade() + ", ambienteEspecial=" + ambienteEspecial + "]";
    }
}
 