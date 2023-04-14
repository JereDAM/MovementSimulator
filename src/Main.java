import java.util.Scanner;

import mapa.Mapa;

public class Main {
    public static void main(String[] args) {

        
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Como de grande quieres el mapa?");
        int tamanioMapa = teclado.nextInt();

        Mapa miMapa = new Mapa(tamanioMapa);
        

        teclado.close();
    }
}