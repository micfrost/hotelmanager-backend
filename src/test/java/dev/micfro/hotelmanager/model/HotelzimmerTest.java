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

    @Test
    void settingZimmernummerToZeroShouldThrowConstraintViolationException() {
        Hotelzimmer hotelzimmer = new Hotelzimmer();
        assertThrows(ConstraintViolationException.class, () -> hotelzimmer.setZimmernummer(0L));
    }

    @Test
    void settingZimmernummerToNegativeShouldThrowConstraintViolationException() {
        Hotelzimmer hotelzimmer = new Hotelzimmer();
        assertThrows(ConstraintViolationException.class, () -> hotelzimmer.setZimmernummer(-1L));
    }

    @Test
    void settingZimmergroesseToNullShouldThrowConstraintViolationException() {
        Hotelzimmer hotelzimmer = new Hotelzimmer();
        assertThrows(ConstraintViolationException.class, () -> hotelzimmer.setZimmergroesse(null));
    }

    @Test
    void settingMinibarShouldReflectInGetter() {
        Hotelzimmer hotelzimmer = new Hotelzimmer();
        hotelzimmer.setMinibar(true);
        assertTrue(hotelzimmer.isMinibar());
    }

    @Test
    void settingVerfuegbarkeitShouldReflectInGetter() {
        Hotelzimmer hotelzimmer = new Hotelzimmer();
        hotelzimmer.setVerfuegbarkeit(true);
        assertTrue(hotelzimmer.isVerfuegbarkeit());
    }
}