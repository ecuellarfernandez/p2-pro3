package org.p2.obj.filtros.colores;

import org.p2.obj.ComandoFiltro;
import org.p2.obj.Imagen;

public class Verdes extends ComandoFiltro {
    private final Imagen imagenBase;

    public Verdes(Imagen img) {
        this.imagenBase = img;
    }
    @Override
    public void ejecutar() {
        int ancho = imagenBase.getAncho();
        int alto = imagenBase.getAlto();
        int[][] pixelesOriginales = imagenBase.getPixelesOriginales();
        int[][] pixelesNuevos= imagenBase.getPixeles();
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < alto; j++) {
                // Obtiene el valor de verde del píxel
                int g = (pixelesOriginales[i][j] >> 8) & 0x000000FF;
                // Creamos un nuevo valor entero que representa el color verde del píxel,
                // manteniendo los otros componentes de color en cero
                int verde = (g << 8) + 0xFF000000;
                pixelesNuevos[i][j] = verde;
            }
        }
        imagenBase.cambiosImagen();
    }

}
