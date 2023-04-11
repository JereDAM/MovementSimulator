package personaje;

public class Personaje {

    private String nombre;
    private int posicionCordenadaY = 0;
    private int posicionCordenadaX = 0;
    private int velocidadDesplazamiento = 1;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.posicionCordenadaY = 0;
        this.posicionCordenadaX = 0;
        this.velocidadDesplazamiento = 1;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPosicionCordenadaY(int posicionCordenadaY){
        
    }

    public int getPosicionCordenadaY() {
        return posicionCordenadaY;
    }

    public void setPosicionCordenadaX(int posicionCordenadaX){

    }

    public int getPosicionCordenadaX() {
        return posicionCordenadaX;
    }

    public void setVelocidadDesplazamiento(int velocidadDesplazamiento){

    }

    public int getVelocidadDesplazamiento() {
        return velocidadDesplazamiento;
    }

}
