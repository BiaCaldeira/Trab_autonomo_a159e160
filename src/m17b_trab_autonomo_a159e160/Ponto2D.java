package m17b_trab_autonomo_a159e160;
/**
 * 
 * @version 2.0, 18.fev.2021
 * @author Beatriz Caldeira
 */

public class Ponto2D {
    /** coordenadas dos pontos */
    private int x;
    private int y;
    
    /**
    * Construtor sem parâmetros, que inicializa os atributos
    * com valores predefinidos conhecidos.
    */
    
    public Ponto2D(){
        x = 0;
        y = 0;        
    }
    /**
    * 
    * @param x coordenada x
    * @param y coordenada y
    */
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    /**
    * 
    * @return a distancia.
    * 
    */
    public double distancia(Ponto2D a){
        return Math.abs(Math.sqrt(Math.pow((x-a.x),2)+Math.pow((y-a.y),2)));
    }
    /**
    * 
    * @return x.
    * 
    */
    public int getX() {
        return x;
    }
    /**
    * 
    * @return y.
    * 
    */
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    /**
    * 
    * @return uma string composta pelos atributos da classe.
    * 
    */
    @Override
    public String toString() {
        return "Ponto2D{" + "x=" + x + ", y=" + y + '}';
    }
}
