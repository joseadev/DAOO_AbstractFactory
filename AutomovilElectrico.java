public class AutomovilElectrico extends Automovil {

	public AutomovilElectrico(String automovil) {
		super(automovil);
	}

	@Override
	public String toString() {
		return "Automovil Electrico [ID=" + new Integer(getID()).toString() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", matricula=" + getMatricula() + "]";

	}
}