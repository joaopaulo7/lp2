public class Ponto{
	private double x,y;
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
		p1.setX(10.0);
		p1.setY(20.0);
		Ponto p2 = new Ponto();
		p2.setX(15.0);
		p2.setY(30.0);
		System.out.println(p1.getX() + "-" + p1.getY());
		System.out.println(p2.getX() + "-" + p2.getY());
		Ponto p3 = new Ponto();
		p3.x = 50; p3.y = 70;
		p3 = p1;
		System.out.println(p3.x + "-" + p3.y);
		Ponto p4 = p3;
	}
}
