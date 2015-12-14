package boletin5_2;

public class Clase5_2 {
     private double meridiano ;
     private double paralelo;
     private double distanciaTerra ;

 public Clase5_2 ( ) {

   }

public Clase5_2 ( double m, double p , double d ){

meridiano = m ;
paralelo = p;
distanciaTerra = d ;

}
public void verPosicion ( ) {

System.out.println ("o satelite atopase  no paralelo "+ paralelo + " meridiano " + meridiano+ " a unha distancia da terra de " + distanciaTerra );  
    
}
}

