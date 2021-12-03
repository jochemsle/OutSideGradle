package Functies;

import java.util.ArrayList;
import java.util.List;

public class Van {

    private final int length, width,hight;
    private final List<Package> packages;
    private String identifier;
    private final int maxSquareMeters;
    private int freeSpace;


    public Van(int length, int width,int hight,String naam) {
        this.length = length;
        this.width = width;
        this.packages = new ArrayList<>();
        this.hight = hight;
        this.identifier = naam;
        maxSquareMeters = length * width;
        freeSpace = maxSquareMeters;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public List<Package> getPackages() {
        return packages;
    }

    public void addPackage(Package _package){
        freeSpace = freeSpace - (_package.getBreadth() * _package.getLength());
        packages.add(_package);
    }
    public void removePackage(Package _package){
        freeSpace = freeSpace + (_package.getBreadth() * _package.getLength());
        packages.remove(_package);
    }
}
