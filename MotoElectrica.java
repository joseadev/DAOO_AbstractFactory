public class MotoElectrica extends Moto {

	public MotoElectrica(String moto) {
		super(moto);
	}

	@Override
	public String toString() {
		return "Moto Electrica [ID=" + new Integer(getID()).toString() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", matricula=" + getMatricula() + "]";

	}
}