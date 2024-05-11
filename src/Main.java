

/*Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
Il costruttore accetterà un Builder in input
Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
Creare due oggetti Person e stamparli a video*/

public class Main {
    public static void main(String[] args) {
        PersonBuilder builder= new PersonBuilder("Carlo" , "Giorgione");
        builder.setEta(21);
        builder.setIndirizzo("via roma 22");
        Person carlo = builder.build();
        PersonBuilder builder1 = new PersonBuilder("Peppe" ,"Giordano");
        builder1.setEta(34);
        builder1.setIndirizzo("via caloprese 1");
        Person peppe = builder1.build();
        System.out.println(carlo);
        System.out.println(peppe);

    }
}