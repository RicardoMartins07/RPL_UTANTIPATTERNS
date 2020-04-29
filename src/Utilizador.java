public class Utilizador{

    private String nome, estado;
    private int idade , nAtleta;
    private String morada;

    public Utilizador(String nome, String estado, int idade, int nAtleta, String morada) {
        this.nome = nome;
        this.estado = estado;
        this.idade = idade;
        this.nAtleta = nAtleta;
        this.morada = morada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getnAtleta() {
        return nAtleta;
    }

    public void setnAtleta(int nAtleta) {
        this.nAtleta = nAtleta;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }
}
