public abstract class Moto {

	protected int ID;
	protected String marca;
	protected String modelo;
	protected String matricula;
	protected TMotor tipoMotor;
	protected long kilometros;
	
	public Moto (String moto) {
		
		String[] campos = moto.split(";");
		this.ID = Integer.parseInt(campos[0]);
		this.marca = campos[1];
		this.modelo = campos[2];
		this.matricula = campos[3];
		this.tipoMotor = TMotor.values()[Integer.parseInt(campos[4])];
		this.kilometros = Long.parseLong(campos[5]);
		
	}

	public int getID() {
		return this.ID;
	}
	public String getMarca() {
		return this.marca;
	}
	public String getModelo() {
		return this.modelo;
	}
	public String getMatricula() {
		return this.matricula;
	}

	@Override
	public int hashCode() {
		return this.ID * 31;
	}

	@Override
	public boolean equals(Object o) {
		boolean result = false;
		if (o != null && o instanceof Moto) {
			Moto m = (Moto)o;
			if (m.ID == this.ID) {
				result = true;
			}
		}
		return result;
	}
	
	@Override
	public abstract String toString();
//	{
//		return "Automovil [ID=" + new Integer(getID()).toString() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", matricula=" + getMatricula() + "]";
//	}

}