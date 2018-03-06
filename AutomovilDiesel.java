public class AutomovilDiesel extends Automovil {

	public AutomovilDiesel(String automovil) {
		super(automovil);
	}

	@Override
	public String toString() {
		return "Automovil Diesel [ID=" + new Integer(getID()).toString() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", matricula=" + getMatricula() + "]";

	}
}