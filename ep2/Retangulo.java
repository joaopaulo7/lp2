public class Retangulo extends FiguraGeometrica{
        private  double altura;

        public Retangulo(double retaBase, double altura){
                this.retaBase = retaBase;
                this.altura = altura;
        }

        public double  calcArea(){
                return retaBase*altura;
        }
        public double calcPeri(){
                return retaBase*2 + altura*2;
        }
}



