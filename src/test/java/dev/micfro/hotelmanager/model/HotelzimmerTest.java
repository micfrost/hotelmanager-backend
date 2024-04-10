package dev.micfro.hotelmanager.model;

import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HotelzimmerTest {

    @Test
    void creatingHotelzimmerWithValidParametersShouldSucceed() {
        Hotelzimmer hotelzimmer = new Hotelzimmer(1L, Zimmergroesse.SUITE, true, true);
        assertNotNull(hotelzimmer);
        assertEquals(1L, hotelzimmer.getZimmernummer());
        assertEquals(Zimmergroesse.SUITE, hotelzimmer.getZimmergroesse());
        assertTrue(hotelzimmer.isMinibar());
        assertTrue(hotelzimmer.isVerfuegbarkeit());
    }


}