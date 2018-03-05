public abstract class Automovil {
	protected String marca;
	protected String modelo;
	protected String matricula;
	protected Motor tipoMotor;
	protected long kilometros;
	
	public Automovil (String automovil) {
		
		String[] campos = automovil.split(";");
		
		this.marca = campos[0];
		this.modelo = campos[0];
		this.matricula = campos[0];
		this.tipoMotor = (Combustible) campos[0];
		this.kilometros = Long.parseLong(campos[0]);
		
	}


	@Override
	public int hashCode() {
		return this.ID * this.time * 31;
	}

	@Override
	public boolean equals(Object o) {
		boolean result = false;
		if (o != null && o instanceof Vehicle) {
			Vehicle v = (Vehicle)o;
			if (v.ID == this.ID) {
				result = true;
			}
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "Libro [id=" + new Integer(getId()).toString() + ", descripcion=" + getDescripcion() + ", autor=" + autor + 
				", ISBN=" + ISBN + ", any=" + any + ", estado=" + getEstado().toString() + "]";
	}

}