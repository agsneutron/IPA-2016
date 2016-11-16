package Encapsulamiento;

/**
 * Created by dds on 15/11/2016.
 */
public class ClaseDeAcceso {
    private String guitarrista ="";
    private String banda="";


    public String getGuitarrista() {
        return guitarrista;
    }

    public void setGuitarrista(String guitarrista) {
        this.guitarrista = guitarrista;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }
}
