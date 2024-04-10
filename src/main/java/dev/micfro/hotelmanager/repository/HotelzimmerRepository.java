package dev.micfro.hotelmanager.repository;

import dev.micfro.hotelmanager.model.Hotelzimmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelzimmerRepository extends JpaRepository<Hotelzimmer, Long> {
}
