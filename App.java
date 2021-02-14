package co.edu.uan.lab01;

/**
 * Hello world!
 *
 */
import java.io.*; 

class Rectangulo{
         private double base;
         private double altura;
         public Rectangulo(double b, double h) // Constructor  
                {base = b; altura=h; }  
                
        public void setBase(double b)  
            {base=b;}
        public void setAltura(double h)
            {altura=h;}
        public double getBase()
            {return base;}
        public double getAltura() 
            {return altura;}
            public double area()  
}

public class pruebaRectangulo{     public static void main(String args[]) throws IOException    { BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); double b, h;             Rectangulo            R;            System.out.print("Ingrese base : ");             b=Double.parseDouble(br.readLine());                        System.out.print("Ingrese altura : ");             h=Double.parseDouble(br.readLine());            R = new Rectangulo(b,h);             System.out.println("Rectangulo            :            "+R);            System.out.println("Area : "+R.area()); System.out.println(“Perimetro : “+R.perimetro()); System.out.println("Diagonal : "+R.diagonal()); 
   } }
