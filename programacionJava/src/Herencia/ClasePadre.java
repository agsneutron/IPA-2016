package Herencia;

/**
 * Created by dds on 15/11/2016.
 */
public class ClasePadre {
    double resultado=0;
    int tipoOperacion=0;

    public void Suma(int a, int b){
        resultado= a+b;
        tipoOperacion =1;
    }

    public void Resta(int a, int b){
        resultado= a-b;
        tipoOperacion =2;
    }
    public void Multiplicacion(int a, int b){
        resultado= a*b;
        tipoOperacion =3;
    }
    public void Division(int a, int b){
        if (b!=0) {
            resultado = a / b;
        }else {
            resultado =0;
        }
        tipoOperacion =4;
    }

    public void imprimeResultado(){
        System.out.println("Resultado enviado por la clase padre");
        switch (tipoOperacion){
            case 1 :System.out.println("valor1 + Valor2 =" + resultado);
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
