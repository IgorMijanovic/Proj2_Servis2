package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sala {
    private String imeSale;
    private String opisSale;
    private int brojPersonalnihTrenera;
    private int ogranicenjeZaGrupniTrening;
    private List<TipoviTreninga> kojeTipoveTreningaPOdrzava;
    private Map<TipoviTreninga, Integer> ceneZaTipoveTreninga;

    public Sala(String imeSale, String opisSale, int brojPersonalnihTrenera, int ogranicenjeZaGrupniTrening) {
        this.imeSale = imeSale;
        this.opisSale = opisSale;
        this.brojPersonalnihTrenera = brojPersonalnihTrenera;
        this.ogranicenjeZaGrupniTrening = ogranicenjeZaGrupniTrening;
        kojeTipoveTreningaPOdrzava = new ArrayList<TipoviTreninga>();
        ceneZaTipoveTreninga = new HashMap<TipoviTreninga, Integer>();
    }


}
