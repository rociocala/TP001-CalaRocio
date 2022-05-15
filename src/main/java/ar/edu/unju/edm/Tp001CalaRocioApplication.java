package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Alumno6;
import ar.edu.unju.edm.model.Bisiesto;
import ar.edu.unju.edm.model.Mes4;
import ar.edu.unju.edm.model.Par3;
import ar.edu.unju.edm.model.Principal;
import ar.edu.unju.edm.model.Punto10;
import ar.edu.unju.edm.model.Punto11;
import ar.edu.unju.edm.model.Punto12;
import ar.edu.unju.edm.model.Punto8;
import ar.edu.unju.edm.model.Punto9;

@SpringBootApplication
public class Tp001CalaRocioApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp001CalaRocioApplication.class, args);
		
  //punto1
  Principal factoPrincipal = new Principal();
  factoPrincipal.setNum(5);
  System.out.println("El factorial es " + factoPrincipal.main());
	
  //punto2
  Bisiesto aniobisiesto = new Bisiesto();
  aniobisiesto.setAnio(2020);
  System.out.println("El año es:" + aniobisiesto.CalcularBisiesto());
  
  //punto3
  Par3 parImpar = new Par3();
  parImpar.setNum(7);
  System.out.println("El numero es:" + parImpar.Par());
  
  //punto4
  Mes4 nuevoMes = new Mes4();
  nuevoMes.setMes(12);
  System.out.println("El numero : " + nuevoMes.CalculoMes());
  
  //punto6
  Alumno6 nota = new Alumno6();
	int aux=8;
	while(aux>0){
		nota.setNum(aux);
		System.out.println(nota.Nota());
		aux--;
	}
	
	//punto8
	Punto8 secu = new Punto8();
	secu.setNum(4);
	System.out.println(secu.Secuencial());

	//punto9
	Punto9 secu3 = new Punto9();
	secu3.setNum(320);
	System.out.println(secu3.Secuencial3());
	
	//punto10
     Punto10 secu4 = new Punto10();
	 secu4.setNum(320);
     System.out.println(secu4.Secuencial4());
     
 	//punto11
     Punto11 secu5 = new Punto11();
	 secu5.setNum(320);
     System.out.println(secu5.Secuencial5());
     
 	//punto11
     Punto12 tiempo = new Punto12();
	 tiempo.setNum(6);
     System.out.println(tiempo.FormulaTiempo());
	}
}