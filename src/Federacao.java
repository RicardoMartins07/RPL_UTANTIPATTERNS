import Exceptions.ProvaNaoExistenteException;
import Exceptions.UtilizadorNaoExistenteException;

import java.time.LocalDate;
import java.util.ArrayList;


public class Federacao {
    private static volatile Federacao instance;
    private ArrayList<Prova> listaProvas = new ArrayList<>();
    private ArrayList<Utilizador> listaAtletas = new ArrayList<>();
    private ArrayList<RegistoProva> listaRegistoProvas = new ArrayList<>();
    private String Nome;
    private LocalDate datafundacao;
    private String paisOrigem;

    public Federacao(String nome, LocalDate datafundacao, String paisOrigem) {
        Nome = nome;
        int natletas = 3;
        this.datafundacao = datafundacao;
        this.paisOrigem = paisOrigem;
        for (int i = 0; i < natletas; i++) {
            Utilizador atleta = new Utilizador("Ricardo","ativo",21,i,"Viseu");
            listaAtletas.add(atleta);
        }
    }

    public static Federacao getInstance() {
        if (instance == null) {
            synchronized (Federacao.class) {
                if (instance == null) {
                    instance = new Federacao("FAV",LocalDate.now(),"Portugal");
                }
            }
        }
        return instance;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public LocalDate getDatafundacao() {
        return datafundacao;
    }

    public void setDatafundacao(LocalDate datafundacao) {
        this.datafundacao = datafundacao;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public synchronized void resetFederacao(){
        listaProvas.clear();

    }

    public synchronized RegistoProva RegistarProva(Utilizador utilizador,Prova prova) throws UtilizadorNaoExistenteException, ProvaNaoExistenteException {
        if (!listaAtletas.contains(utilizador)){
            throw new UtilizadorNaoExistenteException();
        }
        else if (!listaProvas.contains(prova)){
            throw  new ProvaNaoExistenteException();
        }
        else{
            RegistoProva registoProva = new RegistoProva(utilizador.getnAtleta(),utilizador,prova);
            listaRegistoProvas.add(registoProva);
            return registoProva;
        }
    }

    public synchronized Prova CriarProva(Prova provazinha) throws ProvaNaoExistenteException{
       if (listaProvas.contains(provazinha)){
           System.out.println("Prova já existe");
        }
        else{
            listaProvas.add(provazinha);
        }
        return provazinha;
    }
}















