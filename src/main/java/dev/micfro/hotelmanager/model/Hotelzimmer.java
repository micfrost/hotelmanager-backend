package dev.micfro.hotelmanager.model;

import jakarta.persistence.*;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "hotelzimmer")
public class Hotelzimmer {

    @Id
    @NotNull(message = "Zimmernummer is required")
    @Min(value = 1, message = "Zimmernummer should be greater than 0")
    private Long zimmernummer;

    @NotNull(message = "Zimmergröße is required")
    @Enumerated(EnumType.STRING)
    private Zimmergroesse zimmergroesse;

    private boolean isMinibar;

    private boolean isVerfuegbarkeit;

    private static Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    // Constructors
    public Hotelzimmer() {
    }

    public Hotelzimmer(Long zimmernummer, Zimmergroesse zimmergroesse, boolean isMinibar, boolean isVerfuegbarkeit) {
        this.zimmernummer = zimmernummer;
        this.zimmergroesse = zimmergroesse;
        this.isMinibar = isMinibar;
        this.isVerfuegbarkeit = isVerfuegbarkeit;
    }

    // Getters and setters

    public Long getZimmernummer() {
        return zimmernummer;
    }

    public void setZimmernummer(Long zimmernummer) {
        this.zimmernummer = zimmernummer;
        if (!validator.validate(this).isEmpty()) {
            throw new ConstraintViolationException(validator.validate(this));
        }
    }

    public Zimmergroesse getZimmergroesse() {
        return zimmergroesse;
    }

    public void setZimmergroesse(Zimmergroesse zimmergroesse) {
        this.zimmergroesse = zimmergroesse;
        if (!validator.validate(this).isEmpty()) {
            throw new ConstraintViolationException(validator.validate(this));
        }
    }

    public boolean isMinibar() {
        return isMinibar;
    }

    public void setMinibar(boolean minibar) {
        isMinibar = minibar;
    }

    public boolean isVerfuegbarkeit() {
        return isVerfuegbarkeit;
    }

    public void setVerfuegbarkeit(boolean verfuegbarkeit) {
        isVerfuegbarkeit = verfuegbarkeit;
    }
}