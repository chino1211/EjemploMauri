
public class Mascota {
	
	//Atributos
	private int edad;
	private String nombre;
	private String dueno;
	public static int contador=0;
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDueno() {
		return dueno;
	}
	public void setDueno(String dueno) {
		this.dueno = dueno;
	}
	
	public Mascota(){
		this.contador++;
	}
	
}	
