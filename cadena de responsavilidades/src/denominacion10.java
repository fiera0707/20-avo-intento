public class denominacion10 extends manejadoDispensador {

    @Override
    public void setsiguienteDenominacion(denominacion siguienteDenominacion) {
        this.siguientedenominacion = siguienteDenominacion;
    }

    @Override
    public void dispensar(int monto) {
        if (monto >= 10000) {
            int billetesde100 = monto / 10000;
            int restante = monto % 10000;
            System.out.println("dispensar   " + billetesde100 + "   billetes de 10");
            if (restante != 0 && siguientedenominacion != null) {
                siguientedenominacion.dispensar(restante);

            }
        } else if (siguientedenominacion != null) {
            siguientedenominacion.dispensar(monto);
        }
    }

}
