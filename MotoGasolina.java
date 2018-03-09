public class MotoGasolina extends Moto {

	public MotoGasolina(String moto) {
		super(moto);
	}

	@Override
	public String toString() {
		return "Moto Gasolina [ID=" + new Integer(getID()).toString() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", matricula=" + getMatricula() + "]";

	}
}