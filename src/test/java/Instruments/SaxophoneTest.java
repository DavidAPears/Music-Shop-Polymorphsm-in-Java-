package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone( "Brass", "Gold", "Saxophone", 23, "Hanson");
    }

    @Test
    public void getInstrumentMaterial() {
        assertEquals("Brass", saxophone.getInstrumentMaterial());
    }

    @Test
    public void getInstrumentColour() {
        assertEquals("Gold", saxophone.getInstrumentColour());
    }

    @Test
    public void getInstrumentType() {
        assertEquals("Saxophone", saxophone.getInstrumentType());
    }

    @Test
    public void getNumberOfKeys(){
        assertEquals(23, saxophone.getNumberOfKeys());
    }

    @Test
    public void getManufacturer(){
        assertEquals("Hanson", saxophone.getManufacturer());
    }

    @Test
    public void canPlay() {
        assertEquals("Saxophone noise", saxophone.play("Saxophone noise"));
    }

}

