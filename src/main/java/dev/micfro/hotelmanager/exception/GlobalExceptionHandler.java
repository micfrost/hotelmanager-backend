package dev.micfro.hotelmanager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<HotelzimmerException> handleTypeMismatch(MethodArgumentTypeMismatchException ex) {
        HotelzimmerException exceptionResponse = new HotelzimmerException();
        exceptionResponse.setMessage("Invalid request parameter: " + ex.getName());
        exceptionResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        exceptionResponse.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
    }

}
