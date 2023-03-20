package Lector;

public class Resultado {
	private String ganador;
	private String perdedor;
	private boolean empate;
	
	
	//Constructores
	public Resultado() {
		
	}
	
	public Resultado(String ganador, String perdedor) {
		super();
		this.ganador = ganador;
		this.perdedor = perdedor;
	}
	
	//Getters and Setters
	public String getGanador() {
		return ganador;
	}
	public void setGanador(String ganador) {
		this.ganador = ganador;
	}
	public String getPerdedor() {
		return perdedor;
	}
	public void setPerdedor(String perdedor) {
		this.perdedor = perdedor;
	}
	
	

}
