package dev.micfro.hotelmanager.service;

import dev.micfro.hotelmanager.model.Hotelzimmer;

import java.util.List;

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
