package org.p2.obj.filtros.algoritmos;

import org.p2.obj.ComandoFiltro;
import org.p2.obj.Imagen;
import org.p2.obj.filtros.colores.Grises;

import java.awt.*;
import java.util.Random;

public class SalYPimienta extends ComandoFiltro {

    private final Imagen imagenBase;

    public SalYPimienta(Imagen img) {
        this.imagenBase = img;
    }


    @Override
    public void ejecutar() {
        int ancho = imagenBase.getAncho();
        int alto = imagenBase.getAlto();
        int[][] pixeles = imagenBase.getPixeles();
        int densidad = 5;//porcentaje
        int pixelesTotales = ancho * alto;
        int pixelesAfectados = (int) ((densidad/100.0) * pixelesTotales);//cantidad de pixeles a cambiar por sal y pimienta
        int blanco = Color.WHITE.getRGB();
        int negro = Color.BLACK.getRGB();
        Random random = new Random();
        for (int i = 0; i < pixelesAfectados; i++) {
            int x = random.nextInt(ancho);
            int y = random.nextInt(alto);
            if(pixeles[x][y] != negro && pixeles[x][y] != blanco) pixeles[x][y] = random.nextBoolean() ? blanco : negro;
        }
        ComandoFiltro gris = new Grises(imagenBase);
        gris.ejecutar();
        //imagenBase.cambiosImagen();
    }
}
