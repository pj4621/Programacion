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
public class Pared {
    private int anchoPared;
    private int largoPared;
    private int alturaPared;
    private String material;
    private int tiempoVida;

    public Pared() {
    }

    public Pared(int anchoPared, int largoPared, int alturaPared, String material, int tiempoVida) {
        this.anchoPared = anchoPared;
        this.largoPared = largoPared;
        this.alturaPared = alturaPared;
        this.material = material;
        this.tiempoVida = tiempoVida;
    }

    public int getTiempoVida() {
        return tiempoVida;
    }

    public void setTiempoVida(int tiempoVida) {
        this.tiempoVida = tiempoVida;
    }

    public int getAnchoPared() {
        return anchoPared;
    }

    public void setAnchoPared(int anchoPared) {
        this.anchoPared = anchoPared;
    }

    public int getLargoPared() {
        return largoPared;
    }

    public void setLargoPared(int largoPared) {
        this.largoPared = largoPared;
    }

    public int getAlturaPared() {
        return alturaPared;
    }

    public void setAlturaPared(int alturaPared) {
        this.alturaPared = alturaPared;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
}
