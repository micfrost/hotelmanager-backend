package dev.micfro.hotelmanager.repository;

import dev.micfro.hotelmanager.model.Hotelzimmer;
import org.springframework.data.jpa.repository.JpaRepository;

// This Repository interface extends JpaRepository, providing CRUD functionality for Hotelzimmer entities
public interface HotelzimmerRepository extends JpaRepository<Hotelzimmer, Long> {

}
