package edu.pingpong;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class ConductorTest {

    @Test
    public void ConstructorYgetConductorTest() {
        String nombre = "Samantha";
        Conductor conductor = new Conductor(nombre);
        assertEquals(nombre, conductor.getNombre());
    }

    @Test
    public void setNombreTest() {
        String nombre = "Samantha";
        Conductor conductor = new Conductor(nombre);
        assertEquals(nombre, conductor.getNombre());
    }

    @Test
    public void setModeloTest() {
        String modelo = "Audi";
        Conductor conductor = new Conductor();
        conductor.setModelo(modelo);
        assertEquals(modelo, conductor.getModelo());
    }

    @Test
    public void setMatriculaTest() {
        String matricula = "3844 HRS";
        Conductor conductor = new Conductor();
        conductor.setMatricula(matricula);
        assertEquals(matricula, conductor.getMatricula());
    }

    @Test
    public void getNumeroValoraciones() {
        ArrayList<Byte> valoraciones = new ArrayList <Byte>();
        Byte valoracion = 4;
        valoraciones.add(valoracion);
        Conductor conductor = new Conductor();
        conductor.setValoracion(valoracion);
        assertEquals(valoraciones.size(), conductor.getNumeroValoraciones());
    }

    /*@Test
    public void setValoracionesTest() {
        Byte valoracion = 4;
        Conductor conductor = new Conductor();
        conductor.setValoracion(valoracion);
        assertEquals(valoracion, (byte) 4);
    }*/

    @Test
    public void ValoracionMediaTest() {
        String nombre = "Samantha";
        Conductor conductor = new Conductor(nombre);
        conductor.setValoracion((byte) 5);
        assertEquals(1, conductor.getNumeroValoraciones(), 0);
        assertEquals(5, conductor.getValoracionMedia(), 0.1);

        int numeroValoraciones = 0;
        for (int valoracion = 0; valoracion <= 5; valoracion++) {
            conductor.setValoracion((byte) valoracion);
            numeroValoraciones++;
        }
        assertEquals(numeroValoraciones + 1, conductor.getNumeroValoraciones(), 0);
        assertEquals(2.875, conductor.getValoracionMedia(), 0.1);
    }
}
