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


import java.util.List;

@RestController
@org.springframework.web.bind.annotation.RequestMapping("/api")
public class HotelzimmerRestController {

    private final HotelzimmerService hotelzimmerService;

    @Autowired
    public HotelzimmerRestController(HotelzimmerService hotelzimmerService) {
        this.hotelzimmerService = hotelzimmerService;
    }

    // CRUD

    // READ
    @GetMapping("/hotelzimmer")
    public List<Hotelzimmer> findAll() {
        return hotelzimmerService.findAll();
    }


    @GetMapping("/hotelzimmer/{hotelzimmerId}")
    public Hotelzimmer getHotelzimmerById(@PathVariable Long hotelzimmerId) {

        Hotelzimmer hotelzimmer = hotelzimmerService.findById(hotelzimmerId);

        if ((hotelzimmerId >= hotelzimmerService.findAll().size()+1) || (hotelzimmerId <= 0))  {
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
        Hotelzimmer hotelzimmer = hotelzimmerService.findById(hotelzimmerId);
        if ((hotelzimmerId >= hotelzimmerService.findAll().size()+1) || (hotelzimmerId <= 0))  {
            throw new HotelzimmerNotFoundExceptions("Hotelzimmer mit der Nummer " + hotelzimmerId + " wurde leider nicht gefunden.");
        }
        hotelzimmerService.deleteById(hotelzimmerId);
        return "Hotelzimmer mit der Nummer " + hotelzimmerId + " wurde erfolgreich gelöscht.";
    }


    // Not found exception
    @ExceptionHandler
    public ResponseEntity<HotelzimmerException> handleException(HotelzimmerNotFoundExceptions e) {
        HotelzimmerException exceptions = new HotelzimmerException();

        exceptions.setMessage("Exception: " + e.getMessage());
        exceptions.setStatus(HttpStatus.NOT_FOUND.value());
        exceptions.setTimeStamp(System.currentTimeMillis()
        );

        return new ResponseEntity<>(exceptions, HttpStatus.NOT_FOUND);
    }

    // any else exception
    @ExceptionHandler
    public ResponseEntity<HotelzimmerException> handleException(Exception e) {
        HotelzimmerException exceptions = new HotelzimmerException();

        exceptions.setMessage(e.getMessage());
        exceptions.setStatus(HttpStatus.BAD_REQUEST.value());
        exceptions.setTimeStamp(System.currentTimeMillis()
        );

        return new ResponseEntity<>(exceptions, HttpStatus.BAD_REQUEST);
    }

}
