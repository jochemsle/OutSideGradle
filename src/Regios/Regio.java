package Regios;

import Functies.Package;

import java.util.List;

public class Regio {
    private List<Package> packageList;

    public Regio(String naam, int beginX, int beginY, int eindeX, int eindeY) {
        this.beginX = beginX;
        this.beginY = beginY;
        this.eindeX = eindeX;
        this.eindeY = eindeY;
        this.naam = naam;
    }
    private final String naam;
    private final int beginX;
    private final int beginY;

    private final int eindeX;
    private final int eindeY;


}
