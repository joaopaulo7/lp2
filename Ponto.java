public class Ponto{
	private double x,y;

	public Ponto(){
		System.out.println("construtor");
	}
	public void  setX(double novo){
		this.x = novo;
	}
	public double getX(){
		return this.x;
	}
	public void setY(double novo){
		this.y = novo;
	}
	public double getY(){
		return this.y;
	}



	public static void main(String[] args){
		Ponto p1 = new Ponto();
		p1.setX(7.0);
		p1.setY(2.0);
		Ponto p2 = new Ponto();
		p2.setX(3.0);
		p2.setY(5.0);
		Reta r1 = new Reta();
		r1.setP1(p1);
		r1.setP2(p2);
		System.out.println(r1.calcEpot());
		System.out.println(r1.calcArea());
	}
}
