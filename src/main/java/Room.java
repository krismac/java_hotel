import java.util.ArrayList;

public class Room {

    //instance variables
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guest;
    private String type;
    private double rate;

    //One off class creation/init:

    public Room(int roomNumber, int capacity, String type, double rate){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guest = new ArrayList<>();
        this.rate = rate;
    }


    public void addGuest(Guest guest) {
        this.guest.add(guest);
    }

    public int checkRoomOccupancy(){
        return this.guest.size(); //checking the guest array
    }

    public void removeGuests() {
        this.guest.clear();
    }

}





