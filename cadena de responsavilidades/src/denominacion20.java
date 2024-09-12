public class denominacion20 extends manejadoDispensador {

    @Override
    public void setsiguienteDenominacion(denominacion siguienteDenominacion) {
        this.siguientedenominacion = siguienteDenominacion;
    }

    @Override
    public void dispensar(int monto) {
        if (monto >= 20000) {
            int billetesde20 = monto / 20000;
            int restante = monto % 20000;
            System.out.println("dispensar    " + billetesde20 + "    billetes de 20");
            if (restante != 0 && siguientedenominacion != null) {
                siguientedenominacion.dispensar(restante);

            }
        } else if (siguientedenominacion != null) {
            siguientedenominacion.dispensar(monto);
        }
    }
}
