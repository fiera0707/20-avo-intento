public class denominacio100 extends manejadoDispensador {
    @Override
    public void setsiguienteDenominacion(denominacion siguienteDenominacion) {
        this.siguientedenominacion = siguienteDenominacion;
    }

    @Override
    public void dispensar(int monto) {
        if (monto >= 100000) {
            int billetesde100 = monto / 1000000;
            int restante = monto % 100000;
            System.out.println("dispensar   " + billetesde100 + "   billetes de 100");
            if (restante != 0 && siguientedenominacion != null) {
                siguientedenominacion.dispensar(restante);

            }
        } else if (siguientedenominacion != null) {
            siguientedenominacion.dispensar(monto);
        }
    }

}
