package korisnik;

public class Korisnik {
    private String ime;
    private String prezime;
    private TipKorisnika tipKorisnika;

    public Korisnik(String ime, String prezime, TipKorisnika tipKorisnika) {
        this.ime = ime;
        this.prezime = prezime;
        this.tipKorisnika = tipKorisnika;
    }
}
