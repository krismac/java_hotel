import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;

    @Before
    public void before(){
        booking = new Booking();
    }

    @Test
    public void checkBooking(){
        booking.bookRoom("Sexy Suite", 5);
        assertEquals(5, booking.checkBooking());
    }

    @Test // calculate a booking total cost
    public void canCalculateBookingCost(){
        booking.bookRoom("Sexy Suite", 5);
       int bookingCost = 1001;
        assertEquals(5005, booking.calculateBookingCost(bookingCost));
    }

}
