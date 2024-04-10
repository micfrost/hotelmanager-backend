package dev.micfro.hotelmanager.exception;

public class HotelzimmerNotFoundExceptions extends RuntimeException { // custom exception class

    public HotelzimmerNotFoundExceptions(String message){
        super(message);
    }
}
