package dev.micfro.hotelmanager.controller;

import dev.micfro.hotelmanager.exception.HotelzimmerException;
import dev.micfro.hotelmanager.exception.HotelzimmerNotFoundExceptions;
import dev.micfro.hotelmanager.model.Hotelzimmer;
import dev.micfro.hotelmanager.service.HotelzimmerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;


import java.util.List;

@RestController
@org.springframework.web.bind.annotation.RequestMapping("/api")
public class HotelzimmerRestController {

    private final HotelzimmerService hotelzimmerService;

    @Autowired
    public HotelzimmerRestController(HotelzimmerService hotelzimmerService) {
        this.hotelzimmerService = hotelzimmerService;
    }

    // CRUD OPERATIONS

    // READ ALL
    @GetMapping("/hotelzimmer")
    public List<Hotelzimmer> findAll() {
        return hotelzimmerService.findAll();
    }

    // READ BY ID
    @GetMapping("/hotelzimmer/{hotelzimmerId}")
    public Hotelzimmer getHotelzimmerById(@PathVariable Long hotelzimmerId) {
        Hotelzimmer hotelzimmer = hotelzimmerService.findById(hotelzimmerId);

        // Check if the hotelzimmer is not found
        if ((hotelzimmerId >= hotelzimmerService.findAll().size()+1) || (hotelzimmerId <= 0))  {
            // Throw custom exception if hotelzimmer is not found
            throw new HotelzimmerNotFoundExceptions("Hotelzimmer mit der Nummer " + hotelzimmerId + " wurde leider nicht gefunden.");
        }

        return hotelzimmer;
    }

    // CREATE
    @PostMapping("/hotelzimmer")
    public Hotelzimmer addHotelzimmer(@Valid @RequestBody Hotelzimmer theHotelzimmer) {
        hotelzimmerService.save(theHotelzimmer);
        return theHotelzimmer;
    }

    // UPDATE
    @PutMapping("/hotelzimmer")
    public Hotelzimmer updateHotelzimmer(@Valid @RequestBody Hotelzimmer theHotelzimmer) {

        return hotelzimmerService.update(theHotelzimmer);
    }

    // DELETE
    @DeleteMapping("/hotelzimmer/{hotelzimmerId}")
    public String deleteHotelzimmerById(@PathVariable Long hotelzimmerId) {

        // Check if the hotelzimmer is not found
        if ((hotelzimmerId >= hotelzimmerService.findAll().size()+1) || (hotelzimmerId <= 0))  {
            // Throw custom exception if hotelzimmer is not found
            throw new HotelzimmerNotFoundExceptions("Hotelzimmer mit der Nummer " + hotelzimmerId + " wurde leider nicht gefunden.");
        }
        hotelzimmerService.deleteById(hotelzimmerId);
        return "Hotelzimmer mit der Nummer " + hotelzimmerId + " wurde erfolgreich gelöscht.";
    }

    // Exception handling methods
    // Not found exception
    @ExceptionHandler
    public ResponseEntity<HotelzimmerException> handleException(HotelzimmerNotFoundExceptions e) {

        // Handle HotelzimmerNotFoundExceptions and return a ResponseEntity with a custom HotelzimmerException
        // object containing the exception message, status and timestamp to see in response body (JSON) in Postman

        // Creating a custom HotelzimmerException to encapsulate the error details
        HotelzimmerException exceptions = new HotelzimmerException();
        exceptions.setMessage("Exception: " + e.getMessage());
        exceptions.setStatus(HttpStatus.NOT_FOUND.value());
        exceptions.setTimeStamp(System.currentTimeMillis()
        );

        return new ResponseEntity<>(exceptions, HttpStatus.NOT_FOUND);
    }

    // type mismatch exception
    @ExceptionHandler
    public ResponseEntity<HotelzimmerException> handleException(MethodArgumentTypeMismatchException e) {

        // Handle MethodArgumentTypeMismatchException and return a ResponseEntity with a custom HotelzimmerException
        // object containing the exception message, status and timestamp to see in response body (JSON) in Postman
        HotelzimmerException exceptions = new HotelzimmerException();
        exceptions.setMessage("Invalid request parameter: " + e.getName());
        exceptions.setStatus(HttpStatus.BAD_REQUEST.value());
        exceptions.setTimeStamp(System.currentTimeMillis()
        );
        return new ResponseEntity<>(exceptions, HttpStatus.BAD_REQUEST);
    }

    // any else exception
    @ExceptionHandler
    public ResponseEntity<HotelzimmerException> handleException(Exception e) {

        // Handle other exceptions and return a ResponseEntity with a custom HotelzimmerException
        // object containing the exception message, status and timestamp to see in response body (JSON) in Postman
        HotelzimmerException exceptions = new HotelzimmerException();
        exceptions.setMessage("Exception: " + e.getMessage());
        exceptions.setStatus(HttpStatus.BAD_REQUEST.value());
        exceptions.setTimeStamp(System.currentTimeMillis()
        );

        return new ResponseEntity<>(exceptions, HttpStatus.BAD_REQUEST);
    }

}
