public class Triangulo extends FiguraGeometrica{
	private  double altura;
	
	public Triangulo(double retaBase, double altura){
		this.retaBase = retaBase;
		this.altura = altura;
	}
	
	public double  calcArea(){
		return retaBase*altura/2;
	}
	public double calcPeri(){
		return retaBase*3;
	}
}
