package org.p2.obj.filtros.colores;

import org.p2.obj.ComandoFiltro;
import org.p2.obj.Imagen;

public class Azules extends ComandoFiltro {
    private final Imagen imagenBase;

    public Azules(Imagen img) {
        this.imagenBase = img;
    }
    @Override
    public void ejecutar() {
        int ancho = imagenBase.getAncho();
        int alto = imagenBase.getAlto();
        int[][] pixeles = imagenBase.getPixeles();
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < alto; j++) {
                int b = pixeles[i][j] & 0x000000FF;
                pixeles[i][j] = b;
            }
        }
        imagenBase.cambiosImagen();
    }
}
