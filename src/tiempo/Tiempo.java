/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiempo;

/**
 *
 * @author carlosjoseanguiano
 */
public class Tiempo {

    private int hora;
    private int minuto;
    private int segundo;

    public void establecerTiempo(int h, int m, int s) {
        if ((h >= 0 && h < 24) && (m >= 0 && m < 60) && s >= 0 && s < 60) {

            hora = h;
            minuto = m;
            segundo = s;
        } else {
            throw new IllegalArgumentException("hora , minuto y/o segundo estaban fuera de rango");
        }
    }

    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    @Override
    public String toString() {
//        return "Tiempo{" + "hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + '}';

        return String.format("%02d:%02d:%02d %s",
                ((hora == 0 || hora == 12) ? 12 : hora % 12),
                minuto, segundo, (hora < 12 ? "AM" : "PM"));
    }

}
