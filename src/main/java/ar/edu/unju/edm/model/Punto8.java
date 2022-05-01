package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto8 {
	private int num;
	String aux;
	public Punto8() {
		//TODO Auto-generated constructor stub
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
public String Secuencial() {
	String resultado="";
	do {
		num=num+4;
		aux=String.valueOf(num);
		resultado=resultado + " "+aux;
	}while(num<100);
	return resultado;
}
   
}
