package dev.micfro.hotelmanager.repositor;

import dev.micfro.hotelmanager.entity.Hotelzimmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelzimmerRepository extends JpaRepository<Hotelzimmer, Long> {
}
