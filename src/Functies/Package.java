package Functies;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Package implements Comparable<Package> {
    private final int PackageID, Length, Breadth, Hight, ClientID;
    private final double Weight;
    private final Date EntryDate;
    private Status status;

    public Package(int packageID, int length, int breadth, int hight, double weight, Date entryDate, int clientID) {
        PackageID = packageID;
        Length = length;
        Breadth = breadth;
        Hight = hight;
        Weight = weight;
        EntryDate = entryDate;
        ClientID = clientID;
        status = Status.BINNENGEKOMEN;
    }
    public void add(Package _package){};

    public int getPackageID() {
        return PackageID;
    }

    public int getLength() {
        return Length;
    }

    public int getBreadth() {
        return Breadth;
    }

    public int getHight() {
        return Hight;
    }

    public double getWeight() {
        return Weight;
    }

    public Date getEntryDate() {
        return EntryDate;
    }

    public int getClientID() {
        return ClientID;
    }

    @Override
    public int compareTo(Package apackage) {
        if (this.EntryDate.after(apackage.EntryDate)) {
            return 1;
        }
        else if (this.EntryDate.before(apackage.EntryDate)) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
