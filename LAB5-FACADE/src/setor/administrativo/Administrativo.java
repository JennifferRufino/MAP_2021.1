package setor.administrativo;

import java.time.LocalDate;

public class Administrativo {
    private Evento evento;

    public Administrativo() {
        this.evento = new Evento();
    }

    public void agendarReuniaoDaDiretoria(LocalDate dataDaReuniao) {
        this.evento.agendarReuniao(dataDaReuniao);
    }

    public void agendarEntrevistaDaDiretoria(LocalDate dataDaEntrevista) {
        this.evento.agendarEntrevista(dataDaEntrevista);
    }

    public void reunioesAgendadasDiretoria() {
        this.evento.mostrarReunioesDiretoria();
    }

    public void entrevistasAgendadasDiretoria() {
        this.evento.mostrarEntrevistasDiretoria();
    }
}
