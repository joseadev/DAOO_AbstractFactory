public class AutomovilHibrido extends Automovil {

	public AutomovilHibrido(String automovil) {
		super(automovil);
	}

	@Override
	public String toString() {
		return "AutomovilHibrido [ID=" + new Integer(getID()).toString() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", matricula=" + getMatricula() + "]";

	}
}