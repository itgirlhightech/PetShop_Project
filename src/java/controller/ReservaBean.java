package java.controller;

import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.model.Animal;
import java.model.Cao;
import java.model.Gato;
import java.model.Reserva;
import util.HistoricoCSV;

@Named
@ViewScoped
public class ReservaBean implements Serializable {

    private String tipoAnimal;
    private String porte;
    private boolean banho;
    private boolean medicamento;
    private boolean incluiPasseio;
    private double total;

    private static List<Reserva> historico = new ArrayList<>();

    public String salvarReserva() {
        Animal animal;

        if ("Cao".equals(tipoAnimal)) {
            animal = new Cao("Pet", porte, 0, incluiPasseio);
        } else {
            animal = new Gato("Pet", porte, 0, false);
        }

        Reserva reserva = new Reserva(animal, banho, medicamento);
        historico.add(reserva);

        HistoricoCSV.salvarHistorico(historico, "reservas.csv");

        System.out.println("Reserva salva!");
        return "cadastro";
    }

    public void calcularTotal() {
        total = 0;

        if ("Cao".equals(tipoAnimal)) {
            total = 50.0;
            if ("Grande".equals(porte)) total += 20.0;
            if (incluiPasseio) total += 30.0;
        } else if ("Gato".equals(tipoAnimal)) {
            total = 40.0;
        }

        if (banho) total += 15.0;
        if (medicamento) total += 20.0;
    }

    // Getters e Setters
    public String getTipoAnimal() { return tipoAnimal; }
    public void setTipoAnimal(String tipoAnimal) { this.tipoAnimal = tipoAnimal; }

    public String getPorte() { return porte; }
    public void setPorte(String porte) { this.porte = porte; }

    public boolean isBanho() { return banho; }
    public void setBanho(boolean banho) { this.banho = banho; }

    public boolean isMedicamento() { return medicamento; }
    public void setMedicamento(boolean medicamento) { this.medicamento = medicamento; }

    public boolean isIncluiPasseio() { return incluiPasseio; }
    public void setIncluiPasseio(boolean incluiPasseio) { this.incluiPasseio = incluiPasseio; }

    public double getTotal() { return total; }
}