package edu.pingpong;

import java.util.ArrayList;
import java.util.List;

public class PoolConductores {

    private List<Conductor> poolConductores = new ArrayList<Conductor>();

    public PoolConductores(List<Conductor> poolConductores) {
        this.poolConductores = poolConductores;
    }

    public List<Conductor> getPoolConductores() {
        return this.poolConductores;
    }

    public Conductor asignarConductor() {
        Conductor conductorLibre = null;
        for (Conductor conductor: poolConductores) {
            if (conductor.isOcupado() == false) {
                conductorLibre = conductor;
                break;
            }
        }
        return  conductorLibre;
    }

}
