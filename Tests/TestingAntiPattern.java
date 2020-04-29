import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
public class TestingAntiPattern {

    private static Federacao _federacao;
    private static Prova _prova;
    private static Utilizador _utilizador;
    private static RegistoProva _registoProva;

    @BeforeAll
    static void initialize(){
        _federacao = Federacao.getInstance();
        _prova = new Prova(50, LocalDate.now(), LocalDate.now(), 2, _federacao);
        _utilizador = new Utilizador("Ricardo", "ativo", 21,1, "Viseu");
        _registoProva = new RegistoProva(1,_utilizador,_prova);

    }


    @Test
    public void testUserSetNome(){
        _utilizador.setNome("Quim Barreiros");
        assertEquals("Quim Barreiros", _utilizador.getNome());
    }


    @Test
    public void testUserSetIdade(){
        _utilizador.setIdade(79);
        assertEquals(79, _utilizador.getIdade());
    }


    @Test
    public void testClienteSetMorada(){
        _utilizador.setMorada("Coimbra");
        assertEquals("Coimbra", _utilizador.getMorada());
    }


    @Test
    public void testClienteSetEstado(){
        _utilizador.setEstado("inativo");
        assertEquals("inativo", _utilizador.getEstado());
    }


    @Test
    public void testXPTO(){
        Federacao federacao = new Federacao("FAV", LocalDate.now(), "Portugal");
        Prova provinha = new Prova(200, LocalDate.now(), LocalDate.now(), 2,federacao);

        provinha.setFederacaoOrganizacao(federacao);
        assertEquals(federacao, provinha.getFederacaoOrganizacao());
    }


    @Test
    public void testProvaGetVencedor(){
        Utilizador utilizador = new Utilizador("Quim", "ativo", 21, 2,"Viseu");
        Prova prova = new Prova(200, LocalDate.now(), LocalDate.now(), 2,_federacao );

        System.out.println("Foi criado um Utilizador:");
        System.out.println("\nNome: " + utilizador.getNome());
        System.out.println("\nEstado: " + utilizador.getEstado());
        System.out.println("\nIdade: " + utilizador.getIdade());
        System.out.println("\nNAtleta: " + utilizador.getnAtleta());
        System.out.println("\nMorada: " + utilizador.getMorada());

        System.out.println("Foi criado uma Prova:");
        System.out.println("\nNConcorrentes: " + prova.getNconcorrentes());
        System.out.println("\nData Inicio: " + prova.getDataInicioProva());
        System.out.println("\nData Fim: " + prova.getDataFimProva());
        System.out.println("\nIdProva " + prova.getIdProva());
        System.out.println("\nFederaçao: " + prova.getFederacaoOrganizacao());

        RegistoProva registoProva = new RegistoProva(1,utilizador,prova);
        prova.setVencedor(utilizador);

        assertEquals(utilizador, prova.getVencedor());
    }


    @Test
    public void testFederacaoRegistarProva(){
        assertDoesNotThrow(() -> {
            Prova Provinha = _federacao.CriarProva(_prova);
            assertEquals("Quim Barreiros", _utilizador.getNome());
            assertDoesNotThrow(() -> {
                _federacao.RegistarProva(_utilizador,Provinha);
            });
        });
    }

}
