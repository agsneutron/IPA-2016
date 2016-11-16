package programacionOrientadaObjetos;

/**
 * Created by dds on 15/11/2016.
 */
public class principal {

    public static void main(String[] args){
        calculadora Calc = new calculadora();
        System.out.println("Calculadora " + Calc.tipoCalculadora);
        System.out.println("Realiza: " + Calc.operaciones);

        Calc.Suma();
        Calc.imprimeResultado();

        Calc.Resta();
        Calc.imprimeResultado();

        Calc.Multiplicacion();
        Calc.imprimeResultado();

        Calc.Divison();
        Calc.imprimeResultado();

    }
}
