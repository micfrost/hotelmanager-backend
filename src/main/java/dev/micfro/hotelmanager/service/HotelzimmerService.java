package dev.micfro.hotelmanager.service;

import dev.micfro.hotelmanager.model.Hotelzimmer;

import java.util.List;


// HotelzimmerService defines a set of methods that represent the operations that can be performed on Hotelzimmer entities.
// Implementations of this interface provides the actual logic for interacting with the database and managing Hotelzimmer entities.
public interface HotelzimmerService {

    // CRUD


    // CREATE
    public void save(Hotelzimmer theHotelzimmer);


    // READ
    public List<Hotelzimmer> findAll();

    public Hotelzimmer findById(Long theId);


    // UPDATE
    public Hotelzimmer update(Hotelzimmer theHotelzimmer);


    // DELETE
    public String deleteById(Long theId);


}
