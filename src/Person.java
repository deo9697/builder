public class Person {
private String nome;
private String cognome;
private Integer eta;
private String indirizzo;

    public Person(String nome, String cognome, Integer eta, String indirizzo) {
        this.cognome = nome;
        this.nome = cognome;
        this.indirizzo = indirizzo;
        this.eta = eta;

    }


    @Override
    public String toString() {
        return "Person{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", indirizzo='" + indirizzo + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }


}
