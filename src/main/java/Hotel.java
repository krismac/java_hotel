import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> hotelRooms;
//    private ArrayList<Guest> hotelGuests;

    public Hotel(){
        this.hotelRooms = new ArrayList<>(); //the rooms in the hotel
    }


    public int size() {
        return this.hotelRooms.size();
    }

    public void addRoom(Room room) {
        this.hotelRooms.add(room);
    }


//    public int guestsInHotel() {
//        return this.hotelGuests.size();
//    }

    public void addGuest(Guest guest, Room room){
//        this.hotelGuests.add(guest);
        room.addGuest(guest);
    }

    public void removeAllGuests(Room room) {
        room.removeGuests();
    }

    public Booking createBooking(Guest guest, Room room, String roomName, int numberOfNights) {
        room.addGuest(guest);
        Booking booking = new Booking();
        booking.bookRoom(roomName, numberOfNights);
        return booking;
    }

}


