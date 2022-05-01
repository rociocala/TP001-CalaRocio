package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Alumno6;
import ar.edu.unju.edm.model.Bisiesto;
import ar.edu.unju.edm.model.Mes4;
import ar.edu.unju.edm.model.Par3;
import ar.edu.unju.edm.model.Principal;
import ar.edu.unju.edm.model.Punto10;
import ar.edu.unju.edm.model.Punto8;
import ar.edu.unju.edm.model.Punto9;

@Controller
public class PrincipalController {
@GetMapping("/Menu")
public String GetMenu() {
	return "index";
}
   //punto 1
@GetMapping("/Factorial")
public String getFactorialpage(@RequestParam (name="num") int num, Model model) {
	int Factorial=0;
	Principal factoPrincipal = new Principal();
	factoPrincipal.setNum(num);
    Factorial= factoPrincipal.main();
    model.addAttribute("Factorial", Factorial);
    return "Punto1";
}

  //punto2
@GetMapping("/Bisiesto")
public String getBipage (@RequestParam (name = "num") int num, Model model) {
	String BisiestoAnio;
	Bisiesto aniobisiesto = new Bisiesto ();
	aniobisiesto.setAnio(num);
	BisiestoAnio = aniobisiesto.CalcularBisiesto();
	model.addAttribute("BisiestoAnio", BisiestoAnio);
	return "Punto2";
}

  //punto3
@GetMapping("/Par")
public String getPIpage(@RequestParam (name ="num") int num, Model model) {
  String[] Aux1= new String[5];
    Par3 ParImpar = new Par3();
  for(int i=0;i<5;i++){
    ParImpar.setNum(num);
	Aux1[i] = ParImpar.Par();
    model.addAttribute("par1", Aux1[0]);
    model.addAttribute("par2", Aux1[1]);
    model.addAttribute("par3", Aux1[2]);
    model.addAttribute("par4", Aux1[3]);
    model.addAttribute("par5", Aux1[4]);
	num=num+3;
  }
	return "Punto3";
  }

  //punto4
@GetMapping("/Mes")
public String getmespage(@RequestParam (name ="num") int num, Model model) {
	String resultadoM;
	Mes4 nuevoMes=new Mes4();
	nuevoMes.setMes(num);
	resultadoM=nuevoMes.CalculoMes();
	model.addAttribute("resultadoM", resultadoM);
	return "punto4";
}
  
  //punto6
@GetMapping("/NotaAlumno")
public String getnotapage(@RequestParam (name ="num") int num, Model model) {
	String[] aux1= new String[5];
    Alumno6 nota = new Alumno6();
		for(int i=0;i<5;i++){
			nota.setNum(num);
			aux1[i] = nota.Nota();
			  model.addAttribute("nota1", aux1[3]);
		      model.addAttribute("nota2", aux1[5]);
		      model.addAttribute("nota3", aux1[7]);
		      model.addAttribute("nota4", aux1[9]);
		      model.addAttribute("nota5", aux1[2]);
		      num--;
		}return "punto6";
}

   //punto8
@GetMapping("/Secuencial2")
public String getSecupage(@RequestParam (name ="num") int num, Model model) {
	String cadena;
	Punto8 secu = new Punto8();
	secu.setNum(num);
    cadena= secu.Secuencial();
    model.addAttribute("cadena",cadena);
    return "Punto8";	
}

    //punto9
@GetMapping("/Secuencial3")
public String getSecu3page(@RequestParam (name ="num") int num, Model model) {
	String cadena;
	Punto9 secu3 = new Punto9();
	secu3.setNum(num);
 cadena= secu3.Secuencial3();
 model.addAttribute("cadena",cadena);
 return "Punto9";
}
 //punto9
  @GetMapping("/Secuencial4")
  public String getSecu4page(@RequestParam (name ="num") int num, Model model) {
  String cadena;
  Punto10 secu4 = new Punto10();
  secu4.setNum(num);
  cadena= secu4.Secuencial4();
  model.addAttribute("cadena",cadena);
  return "Punto10";
}
}