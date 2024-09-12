public class denominacion50 extends manejadoDispensador {

    @Override
    public void setsiguienteDenominacion(denominacion siguienteDenominacion) {
        this.siguientedenominacion = siguienteDenominacion;
    }

    @Override
    public void dispensar(int monto) {
        if (monto >= 50000) {
            int billetesde100 = monto / 50000;
            int restante = monto % 50000;
            System.out.println("dispensar  " + billetesde100 + "   billetes de 50");
            if (restante != 0 && siguientedenominacion != null) {
                siguientedenominacion.dispensar(restante);

            }
        } else if (siguientedenominacion != null) {
            siguientedenominacion.dispensar(monto);
        }
    }
}
