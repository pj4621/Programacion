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
public class Puerta {
    private String material;
    private int anchoPuerta;
    private int largoPuerta;
    private int alturaPuerta;
    private String color;

    public Puerta() {
    }

    public Puerta(String material, int anchoPuerta, int largoPuerta, int alturaPuerta, String color) {
        this.material = material;
        this.anchoPuerta = anchoPuerta;
        this.largoPuerta = largoPuerta;
        this.alturaPuerta = alturaPuerta;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAnchoPuerta() {
        return anchoPuerta;
    }

    public void setAnchoPuerta(int anchoPuerta) {
        this.anchoPuerta = anchoPuerta;
    }

    public int getLargoPuerta() {
        return largoPuerta;
    }

    public void setLargoPuerta(int largoPuerta) {
        this.largoPuerta = largoPuerta;
    }

    public int getAlturaPuerta() {
        return alturaPuerta;
    }

    public void setAlturaPuerta(int alturaPuerta) {
        this.alturaPuerta = alturaPuerta;
    }
    
    
}
