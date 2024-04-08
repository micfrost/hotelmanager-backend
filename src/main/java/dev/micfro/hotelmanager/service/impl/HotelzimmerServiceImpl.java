package dev.micfro.hotelmanager.service.impl;

import dev.micfro.hotelmanager.entity.Hotelzimmer;
import dev.micfro.hotelmanager.repositor.HotelzimmerRepository;
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

    // CRUD


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

        if (result.isPresent()) {
            hotelzimmer = result.get();
        } else {
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
        return "Hotelzimmer mit der Nummer " + theId + " wurde erfolgreich gelöscht.";
    }
}
