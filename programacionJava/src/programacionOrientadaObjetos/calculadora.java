package programacionOrientadaObjetos;

/**
 * Created by dds on 15/11/2016.
 */
public class calculadora {
    String tipoCalculadora="básica";
    String operaciones = "Suma, Resta, Multiplicación, División";
    int valor1 = 10, valor2=5;
    double resultado=0;
    int tipoOperacion=0;
    public void Suma(){
        resultado= valor1+valor2;
        tipoOperacion =1;
    }

    public void Resta(){
        resultado= valor1-valor2;
        tipoOperacion =2;
    }
    public void Multiplicacion(){
        resultado= valor1*valor2;
        tipoOperacion =3;
    }
    public void Divison(){
        resultado= valor1/valor2;
        tipoOperacion =4;
    }

    public void imprimeResultado(){
        switch (tipoOperacion){
            case 1 : System.out.println("valor1 + Valor2 =" + resultado);
                break;
            case 2 : System.out.println("valor1 - Valor2 =" + resultado);
                break;
            case 3 : System.out.println("valor1 * Valor2 =" + resultado);
                break;
            case 4 : System.out.println("valor1 / Valor2 =" + resultado);
                break;
            default: System.out.println("No ha seleccionado ninguna operación.");
                break;
        }

    }
}
