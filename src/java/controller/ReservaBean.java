package java.controller;

import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;

import java.io.Serializable;

@Named
@ViewScoped
public class ReservaBean implements Serializable {

    private String tipoAnimal;
    private String porte;
    private boolean banho;
    private boolean medicamento;

    private double total;

    public String salvarReserva() {
        System.out.println("Reserva salva!");

        return "cadastro";
    }


    public void calcularTotal() {
        total = 0;

        // Cão
        if ("Cão".equals(tipoAnimal)) {
            total = 50;
        }
        if ("Grande".equals(porte)) {
            total += 20;
        }

        //Gato

        else if ("Gato".equals(tipoAnimal)) {
            total = 40;
        }
        //Serviços extras

        if (banho) {
            total += 15;
        }
        if (medicamento) {
            total += 20;
        }
    }

    //Getters e Setters

    public String getTipoAnimal() {
        return tipoAnimal;
    }
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getPorte() {
        return porte;
    }
    public void setPorte(String porte) {
        this.porte = porte;
    }

    public boolean isBanho() {
        return banho;
    }
    public void setBanho(boolean banho) {
        this.banho = banho;
    }

    public boolean isMedicamento() {
        return medicamento;
    }
    public void setMedicamento(boolean medicamento) {
        this.medicamento = medicamento;
    }

    public double getTotal() {
        return total;
    }


}