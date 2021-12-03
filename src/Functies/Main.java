package Functies;

import Regios.Regio;

import java.io.FileNotFoundException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        PakketDienst bezorgServiceTaco = new PakketDienst(375, 375, "src/resources/Clients.csv", "src/resources/Packages.csv");

        bezorgServiceTaco.addDriver(new Driver("hans"));
        bezorgServiceTaco.addDriver(new Driver("hansel"));
        bezorgServiceTaco.addDriver(new Driver("hasel"));
        bezorgServiceTaco.addDriver(new Driver("hansie"));
        bezorgServiceTaco.addDriver(new Driver("hansengrietje"));
        bezorgServiceTaco.addDriver(new Driver("hansanders"));
        bezorgServiceTaco.addDriver(new Driver("hanzel"));
        bezorgServiceTaco.addDriver(new Driver("hazel"));
        bezorgServiceTaco.addDriver(new Driver("hansBunny"));

        bezorgServiceTaco.addVan(new Van(100,100,100,"Predator 1"));
        bezorgServiceTaco.addVan(new Van(100,100,100,"Predator 2"));
        bezorgServiceTaco.addVan(new Van(100,100,100,"Predator 3"));
        bezorgServiceTaco.addVan(new Van(100,100,100,"Predator 4"));
        bezorgServiceTaco.addVan(new Van(100,100,100,"Predator 5"));
        bezorgServiceTaco.addVan(new Van(100,100,100,"Predator 6"));
        bezorgServiceTaco.addVan(new Van(100,100,100,"Predator 7"));
        bezorgServiceTaco.addVan(new Van(100,100,100,"Predator 8"));
        bezorgServiceTaco.addVan(new Van(100,100,100,"Predator 9"));

        bezorgServiceTaco.getRegioList().add(new Regio("NoordWest", bezorgServiceTaco.getMinX(), bezorgServiceTaco.getMinY(), 333,333));
        bezorgServiceTaco.getRegioList().add(new Regio("NoordMidden",333, bezorgServiceTaco.getMinY(), 666,333));
        bezorgServiceTaco.getRegioList().add(new Regio("NoordOost",666, bezorgServiceTaco.getMinY(), bezorgServiceTaco.getMaxX(), 333));

        bezorgServiceTaco.getRegioList().add(new Regio("MiddenWest", bezorgServiceTaco.getMinX(), 333,333,666));
        bezorgServiceTaco.getRegioList().add(new Regio("MidMid",333,333,666,666));
        bezorgServiceTaco.getRegioList().add(new Regio("MiddenOost",666,333, bezorgServiceTaco.getMaxX(), 666));

        bezorgServiceTaco.getRegioList().add(new Regio("ZuidWest", bezorgServiceTaco.getMinX(), 666,333, bezorgServiceTaco.getMaxY()));
        bezorgServiceTaco.getRegioList().add(new Regio("ZuidMidden",333,666,666, bezorgServiceTaco.getMaxY()));
        bezorgServiceTaco.getRegioList().add(new Regio("ZuidOost",666,666, bezorgServiceTaco.getMaxX(), bezorgServiceTaco.getMaxY()));
    }

    // TODO: Loop through client List everything between min and Max x,y add to regio ClientList
    public void getClientsInRegio(Regio regio) {

    }
}
