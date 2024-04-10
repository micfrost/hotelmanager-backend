package dev.micfro.hotelmanager.exception;

public class HotelzimmerException {

    // Exception class to handle custom exceptions

    // Fields to store error message, status code, and timestamp
    private String message;
    private int status;
    private long timeStamp;

    // Constructors
    public HotelzimmerException() {
    }

    // Parameterized constructor
    public HotelzimmerException(String message, int status, long timeStamp) {
        this.message = message;
        this.status = status;
        this.timeStamp = timeStamp;
    }

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
