package edu.pingpong;

import java.util.ArrayList;

public class Conductor {

    private String nombre = null;
    private String modelo = null;
    private String matricula = null;
    private double valoracionMedia = 0d;
    private boolean ocupado = false;
    private ArrayList<Byte> valoraciones = new ArrayList<>();

    public Conductor() {
    };

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValoracionMedia() {
        return this.valoracionMedia;
    }

    public int getNumeroValoraciones() {
        return this.valoraciones.size();
    }

    public void setValoracion(Byte valoracion) {
        this.valoraciones.add(valoracion);
        this.calcularValoracionMedia();
    }

    private double calcularValoracionMedia() {
        int contador = 0;
        for (byte valoracion : this.valoraciones) {
            contador += valoracion;
        }
        this.valoracionMedia =  (double) contador / this.valoraciones.size();
        return this.valoracionMedia;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isOcupado() {
        return this.ocupado;
    }

}
