package com.example.medicamentos;

import java.util.List;

public class Medicamento {
    private String nombre;
    private List<String> comerial;
    private List<String> via;
    private String dosis;
    private List<String> indicaciones;
    private List<String> contraIndicaciones;
    private List<String> efectosAdversos;
    private List<String> cuidadsEnfermeria;

    public Medicamento(String nombre, List<String> comerial, List<String> via, String dosis, List<String> indicaciones, List<String> contraIndicaciones, List<String> efectosAdversos, List<String> cuidadsEnfermeria) {
        this.nombre = nombre;
        this.comerial = comerial;
        this.via = via;
        this.dosis = dosis;
        this.indicaciones = indicaciones;
        this.contraIndicaciones = contraIndicaciones;
        this.efectosAdversos = efectosAdversos;
        this.cuidadsEnfermeria = cuidadsEnfermeria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getComerial() {
        return comerial;
    }

    public void setComerial(List<String> comerial) {
        this.comerial = comerial;
    }

    public List<String> getVia() {
        return via;
    }

    public void setVia(List<String> via) {
        this.via = via;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public List<String> getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(List<String> indicaciones) {
        this.indicaciones = indicaciones;
    }

    public List<String> getContraIndicaciones() {
        return contraIndicaciones;
    }

    public void setContraIndicaciones(List<String> contraIndicaciones) {
        this.contraIndicaciones = contraIndicaciones;
    }

    public List<String> getEfectosAdversos() {
        return efectosAdversos;
    }

    public void setEfectosAdversos(List<String> efectosAdversos) {
        this.efectosAdversos = efectosAdversos;
    }

    public List<String> getCuidadsEnfermeria() {
        return cuidadsEnfermeria;
    }

    public void setCuidadsEnfermeria(List<String> cuidadsEnfermeria) {
        this.cuidadsEnfermeria = cuidadsEnfermeria;
    }
}
