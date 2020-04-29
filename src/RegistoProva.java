import java.time.LocalDate;

public class RegistoProva {
    private int Nregisto;
    private Utilizador user;
    private Prova prova;

    public RegistoProva(int nregisto, Utilizador user, Prova prova) {
        Nregisto = nregisto;
        this.user = user;
        this.prova = prova;
    }

    public int getNregisto() {
        return Nregisto;
    }

    public void setNregisto(int nregisto) {
        Nregisto = nregisto;
    }

    public Utilizador getUser() {
        return user;
    }

    public void setUser(Utilizador user) {
        this.user = user;
    }

    public Prova getProva() {
        return prova;
    }

    public void setProva(Prova prova) {
        this.prova = prova;
    }


}


