package dev.micfro.hotelmanager.service;

import dev.micfro.hotelmanager.entity.Hotelzimmer;

import java.util.List;
import java.util.Set;

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
