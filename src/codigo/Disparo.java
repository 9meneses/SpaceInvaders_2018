/*
 * la clase que sirve para dibujar los disparos de la nave en la pantalla 
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Roberto Meneses
 */
public class Disparo {

    public Image imagen = null;
    private int x = 0;
    private int y = 0;
    private int altoPantalla;
    private boolean disparado = false;

    public Disparo(int _altoPantalla) {
        try {
            imagen = ImageIO.read(getClass().getResource("/imagenes/disparo.png"));
        } catch (IOException e) {
        }
        altoPantalla = _altoPantalla;

    }
    
    public void mueve(){
        if(y>0){
            y--;
        }
    }
    
    public void poscionaDisparo(Nave _nave){
        x = _nave.x + _nave.imagen.getWidth(null)/2 - imagen.getWidth(null)/2;
        y = _nave.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public boolean isDisparado() {
        return disparado;
    }

    public void setDisparado(boolean disparado) {
        this.disparado = disparado;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
