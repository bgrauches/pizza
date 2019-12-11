
public class Pizza {

	String mida;
	String tipus;
	String estat;
	
	static int demanades;
	static int servides;
	
	
	
	public Pizza(String mida, String tipus) {
		this.mida= mida;
		this.tipus= tipus;
		this.estat = estat;
	}
	
	public void demanada() {
		setEstat("demanada");
		demanades = demanades+1;
	}
	public void servida() {
		setEstat("servida");
		demanades = demanades -1;
		servides = servides +1;
	}
	
	//Gettres i setters mida, tipus i estat
	public String getMida() {
		return mida;
	}
	public void setMida(String mida) {
		this.mida = mida;
	}

	public String getTipus() {
		return tipus;
	}
	public void setTipus(String tipus) {
		this.tipus = tipus;
	}

	public String getEstat() {
		return estat;
	}
	public void setEstat(String estat) {
		this.estat = estat;
	}



	public static void main(String[] args) {
		Pizza p1 = new Pizza ("mediana", "margarita");
		System.out.println(p1.getEstat());
		p1.servida();
		System.out.println(p1.getEstat());
	}

}
