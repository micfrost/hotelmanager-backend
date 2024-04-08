package dev.micfro.hotelmanager.entity;

import jakarta.persistence.*;


//@Getter
//@Setter
@Entity
@Table(name = "hotelzimmer")
public class Hotelzimmer {

    @Id
    @Column(name = "zimmernummer")
    private Long zimmernummer;

    @Column(name = "zimmergroesse")
    private String zimmergroesse;

    @Column(name = "has_minibar")
    private boolean hasMinibar;

    // Constructors
    public Hotelzimmer() {
    }

    public Hotelzimmer(Long zimmernummer, String zimmergroesse, boolean hasMinibar) {
        this.zimmernummer = zimmernummer;
        this.zimmergroesse = zimmergroesse;
        this.hasMinibar = hasMinibar;
    }


// Getters and setters

    public Long getZimmernummer() {
        return zimmernummer;
    }

    public void setZimmernummer(Long zimmernummer) {
        this.zimmernummer = zimmernummer;
    }

    public String getZimmergroesse() {
        return zimmergroesse;
    }

    public void setZimmergroesse(String zimmergroesse) {
        this.zimmergroesse = zimmergroesse;
    }

    public boolean isHasMinibar() {
        return hasMinibar;
    }

    public void setHasMinibar(boolean hasMinibar) {
        this.hasMinibar = hasMinibar;
    }
}
