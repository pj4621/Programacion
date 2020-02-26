/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classcasa;

import Componentes.Pared;
import Componentes.Puerta;
import Componentes.Ventana;

/**
 *
 * @author Solba
 */
public class Casa {
    private int numeroVentana;
    private int numeroPisos;
    private int numeroPuerta;
    private int numeroCuartos;
    private int numeroPared;

    public Casa() {
    }

    public Casa(int numeroVentana, int numeroPisos, int numeroPuerta, int numeroCuartos, int numeroPared) {
        this.numeroVentana = numeroVentana;
        this.numeroPisos = numeroPisos;
        this.numeroPuerta = numeroPuerta;
        this.numeroCuartos = numeroCuartos;
        this.numeroPared = numeroPared;
    }

    public int getNumeroPared() {
        return numeroPared;
    }

    public void setNumeroPared(int numeroPared) {
        this.numeroPared = numeroPared;
    }

    public int getNumeroVentana() {
        return numeroVentana;
    }

    public void setNumeroVentana(int numeroVentana) {
        this.numeroVentana = numeroVentana;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public void setNumeroPuerta(int numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
    }

    public int getNumeroCuartos() {
        return numeroCuartos;
    }

    public void setNumeroCuartos(int numeroCuartos) {
        this.numeroCuartos = numeroCuartos;
    }
    
}
