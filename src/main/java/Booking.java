public class Booking {

    private String roomName;
    private int numberOfNights;

    public Booking(){
        this.roomName = new String();
        this.numberOfNights = 0;
    }

    public void bookRoom(String roomName, int numberOfNights){
        this.roomName = roomName;
        this.numberOfNights = numberOfNights;
    }

    public int checkBooking() {
        return this.numberOfNights;
    }


    public int calculateBookingCost(int bookingCost) {
        return numberOfNights*bookingCost;
    }
}

