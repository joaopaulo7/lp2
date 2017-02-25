public class Reta{
	private Ponto p1,p2;
	public void setP1(Ponto p){
		this.p1 = p;
	}
	public void setP2(Ponto p){
		this.p2 = p;
	}
	public Ponto getP1(){
		return this.p1;
	}
	public Ponto getP2(){
		return this.p2;
	}
	public double calcEpot(){
		return (Math.sqrt(Math.pow((p1.getX()-p2.getX()),2)+Math.pow((p1.getY()-p2.getY()),2)));
	}
	public double calcArea(){
		return (this.p1.getY()+this.p2.getY())*(Math.abs(this.p1.getX()-this.p2.getX())/2);
	}
}
