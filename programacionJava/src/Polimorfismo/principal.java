package Polimorfismo;

/**
 * Created by dds on 15/11/2016.
 */
public class principal {
    public static void main(String[] args){
        PoliUno poliUno = new PoliUno();
        PoliDos poliDos = new PoliDos();

        poliUno.musica();

        poliDos.musica("metal","Pantera");
    }
}
