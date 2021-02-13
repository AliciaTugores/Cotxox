package edu.pingpong;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class CarreraTest {

    Carrera carrera;

    @Before
    public void constructorTest() {
        String tarjetaCredito = "4916119711304546";
        this.carrera = new Carrera(tarjetaCredito);
        assertEquals(tarjetaCredito, carrera.getTarjetaCredito());

    }

    @Test
    public void setOrigenTest() {
        String origen = "Aeroport Son Sant Joan";
        carrera.setOrigen(origen);
        assertEquals(origen, carrera.getOrigen());
    }

    @Test
    public void setDestinoTest() {
        String destino = "Magaluf";
        carrera.setDestino(destino);
        assertEquals(destino, carrera.getDestino());
    }

    @Test
    public void setDistanciaTest() {
        double distancia = 7.75;
        carrera.setDistancia(distancia);
        assertEquals(distancia, carrera.getDistancia(),0);
    }

    @Test
    public void setTiempoEsperadoTest() {
        int tiempoEsperado = 10;
        carrera.setTiempoEsperado(tiempoEsperado);
        assertEquals(tiempoEsperado, carrera.getTiempoEsperado());
    }

    @Test
    public void setTiempoCarreraTest() {
        int tiempoCarrera = 5;
        carrera.setTiempoCarrera(tiempoCarrera);
        assertEquals(tiempoCarrera, carrera.getTiempoCarrera());
    }
}
