public class Principal{
        public static void main(String args[]){
		Circulo c1 = new Circulo(2);
		System.out.println(c1.calcArea() +"--"+ c1.calcPeri());
                Triangulo t1 = new Triangulo(2,2);
                System.out.println(t1.calcArea() +"--"+ t1.calcPeri());
                Retangulo r1 = new Retangulo(2,2);
                System.out.println(r1.calcArea() +"--"+ r1.calcPeri());

        }
}


