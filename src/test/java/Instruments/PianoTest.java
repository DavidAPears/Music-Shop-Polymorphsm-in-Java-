package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano( "Ebony", "Black", "Piano", 88, "Yamaha");
    }

    @Test
    public void getInstrumentMaterial() {
        assertEquals("Ebony", piano.getInstrumentMaterial());
    }

    @Test
    public void getInstrumentColour() {
        assertEquals("Black", piano.getInstrumentColour());
    }

    @Test
    public void getInstrumentType() {
        assertEquals("Piano", piano.getInstrumentType());
    }

    @Test
    public void getNumberOfKeys(){
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void getManufacturer(){
        assertEquals("Yamaha", piano.getManufacturer());
    }

    @Test
    public void canPlay() {
        assertEquals("Plinky Plonk", piano.play("Plinky Plonk"));
    }

}
