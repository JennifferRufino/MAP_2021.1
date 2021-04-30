package setor.administrativo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Evento {
    private ArrayList<LocalDate> reunioes;
    private ArrayList<LocalDate> entrevistas;

    public Evento() {
        this.reunioes = new ArrayList<>();
        this.entrevistas = new ArrayList<>();
    }

    public ArrayList<LocalDate> getReunioes() {
        return this.reunioes;
    }

    public ArrayList<LocalDate> getEntrevistas() {
        return this.entrevistas;
    }

    public void agendarReuniao(LocalDate dataDaReuniao) {
        this.reunioes.add(dataDaReuniao);
    }

    public void agendarEntrevista(LocalDate dataDaEntrevista) {
        this.entrevistas.add(dataDaEntrevista);
    }

    public void mostrarReunioesDiretoria() {
        for (LocalDate date : reunioes) {
            System.out.printf("Data: %d/%d/%d\n", date.getDayOfMonth(), date.getMonthValue(), date.getYear());
        }
    }
    public void mostrarEntrevistasDiretoria() {
        for (LocalDate date : entrevistas) {
            System.out.printf("Data: %d/%d/%d\n", date.getDayOfMonth(), date.getMonthValue(), date.getYear());
        }
    }
}
