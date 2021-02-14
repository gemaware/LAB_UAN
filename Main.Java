package co.edu.uan.lab01;
import java.io.*; 

public class Main
{
    public static void main(String args[]) throws IOException    
    {
     //instacion con un objeto que permita capturar en la consola
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
     
     //Figuras F = new Figuras() 
     Rectangulo R;

     //generar rectangulo
        
        double base;
        double altura;
        System.out.print("Ingrese base : ");
        base=Double.parseDouble(br.readLine());
        System.out.print("Ingrese altura : ");
        altura=Double.parseDouble(br.readLine());
        R = new Rectangulo(base,altura); 

        
        System.out.println("Rectangulo Area : "+R.area()); 
     
     //fin generar rectangulo




    } 

}



public class Figuras
{
   
    double Fbase, Faltura;
    double Fradio;
    int Fcoordenadax, Fcoordenaday;
    
    
}


class Rectangulo extends Figuras
{
         private double base;
         private double altura;

         Figuras F = new Figuras(); 

        public Rectangulo(){};// Constructor  vacio
        

        public Rectangulo(double b, double h) //Constructor con parametros base y altura
        {
            F.Fbase = b; 
            F.Faltura = h;
        }  

        public double area()
        { 
            return F.Fbase * F.Faltura; 
        }
                
 
}