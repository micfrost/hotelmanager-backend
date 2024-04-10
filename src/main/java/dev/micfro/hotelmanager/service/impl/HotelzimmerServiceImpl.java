package dev.micfro.hotelmanager.service.impl;

import dev.micfro.hotelmanager.model.Hotelzimmer;
import dev.micfro.hotelmanager.repository.HotelzimmerRepository;
import dev.micfro.hotelmanager.service.HotelzimmerService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelzimmerServiceImpl implements HotelzimmerService {

    private final HotelzimmerRepository hotelzimmerRepository;

    @Autowired
    public HotelzimmerServiceImpl(HotelzimmerRepository hotelzimmerRepository) {
        this.hotelzimmerRepository = hotelzimmerRepository;
    }

    // CRUD OPERATIONS
    // CREATE
    @Transactional
    @Override
    public void save(Hotelzimmer theHotelzimmer) {
        hotelzimmerRepository.save(theHotelzimmer);
    }


    // READ
    @Override
    public List<Hotelzimmer> findAll() {
        return hotelzimmerRepository.findAll();
    }


    @Override
    public Hotelzimmer findById(Long theId) {
        Optional<Hotelzimmer> result = hotelzimmerRepository.findById(theId);
        Hotelzimmer hotelzimmer = null;

        // Check if the result is present
        if (result.isPresent()) {
            hotelzimmer = result.get();
        } else {
            // Throw a runtime exception if the hotelzimmer with the given ID is not found
            throw new RuntimeException("Hotelzimmer mit der Nummer " + theId + " wurde  leider nicht gefunden.");
        }
        return hotelzimmer;
    }


    // UPDATE
    @Transactional
    @Override
    public Hotelzimmer update(Hotelzimmer theHotelzimmer) {
        return hotelzimmerRepository.save(theHotelzimmer);
    }


    // DELETE
    @Override
    public String deleteById(Long theId) {
        hotelzimmerRepository.deleteById(theId);
        return " ---> SPRING RuntimeException: Hotelzimmer mit der Nummer " + theId + " wurde erfolgreich gelöscht.";
    }
}
