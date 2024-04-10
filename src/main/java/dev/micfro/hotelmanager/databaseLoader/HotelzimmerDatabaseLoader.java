package dev.micfro.hotelmanager.databaseLoader;

import dev.micfro.hotelmanager.model.Hotelzimmer;
import dev.micfro.hotelmanager.model.Zimmergroesse;
import dev.micfro.hotelmanager.service.HotelzimmerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HotelzimmerDatabaseLoader implements CommandLineRunner {

    // Dependency injection of HotelzimmerService
    private final HotelzimmerService hotelzimmerService;

    public HotelzimmerDatabaseLoader(HotelzimmerService hotelzimmerService) {
        this.hotelzimmerService = hotelzimmerService;
    }

    @Override
    public void run(String... args) throws Exception {
        // Loading initial data into the database
        // Dependency injection of HotelzimmerService
        hotelzimmerService.save(new Hotelzimmer(1L, Zimmergroesse.EINZELZIMMER, true, true));
        hotelzimmerService.save(new Hotelzimmer(2L, Zimmergroesse.DOPPELZIMMER, true, true));
        hotelzimmerService.save(new Hotelzimmer(3L, Zimmergroesse.SUITE, false, false));


    }

}
