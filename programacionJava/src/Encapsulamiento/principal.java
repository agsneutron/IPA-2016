package Encapsulamiento;

/**
 * Created by dds on 15/11/2016.
 */
public class principal {
    public static void main(String[] args){
        // Encapsulamiento
        ClaseRestringida claseRestringida = new ClaseRestringida();
        claseRestringida.accesoMetodoPublico("Slash","Guns and Roses");
        claseRestringida.accesoMetodoProtegido("Dimebag Darrell","Pantera");
        claseRestringida.accesoMetodoDefecto("Kirk Hammett","Metalica");

        ClaseDeAcceso claseDeAcceso = new ClaseDeAcceso();
        claseDeAcceso.setGuitarrista("Jimmy Page");
        claseDeAcceso.setBanda("Led Zeppelin");

        System.out.println(claseDeAcceso.getGuitarrista() + " es el guitarrista de " + claseDeAcceso.getBanda());

    }
}
