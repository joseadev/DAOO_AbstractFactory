
public class FactoriaVehiculoDiesel implements FactoriaVehiculo {

	@Override
	public Automovil crearAutomovil(String automovil) {
		return new AutomovilDiesel(automovil);
	}

	@Override
	public Moto crearMoto(String moto) {
		return null;
	}

	@Override
	public Furgoneta crearFurgoneta(String furgoneta) {
		return null;
	}

}
