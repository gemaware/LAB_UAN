package co.edu.uan.lab01;
import java.io.*; 


public class Figuras
{
    public static void main(String args[]) throws IOException    
    {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
     double b, h;
     Rectangulo R;
     System.out.print("Ingrese base : ");
     b=Double.parseDouble(br.readLine());
     System.out.print("Ingrese altura : ");
     h=Double.parseDouble(br.readLine());
     R = new Rectangulo(b,h); 
     
     System.out.println("Rectangulo Area : "+R.area()); 
     
    } 
}



class Rectangulo extends Figuras
{
         private double base;
         private double altura;
        public Rectangulo(){};// Constructor  vacio

        public Rectangulo(double b, double h) //Constructor con parametros bse y altura
            {base = b; altura=h; }  
        public double area()
        { return base * altura; }
                
 
}

