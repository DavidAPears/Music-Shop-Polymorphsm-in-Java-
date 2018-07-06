package Instruments;

import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Mahogany", "Cherry Sunburst", "Guitar", 6, "Gibson");
    }

    @Test
    public void getInstrumentMaterial() {
        assertEquals("Mahogany", guitar.getInstrumentMaterial());
    }

    @Test
    public void getInstrumentColour() {
        assertEquals("Cherry Sunburst", guitar.getInstrumentColour());
    }

    @Test
    public void getInstrumentType() {
        assertEquals("Guitar", guitar.getInstrumentType());
    }

    @Test
    public void getNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void getManufacturer(){
        assertEquals("Gibson", guitar.getManufacturer());
    }

    @Test
    public void canPlay() {
        assertEquals("Guitar Noise", guitar.play("Guitar Noise"));
    }


}




