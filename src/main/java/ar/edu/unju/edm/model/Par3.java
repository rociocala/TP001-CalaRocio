package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Par3 {
	private int num;

	public Par3(){
	//TODO Auto-generated constructor stub
   }
	public Par3(int num) {
		this.num =num;
	}
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public String Par(){
		String resultado;
		if(num%2==0) {
			resultado=" Par";
		}else {
			resultado="Impar";
		}
		return resultado;
	}
	
}

