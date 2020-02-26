/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

/**
 *
 * @author Solba
 */
public class Ventana {
    private int anchoVentana;
    private int largoVentana;
    private int alturaVentana;
    private String material;
    private String color;

    public Ventana() {
    }

    public Ventana(int anchoVentana, int largoVentana, int alturaVentana, String material, String color) {
        this.anchoVentana = anchoVentana;
        this.largoVentana = largoVentana;
        this.alturaVentana = alturaVentana;
        this.material = material;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnchoVentana() {
        return anchoVentana;
    }

    public void setAnchoVentana(int anchoVentana) {
        this.anchoVentana = anchoVentana;
    }

    public int getLargoVentana() {
        return largoVentana;
    }

    public void setLargoVentana(int largoVentana) {
        this.largoVentana = largoVentana;
    }

    public int getAlturaVentana() {
        return alturaVentana;
    }

    public void setAlturaVentana(int alturaVentana) {
        this.alturaVentana = alturaVentana;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
    
}
