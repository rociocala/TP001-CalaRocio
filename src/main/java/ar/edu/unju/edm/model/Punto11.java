package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto11 {
	private int num;
	String aux;
	public Punto11() {
		//TODO Auto-generated constructor stub
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
public String Secuencial5(){
		String resultado="";
	do{
	  aux=String.valueOf(num);
	  resultado= resultado + " " + aux;
	  num=num-20;
    }while(num>=160);
	   return resultado;
	}
}
