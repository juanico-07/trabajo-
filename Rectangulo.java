package ejercicios;

public class Rectangulo {
	private double base, altura;
	
	public Rectangulo(){
		setBase(0);
		setAltura(0);
	}
	
	public Rectangulo(double b, double a){
		setBase(b);
		setAltura(a);
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double calcularPerimetro() {
		return base*2+altura*2;
	}


	public double calcularArea() {
		return base*altura;
	}

}
