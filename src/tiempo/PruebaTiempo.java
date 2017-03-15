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
public class PruebaTiempo {

    public static void main(String[] args) {

        Tiempo tiempo = new Tiempo();
        
        //Imprime representaciones de cadena del tiempo
        System.out.println("La hora universal incial es: ");
        System.out.println(tiempo.aStringUniversal());
        System.out.println("La hora estandar inicial es: ");
        System.out.println(tiempo.toString());
        System.out.println();
        
        //Modifica el tiempo e imprime el tiempo actualizado
        tiempo.establecerTiempo(13, 27, 6);
        System.out.println("La hora universal despues de establecerTiemo es: ");
        System.out.println(tiempo.aStringUniversal());
        System.out.println("La hora estadar despues de establecerTiempo: ");
        System.out.println(tiempo.toString());
        System.out.println();
        
        //Intenta establecer el tiempo con valores invalidos
        
        try {
            tiempo.establecerTiempo(99, 99, 99);
        } catch (IllegalArgumentException e) {
            System.out.printf("Excepcion %s\n\n",e.getMessage());
        }
        System.out.println("Despues de intentar ajustes invalidos: ");
        System.out.println("Hora Universal: ");
        System.out.println(tiempo.aStringUniversal());
        System.out.println("Hora estandar : ");
        System.out.println(tiempo.toString());
    }
}
