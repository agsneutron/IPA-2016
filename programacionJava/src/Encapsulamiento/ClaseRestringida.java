package Encapsulamiento;

/**
 * Created by dds on 15/11/2016.
 */
public class ClaseRestringida {
    private String guitarrista="Dimebag Darrell";
    private String banda="Pantera";
    private String tipoAcceso = "";

    private void accesoMetodoPrivado(){
        System.out.println("Acceso a metodo privado");
        System.out.println(this.guitarrista + " Guitarrista de la banda " + this.banda);
        System.out.println();
    }
    protected void accesoMetodoProtegido(String guitarrista, String banda){
        this.guitarrista = guitarrista;
        this.banda = banda;
        System.out.println("Acceso a metodo protegido");
        System.out.println(this.guitarrista + " Guitarrista de la banda " + this.banda);
        System.out.println();
    }
    public void accesoMetodoPublico(String guitarrista, String banda){
        this.guitarrista = guitarrista;
        this.banda = banda;
        System.out.println("Acceso a metodo publico");
        System.out.println(this.guitarrista + " Guitarrista de la banda " + this.banda);
        System.out.println();
    }
    void accesoMetodoDefecto(String guitarrista, String banda){
        this.guitarrista = guitarrista;
        this.banda = banda;
        System.out.println("Acceso a metodo por defecto");
        System.out.println(this.guitarrista + " Guitarrista de la banda " + this.banda);
        System.out.println();
    }
}
