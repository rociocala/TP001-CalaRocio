package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto12 {
	 int num;
	 double aux,g=9.81;
	String resultado;
 public Punto12() {
	//TODO Auto-generated constructor stub
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}

public String FormulaTiempo() {
	aux=(Math.sqrt((2*num)/g));
    resultado = String.valueOf(aux);
    return resultado;
}
}
