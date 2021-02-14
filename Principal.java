package co.edu.uan.lab01;
import java.io.*; 
import java.lang.Math;

/*********************************************************/
/*   EJERCICIO DE PROGRAMACION ORIENTADA A OBJETOS       */
/*   AUTOR: GEOVANI LEANDRO MARTINEZ                     */
/*********************************************************/


public class Principal
{
    public static void main(String args[]) throws IOException    
    {
     
     int figura;
     
        //instaciar con un objeto que permita capturar en la consola
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
     
     Rectangulo R;
     Circulo C;


     System.out.print("Ingrese la opción que desea procesar [1] Rectangulo, [2] Circulo: ");
        figura=Integer.parseInt(br.readLine());


        if (figura==1) 
        {
        //generar rectangulo cpaturar datos para el rectangulo
            
            double base;
            double altura;
            double posx;
            double posy;
            

            System.out.print("Ingrese base del rectangulo: ");
            base=Double.parseDouble(br.readLine());
            System.out.print("Ingrese altura del rectangulo: ");
            altura=Double.parseDouble(br.readLine());
            System.out.print("Ingrese posicion X para el rectangulo: ");
            posx=Double.parseDouble(br.readLine());
            System.out.print("Ingrese posicion y para el rectangulo: ");
            posy=Double.parseDouble(br.readLine());
            R = new Rectangulo(base,altura,posx,posy); 
        } //fin generar rectangulo
        else if (figura==2) //generar circulo
        {
            double radial;
            System.out.print("Ingrese el radio del circulo: ");
            radial=Double.parseDouble(br.readLine());
            C = new Circulo(radial);
        }
        else
        {
            System.out.print("Figura no se puede procesar");
        }//fin generar circulo

    } 

}


public class Figuras
{
   
    double Fbase, Faltura;
    double Fradio;
    double Fcoordenadax, Fcoordenaday;
   
     //metodos calculan el area con sobre carga de metodos
    public double area() 
    { 
        return Fbase * Faltura;
    }

    public double area(double rad)
    { 
        Fradio=rad;
            
        return (Math.PI)*(Math.pow(Fradio,2));
    }
    
}


class Rectangulo extends Figuras
{
         private double base;
         private double altura;

         Figuras F = new Figuras(); 

        public Rectangulo(){}// Constructor  vacio
        

        public Rectangulo(double b, double h, double px, double py) //Constructor con parametros base y altura
        {
            F.Fbase = b; 
            F.Faltura = h;
            F.Fcoordenadax = px;
            F.Fcoordenaday = py;

            System.out.println("Rectangulo Ancho= " +F.Fbase + ", Largo= " +F.Faltura + ", Posición ["+F.Fcoordenadax+","+F.Fcoordenaday+ "]");
            System.out.println("Area : "+F.area()); 
        }  

}

class Circulo extends Figuras
{
        
         
         Figuras F = new Figuras(); 

        public Circulo(){}// Constructor  vacio
        

        public Circulo(double radio) //Constructor con parametros radio
        {
            System.out.println("Circulo (radio= " +radio + ")");
            System.out.println("Area : "+F.area(radio)); 
        }  

}