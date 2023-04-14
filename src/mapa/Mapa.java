package mapa;

public class Mapa {
    
    private int tamanioMapa;
    private String[][] mapaGenerado;

    public Mapa(int tamanioMapa){
        this.tamanioMapa = tamanioMapa;
        this.mapaGenerado = GeneradorDeMapas.dibujarMapa(tamanioMapa);
    }
}
