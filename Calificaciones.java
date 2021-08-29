import java.util.*;

public class Calificaciones{
	//Atributos de la clase Calificaciones
	int materia;
	
	
	//Método constructor
	public Calificaciones (int materia){
		setMateria(materia);
	}
	
	//setter y getters
		//setter
	public void setMateria(int materia){
		this.materia = materia;
	}
	
	
		//getters
	public int getMateria(){
		return materia;
	}
}