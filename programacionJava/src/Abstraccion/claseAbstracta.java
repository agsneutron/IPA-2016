package Abstraccion;

/**
 * Created by dds on 15/11/2016.
 */
public abstract class claseAbstracta extends Banda {
    private String guitarrista="";
    public void nombreGuitarrista(String guitarrista){
        this.guitarrista = guitarrista;
        System.out.println("Tu guitarrista favorito es " + this.guitarrista);
        nombreBanda("Metalica");

    }
    abstract public void metodoAbstracto();
}
