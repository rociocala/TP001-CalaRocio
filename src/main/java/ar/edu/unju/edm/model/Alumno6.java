package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Alumno6 {
	int num;
	public Alumno6() {
		//TODO Auto-generated constructor stub
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String Nota(){
		String resultadoNota;
		if(num==6) {
			resultadoNota="Alumno regularizado";
		}else {
			if(num>7 && num<=10) {
				resultadoNota="El alumno promociona";
			}else {
				if(num<6 && num>=1) {
					resultadoNota="El alumno desaprueba";
				}else {
					resultadoNota="Valor no permitido";

				}}}
		return resultadoNota;
		}
}