package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto9 {
	private int num;
	String aux;
public Punto9() {
	//TODO Auto-generated constructor stub
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}

public String Secuencial3() {
     String resultado="";
     for(int i=20;num>=160;num=num-i) {
    	 aux=String.valueOf(num);
    	 resultado=resultado + " "+aux;
     }
     return resultado;
}

}
