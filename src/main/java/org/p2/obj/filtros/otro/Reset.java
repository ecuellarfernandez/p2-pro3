package org.p2.obj.filtros.otro;

import org.p2.obj.ComandoFiltro;
import org.p2.obj.Imagen;

public class Reset extends ComandoFiltro {
    private final Imagen imagenBase;
    public Reset(Imagen modelo) {
        this.imagenBase = modelo;
    }

    @Override
    public void ejecutar() {
        int ancho = imagenBase.getAncho();
        int alto = imagenBase.getAlto();
        int[][] pixelesOriginales = imagenBase.getPixelesOriginales();
        int[][] pixeles = imagenBase.getPixeles();
        for (int i = 0; i < ancho; i++) {
            for(int j = 0; j < alto; j++) {
                pixeles[i][j] = pixelesOriginales[i][j];
            }
        }
        imagenBase.cambiosImagen();
        }
}
