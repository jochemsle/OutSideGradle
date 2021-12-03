package Functies;

public class Client implements Comparable<Client> {
    private final int ClientID, AddressX, AddressY;
    private final String Name, Initials;

    public Client(int clientID, String name, String initials, int addressX, int addressY) {
        ClientID = clientID;
        Name = name;
        Initials = initials;
        AddressX = addressX;
        AddressY = addressY;
    }

    public int getClientID() {
        return ClientID;
    }

    public String getName() {
        return Name;
    }

    public String getInitials() {
        return Initials;
    }

    public int getAddressX() {
        return AddressX;
    }

    public int getAddressY() {
        return AddressY;
    }

    @Override
    public int compareTo(Client client) {
        if (this.ClientID > client.ClientID) {
            return 1;
        }
        else if (this.ClientID < client.ClientID) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
