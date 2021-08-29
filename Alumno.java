import java.util.*;

public class Alumno{
	//Atributos de la clase alumno
	String nombre;
	
	//Método constructor
	public Alumno (String nombre){
		setNombre(nombre);
		
	}
	
	//setters y getters
		//setters
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
		//getters
	public String getNombre(){
		return nombre;
	}
	
	
}