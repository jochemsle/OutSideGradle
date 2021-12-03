package Functies;

import Regios.Regio;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class PakketDienst {

    private final int xPos, yPos;
    private final List<Van> vans;
    private final List<Driver> drivers;
    private final List<Client> clientList;
    private final List<Package> packageList;

    private int minX = 1000;
    private int minY = 1000;
    private int maxX = 0;
    private int maxY = 0;

    private List<Regio> regioList = new ArrayList<>();

    public PakketDienst(int xPos, int yPos,String clients,String packages) throws FileNotFoundException, ParseException {
        this.xPos = xPos;
        this.yPos = yPos;
        this.vans = new ArrayList<>();
        this.drivers = new ArrayList<>();
        this.packageList =readPackages(packages);
        this.clientList = readClients(clients);
    }
    public List<Client> readClients(String clients) throws FileNotFoundException {
        List<Client> clientList = new ArrayList<>();
        Scanner clientReader = new Scanner(new File(clients));
        clientReader.nextLine();
        while (clientReader.hasNextLine()) {
            String line = clientReader.nextLine();
            String[] lineParts = line.split(";");
            int ClientID = Integer.parseInt(lineParts[0]);
            String name = lineParts[1];
            String initials = lineParts[2];
            int adressX = Integer.parseInt(lineParts[3]);
            int adressY = Integer.parseInt(lineParts[4]);
            Client client = new Client(ClientID,name,initials,adressX,adressY);
            clientList.add(client);
            if (adressX > maxX) {
                maxX = adressX;
            }
            else if (adressX < minX) {
                minX = adressX;
            }
            if (adressY > maxY) {
                maxY = adressY;
            }
            else if (adressY < maxY) {
                minY = adressY;
            }
        }
        return clientList;
    }
    public List<Package> readPackages(String packages) throws FileNotFoundException, ParseException {
        List<Package> packageList = new ArrayList<>();
        Scanner packageReader = new Scanner(new File(packages));
        packageReader.nextLine();
        while (packageReader.hasNextLine()) {
            String line = packageReader.nextLine();
            String[] lineParts = line.split(";");
            int packageID = Integer.parseInt(lineParts[0]);
            int Length = Integer.parseInt(lineParts[1]);
            int Breadth = Integer.parseInt(lineParts[2]);
            int Hight = Integer.parseInt(lineParts[3]);
            double Weight = Double.parseDouble(lineParts[4]);

            Date entryDate = new SimpleDateFormat("dd-MM-yyyy").parse(lineParts[5]);
            int ClientID = Integer.parseInt(lineParts[6]);
            Package aPackage = new Package(packageID,Length,Breadth,Hight,Weight,entryDate,ClientID);
            packageList.add(aPackage);
        }
        return packageList;
    }


    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public List<Van> getVans() {
        return vans;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void addVan(Van van){
        vans.add(van);
    }

    public void addDriver(Driver driver){
        drivers.add(driver);
    }

    public void removeVan(Van van){
        vans.remove(van);
    }

    public void removeDriver(Driver driver){
        drivers.remove(driver);
    }
    public int getMinX() {
        return minX;
    }

    public int getMinY() {
        return minY;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public List<Regio> getRegioList() {
        return regioList;
    }

    public void setRegioList(List<Regio> regioList) {
        this.regioList = regioList;
    }

}
