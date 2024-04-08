package dev.micfro.hotelmanager.databaseLoader;

import dev.micfro.hotelmanager.entity.Hotelzimmer;
import dev.micfro.hotelmanager.service.HotelzimmerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HotelzimmerDatabaseLoader implements CommandLineRunner {
 private final HotelzimmerService hotelzimmerService;

    public HotelzimmerDatabaseLoader(HotelzimmerService hotelzimmerService) {
        this.hotelzimmerService = hotelzimmerService;
    }

    @Override
    public void run(String... args) throws Exception {
        hotelzimmerService.save(new Hotelzimmer(1L, "Einzelzimmer", true));
        hotelzimmerService.save(new Hotelzimmer(2L, "Doppelzimmer", true));
        hotelzimmerService.save(new Hotelzimmer(3L, "Suite", false));

    }

}
