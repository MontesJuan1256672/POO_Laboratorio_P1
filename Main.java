import java.io.IOException;
import java.util.*;

public class Main{
	public static void main(String args[]) throws IOException, InterruptedException {
		//declaracion de arreglo tipo alumno
		Alumno als[] = new Alumno[3];
		
		//declaracion de arreglos tipo Calificaciones uno para cada alumno, almacenan 3 materias cada uno;
		Calificaciones cali1 [] = new Calificaciones[3];
		Calificaciones cali2 [] = new Calificaciones[3];
		Calificaciones cali3 [] = new Calificaciones[3];

		//variable de control para el ciclo do while  y switch
		int opc1;
		
		//variable que almacena el promedio de las calificaciones de los alumnos
		float promedio;
		
		//variables que almacenan la calificacion mayor y menor
		int mayor, menor;
				
		//Ciclo que muestra el menú de opciones hasta que el usuario elija salir	
		do {
			System.out.println();
			System.out.println("1) Captura nombre y calificaciones");
			System.out.println("2) Imprime calificaciones y promedio de calificaciones");
			System.out.println("3) Imprime calificaciones y calificacion mas baja");
			System.out.println("4) Imprime calificacion y calificacion mas alta");
			System.out.println("5) Salir");
			System.out.println();
			
			//objeto tipo Opcion que sirve de variable de control para el switch case 
			Opcion opc = new Opcion (CapturaEntrada.capturaEntero("elije opcion: "));
			
			//variable tipo int que es una copia del objeto opc tipo Opcion que sirve de variable de contrlo para el ciclo do-while
			opc1 = opc.getOpc();
			
			//clear screen
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			
			switch(opc.getOpc()){
				
			case 1:	/*Inicialización de elemento por elemento del arreglo; cada elemento del arreglo es un objeto del tipo Alumno*/
					for(int i = 0; i < 3; i++){
						//cada iteración se inicializa un objeto tipo alumno
						als[i] = new Alumno(CapturaEntrada.capturaString("Nombre: "));
						
						//objeto de tipo Calificaciones, cada iteración se inicializa tres materias por cada alumno
						cali1[i] = new Calificaciones(CapturaEntrada.capturaEntero("Calificacion de POO: "));
						cali2[i] = new Calificaciones(CapturaEntrada.capturaEntero("Calificacion de Metodos numericos: "));
						cali3[i] = new Calificaciones(CapturaEntrada.capturaEntero("Calificacion de Ingles II: "));
						//clear screen
						new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
					};
					break;
					
			case 2: /*ciclo que imprime las calificacioens y calcula el promedio por alumno*/
					for(int i = 0; i < 3; i++){
						System.out.println("Alumno" + "[" + (i+1) + "]: " + als[i].getNombre());
						System.out.println("Calificacion" + "[" + (i+1) + "]: " + cali1[i].getMateria());
						System.out.println("Calificacion" + "[" + (i+1) + "]: " + cali2[i].getMateria());
						System.out.println("Calificacion" + "[" + (i+1) + "]: " + cali3[i].getMateria());
						
						//calcula e imprime el promedio por alumno
						promedio = (cali1[i].getMateria() + cali2[i].getMateria() + cali3[i].getMateria()) / 3;
						System.out.println("Promedio: " + promedio);
						System.out.println();
					};
					break;
					
			case 3: /*Imprime calificaciones y calificacion mas baja*/
					for(int i = 0; i < 3; i++){
						System.out.println("Alumno" + "[" + (i+1) + "]: " + als[i].getNombre());
						System.out.println("Calificacion" + "[" + (i+1) + "]: " + cali1[i].getMateria());
						System.out.println("Calificacion" + "[" + (i+1) + "]: " + cali2[i].getMateria());
						System.out.println("Calificacion" + "[" + (i+1) + "]: " + cali3[i].getMateria());
													
						
						//estructura condicional que determnina cual es la calificacion mayor y menor
						if(cali1[i].getMateria() > cali2[i].getMateria()){
							if(cali1[i].getMateria() > cali3[i].getMateria()){
								mayor = cali1[i].getMateria();
								if(cali2[i].getMateria() > cali3[i].getMateria()){
									menor = cali3[i].getMateria();
								}
								else{
									menor = cali2[i].getMateria();
								}
							}
							else{
								mayor = cali3[i].getMateria();
								menor = cali2[i].getMateria();
							}
						}
						else{
							mayor = cali2[i].getMateria();
							if(cali1[i].getMateria() > cali3[i].getMateria()){
								menor = cali3[i].getMateria();
							}
							else{
								menor = cali1[i].getMateria();
							}
						}
						//imprime calificación más baja
						System.out.println("Calificacion mas bajas: "+ menor);
						System.out.println();	
					}; 
					break;
			case 4: /*4) Imprime calificacion y calificacion mas alta*/
					for(int i = 0; i < 3; i++){
						System.out.println("Alumno" + "[" + (i+1) + "]: " + als[i].getNombre());
						System.out.println("Calificacion" + "[" + (i+1) + "]: " + cali1[i].getMateria());
						System.out.println("Calificacion" + "[" + (i+1) + "]: " + cali2[i].getMateria());
						System.out.println("Calificacion" + "[" + (i+1) + "]: " + cali3[i].getMateria());
													
						//estructura condicional que determnina cual es la calificacion mayor y menor
						if(cali1[i].getMateria() > cali2[i].getMateria()){
							if(cali1[i].getMateria() > cali3[i].getMateria()){
								mayor = cali1[i].getMateria();
								if(cali2[i].getMateria() > cali3[i].getMateria()){
									menor = cali3[i].getMateria();
								}
								else{
									menor = cali2[i].getMateria();
								}
							}
							else{
								mayor = cali3[i].getMateria();
								menor = cali2[i].getMateria();
							}
						}
						else{
							mayor = cali2[i].getMateria();
							if(cali1[i].getMateria() > cali3[i].getMateria()){
								menor = cali3[i].getMateria();
							}
							else{
								menor = cali1[i].getMateria();
							}
						}
						//Imprime calificación más alta
						System.out.println("Calificacion mas alta: "+ mayor);
						System.out.println();																							
					}; 			
					break;
					
			case 5: System.out.println("5) Salir"); break;
			default: System.out.println("Opcion incorrecta!");
			}			
		}while(opc1 != 5);		
	}
}