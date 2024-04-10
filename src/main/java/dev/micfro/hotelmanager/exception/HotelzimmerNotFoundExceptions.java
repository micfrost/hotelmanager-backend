package dev.micfro.hotelmanager.exception;

// Custom exception class for hotelzimmer not found exceptions
public class HotelzimmerNotFoundExceptions extends RuntimeException {

    // Constructor
    public HotelzimmerNotFoundExceptions(String message){

        // Calls the constructor of the superclass (RuntimeException) with the provided message
        super(message);
    }
}
