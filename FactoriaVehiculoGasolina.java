
public class FactoriaVehiculoGasolina implements FactoriaVehiculo {

	@Override
	public Automovil crearAutomovil(String automovil) {
		return new AutomovilGasolina(automovil);
	}

	@Override
	public Moto crearMoto(String moto) {
		return new MotoGasolina(moto);
	}

	@Override
	public Furgoneta crearFurgoneta(String furgoneta) {
		return null;
	}

}
