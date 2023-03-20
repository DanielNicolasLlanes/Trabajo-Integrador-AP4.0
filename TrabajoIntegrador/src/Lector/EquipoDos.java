package Lector;

public class EquipoDos {
		
		private String nombre;
		private int goles;
		
		
		//Constructores
		public EquipoDos() {
			
		}
		public EquipoDos(String nombre, int goles) {
			super();
			this.nombre = nombre;
			this.goles = goles;
		}
		
		//Getters y setters
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getGoles() {
			return goles;
		}
		public void setGoles(int goles) {
			this.goles = goles;
		}
}
