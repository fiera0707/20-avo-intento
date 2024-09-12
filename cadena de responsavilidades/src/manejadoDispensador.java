public abstract class manejadoDispensador implements denominacion {
    protected denominacion siguientedenominacion;

    public void setsiguienteDenominacion(denominacion siguienteDenominacion) {
        this.siguientedenominacion = siguienteDenominacion;
    }

    @Override
    public abstract void dispensar(int monto);

}
