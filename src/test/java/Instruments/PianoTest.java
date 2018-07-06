package Instruments;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(250.00, 999.00, "Ebony", "Black", "Piano", 88, "Yamaha");
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

    @Test
    public void calculateMarkup() {
        TestCase.assertEquals(749.00, piano.calculateMarkup(), 0.01);
    }
}
