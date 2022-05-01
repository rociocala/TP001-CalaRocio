package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto10 {
	private int num;
	String aux;
public Punto10() {
	//TODO Auto-generated constructor stub
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
  public String Secuencial4() {         
	  String resultado="";
	    while(num>=160){
	      aux=String.valueOf(num);
	      resultado= resultado + " " + aux;
	      num=num-20;
	    }
	    return resultado;
}
}
