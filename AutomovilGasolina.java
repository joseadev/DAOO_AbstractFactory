public class AutomovilGasolina extends Automovil {

	public AutomovilGasolina(String automovil) {
		super(automovil);
	}

	@Override
	public String toString() {
		return "Automovil Gasolina [ID=" + new Integer(getID()).toString() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", matricula=" + getMatricula() + "]";

	}
}