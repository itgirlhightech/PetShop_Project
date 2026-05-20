package model;
 
import interfaces.ServicoAdicional;
 
public class Reserva implements ServicoAdicional {
 
    private Animal animal;
    private boolean banho;
    private boolean medicamento;
 
    public Reserva(Animal animal) {
        this.animal = animal;
        this.banho = false;
        this.medicamento = false;
    }
 
    public Reserva(Animal animal, boolean banho, boolean medicamento) {
        this.animal = animal;
        this.banho = banho;
        this.medicamento = medicamento;
    }
 
    @Override
    public double darBanho() {
        return banho ? 15.0 : 0.0;
    }
 
    @Override
    public double administrarMedicamento() {
        return medicamento ? 20.0 : 0.0;
    }
 
    public double calcularTotal() {
        return animal.calcularDiaria() + darBanho() + administrarMedicamento();
    }
 
    public String exportarCSV() {
        return animal.getNome() + "," +
               animal.getPorte() + "," +
               animal.calcularDiaria() + "," +
               darBanho() + "," +
               administrarMedicamento() + "," +
               calcularTotal();
    }
 
    public void visualizarValorTotal() {
        System.out.println("=== Resumo da Reserva ===");
        System.out.println("Pet: " + animal.getNome());
        System.out.println("Diária: R$ " + animal.calcularDiaria());
        System.out.println("Banho: R$ " + darBanho());
        System.out.println("Medicamento: R$ " + administrarMedicamento());
        System.out.println("TOTAL: R$ " + calcularTotal());
    }
 
    // Getters e Setters
    public Animal getAnimal() { return animal; }
    public void setAnimal(Animal animal) { this.animal = animal; }
 
    public boolean isBanho() { return banho; }
    public void setBanho(boolean banho) { this.banho = banho; }
 
    public boolean isMedicamento() { return medicamento; }
    public void setMedicamento(boolean medicamento) { this.medicamento = medicamento; }
}
 