package dev.micfro.hotelmanager.restController;

import dev.micfro.hotelmanager.entity.Hotelzimmer;
import dev.micfro.hotelmanager.service.HotelzimmerService;
import org.springframework.beans.factory.annotation.Autowired;
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

        if (hotelzimmer == null) {
            throw new RuntimeException("Hotelzimmer mit der Nummer " + hotelzimmerId + " wurde leider nicht gefunden.");
        }
        return hotelzimmer;
    }

    // CREATE
    @PostMapping("/hotelzimmer")
    public Hotelzimmer addHotelzimmer(@RequestBody Hotelzimmer theHotelzimmer) {
        hotelzimmerService.save(theHotelzimmer);
        return theHotelzimmer;
    }

    // UPDATE
    @PutMapping("/hotelzimmer")
    public Hotelzimmer updateHotelzimmer(@RequestBody Hotelzimmer theHotelzimmer) {

        return hotelzimmerService.update(theHotelzimmer);
    }

    // DELETE
    @DeleteMapping("/hotelzimmer/{hotelzimmerId}")
    public String deleteHotelzimmerById(@PathVariable Long hotelzimmerId) {
        Hotelzimmer hotelzimmer = hotelzimmerService.findById(hotelzimmerId);
        if (hotelzimmer == null) {
            throw new RuntimeException("Hotelzimmer mit der Nummer " + hotelzimmerId + " wurde leider nicht gefunden.");
        }
        hotelzimmerService.deleteById(hotelzimmerId);
        return "Hotelzimmer mit der Nummer " + hotelzimmerId + " wurde erfolgreich gelöscht.";
    }

}
