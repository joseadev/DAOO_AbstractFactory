
public class FactoriaVehiculoElectrico implements FactoriaVehiculo {

	@Override
	public Automovil crearAutomovil(String automovil) {
		return new AutomovilElectrico(automovil);
	}

	@Override
	public Moto crearMoto(String moto) {
		return new MotoElectrica(moto);
	}

	@Override
	public Furgoneta crearFurgoneta(String furgoneta) {
		return null;
	}

}
