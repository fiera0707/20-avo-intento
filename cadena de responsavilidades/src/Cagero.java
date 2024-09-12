
public class Cagero {

    private denominacion cadena;

    public Cagero() {

        denominacion d100 = new denominacio100();
        denominacion de50 = new denominacion50();
        denominacion de20 = new denominacion20();
        denominacion de10 = new denominacion10();

        d100.setsiguienteDenominacion(de50);
        de50.setsiguienteDenominacion(de20);
        de20.setsiguienteDenominacion(de10);

        this.cadena = d100;

    }

    public void dispense(int monto) {
        if (monto % 10000 != 0) {
            System.out.println("Error: La cantidad no es valida");
            return;
        }
        this.cadena.dispensar(monto);
    }
}
