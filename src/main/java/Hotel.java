import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> hotelBedRooms;
    private ArrayList<Room> hotelCommonRooms;

    public Hotel() {
        this.hotelBedRooms = new ArrayList<>(); //the rooms in the hotel that are beds
        this.hotelCommonRooms = new ArrayList<>(); //the rooms in the hotel that are common
    }


    public int size() {
        return this.hotelBedRooms.size();
    }

    public void addBedRoom(Room room) {
        this.hotelBedRooms.add(room);
    }

    public void addCommonRoom(Room room) {
        this.hotelCommonRooms.add(room);
    }

    public void addGuest(Guest guest, Room room) {
        room.addGuest(guest);
    }

    public void removeAllGuests(Room room) {
        room.removeGuests();
    }


    public Booking createBooking(Guest guest, Room room, String roomName, int numberOfNights) {

        if (roomOccupancy() != 0) {
            room.addGuest(guest);
            Booking booking = new Booking();
            booking.bookRoom(roomName, numberOfNights);
            return booking;
        }
        return null;
    }



    public int roomOccupancy() {
        int freeRooms = 0;
        for (int i = 0; i < size(); i++){
            Room room =  hotelBedRooms.get(i);
            if (room.checkRoomOccupancy() == 0 ){
                freeRooms++;
            }
        }
        return freeRooms;
    }
}


