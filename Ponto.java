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
		System.out.println(Math.sqrt(Math.pow((p1.getX()-p2.getX()),2)+Math.pow((p1.getY()-p2.getY()),2)));
	}
}
