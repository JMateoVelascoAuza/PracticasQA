package ejercicioUnitTest.ejercicio2;

// DEV> Pablo A.
public class Banco {
    private ASFI asfi;

    public Banco() {
        this.asfi = new ASFI();
    }

    public Banco(ASFI asfi) {
        this.asfi = asfi;
    }

    public void setAsfi(ASFI asfi) {
        this.asfi = asfi;
    }

    public int getMaximoPrestamo(String ci) {
        String categoria = asfi.getCategoria(ci);
        switch (categoria) {
            case "A":
                return 200000;
            case "B":
                return 100000;
            case "C":
                throw new IllegalStateException("No se puede prestar ningún monto, ALERTA!");
            default:
                throw new IllegalArgumentException("Categoría desconocida");
        }
    }
}