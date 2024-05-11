public class PersonBuilder {

    private Integer eta;
    private String indirizzo;
    private String nome;
    private String cognome;

    public PersonBuilder( String nome, String cognome) {

       this.nome = nome;
       this.cognome =cognome;
    }

    public PersonBuilder setEta(Integer eta) {
        this.eta = eta;
        return this;
    }

    public PersonBuilder setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
        return this;
    }
    public Person build(){
        return new Person (nome , cognome , eta , indirizzo);
    }

    @Override
    public String toString() {
        return "PersonBuilder{" +
                "eta=" + eta +
                ", indirizzo='" + indirizzo + '\'' +
                '}';
    }
}
