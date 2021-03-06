import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest { //things on the class (blueprint)

    private Room conferenceRoom;
    private Room bedroom;
    private Room bedroomTwo;
    private Room bedroomThree;
    private Room diningRoom;
    private Guest guestOne;
    private Hotel hotelOne;


    @Before
    public void before() { //physical things that exist from the blueprint that you can pass in/around/tie to things.
        hotelOne = new Hotel();
        conferenceRoom = new Room(1, 100, "Conference", 100);
        bedroom = new Room(2, 2, "Sexy Suite", 1001);
        bedroomTwo = new Room(2, 1, "Lonely Room", 1001);
        bedroomThree = new Room(2, 4, "Lovely Suite", 1001);
        diningRoom = new Room(3, 10, "Breakfast Room", 10.99);
        hotelOne.addCommonRoom(this.conferenceRoom);
        hotelOne.addBedRoom(this.bedroom);
        hotelOne.addCommonRoom(this.diningRoom);
        hotelOne.addBedRoom(this.bedroomTwo);
        hotelOne.addBedRoom(this.bedroomThree);
        guestOne = new Guest();
    }

    @Test //adding rooms to hotel
    public void canAddRoomToHotel() {
        hotelOne.addBedRoom(this.bedroom);
        assertEquals(4, hotelOne.size());
    }


    @Test //adding guests to room
    public void canAddGuestToRoom() {
        hotelOne.addGuest(guestOne, bedroom);
        assertEquals(1, bedroom.checkRoomOccupancy());
    }

    @Test //adding guests to room
    public void canCreateBooking() {
        hotelOne.createBooking(guestOne, bedroom, "Sexy Suite", 5);
        assertEquals(1, bedroom.checkRoomOccupancy());
    }


    @Test //removing guests from room array
    public void canRemoveGuestsfromRoom() {
        hotelOne.removeAllGuests(bedroom);
        assertEquals(0, bedroom.checkRoomOccupancy());

    }

    @Test //loop through bedrooms to understand capacity
    public void checkRoomOccupancy(){
        hotelOne.addGuest(guestOne, bedroom);
        hotelOne.createBooking(guestOne, bedroom, "Sexy Suite", 5);
        assertEquals(2, hotelOne.roomOccupancy());

    }

}

