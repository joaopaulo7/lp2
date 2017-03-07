public class Circulo extends FiguraGeometrica{
        public Circulo(double retaBase){
                this.retaBase = retaBase;
        }

        public double  calcArea(){
                return Math.pow(retaBase,2)*3.14;
        }
        public double calcPeri(){
                return retaBase*6.28;
        }
}









