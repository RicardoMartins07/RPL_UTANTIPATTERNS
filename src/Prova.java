import java.time.LocalDate;
import java.util.ArrayList;

public class Prova {
    private int Nconcorrentes;
    private LocalDate dataInicioProva;
    private LocalDate dataFimProva;
    private int IdProva;
    private Federacao FederacaoOrganizacao;
    private Utilizador vencedor;


    public Prova(int nconcorrentes, LocalDate dataInicioProva, LocalDate dataFimProva, int idProva, Federacao federacaoOrganizacao) {
        Nconcorrentes = nconcorrentes;
        this.dataInicioProva = dataInicioProva;
        this.dataFimProva = dataFimProva;
        IdProva = idProva;
        FederacaoOrganizacao = federacaoOrganizacao;
    }

    public Utilizador getVencedor() {
        return vencedor;
    }

    public void setVencedor(Utilizador vencedor) {
        this.vencedor = vencedor;
    }

    public Federacao getFederacaoOrganizacao() {
        return FederacaoOrganizacao;
    }

    public void setFederacaoOrganizacao(Federacao federacaoOrganizacao) {
        FederacaoOrganizacao = federacaoOrganizacao;
    }

    public int getNconcorrentes() {
        return Nconcorrentes;
    }

    public void setNconcorrentes(int nconcorrentes) {
        Nconcorrentes = nconcorrentes;
    }

    public LocalDate getDataInicioProva() {
        return dataInicioProva;
    }

    public void setDataInicioProva(LocalDate dataInicioProva) {
        this.dataInicioProva = dataInicioProva;
    }

    public LocalDate getDataFimProva() {
        return dataFimProva;
    }

    public void setDataFimProva(LocalDate dataFimProva) {
        this.dataFimProva = dataFimProva;
    }

    public int getIdProva() {
        return IdProva;
    }

    public void setIdProva(int idProva) {
        IdProva = idProva;
    }
}
