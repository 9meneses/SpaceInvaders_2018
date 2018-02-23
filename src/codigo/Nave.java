/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Roberto Meneses
 */
public class Nave {

    public Image imagen = null;
    public int x = 0;
    public int y = 0;
    private boolean pulsadoIzquierda = false;
    private boolean pulsadoDerecha = false;

    public boolean isPulsadoDerecha() {
        return pulsadoDerecha;
    }

    public void setPulsadoDerecha(boolean pulsadoDerecha) {
        this.pulsadoDerecha = pulsadoDerecha;
    }

    public boolean isPulsadoIzquierda() {
        return pulsadoIzquierda;
    }

    public void setPulsadoIzquierda(boolean pulsadoIzquierda) {
        this.pulsadoIzquierda = pulsadoIzquierda;
    }
    
    private int anchoPantalla;
    
    public Nave(int _anchoPantalla) {
        try {
            imagen = ImageIO.read(getClass().getResource("/imagenes/nave.png"));
        } 
        catch (IOException e) {
        }
        anchoPantalla = _anchoPantalla;

    }

    public void mueve() {
        //método para mover a la nave
        if (pulsadoIzquierda && x > 0) {
            x--;
        }
        
        if (pulsadoDerecha && x < anchoPantalla - imagen.getWidth(null)){
            x++;
        }
    }

}
