
public enum TMotor {

	Gasolina ("G"),
	Diesel ("D"),
	Electrico ("E"),
	Hibrido ("H");
	
	private final String name;
		
	private TMotor(String name) {
		this.name = name;
	}
	
	public String getType() {
		return name;
	}

}
