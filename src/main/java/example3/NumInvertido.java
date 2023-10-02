package example3;

public class NumInvertido {
    public String invertir(int number) {
        if (number < 0) {
            return "Valor Incorrecto";
        }
        String strNumber = Integer.toString(number);
        String resultado = "";
        for (int i = strNumber.length() - 1; i >= 0; i--) {
            resultado += strNumber.charAt(i);
        }
        return resultado;
    }
}
