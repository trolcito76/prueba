package Herencia1;

public class Producto {

	 String Nombre;
	 
	 double Precio;
	 
	 public Producto(String Nombre, double Precio){
	     this.Nombre=Nombre;
	     this.Precio=Precio;
	 }
	 
	 public String getNombre(){
	     return this.Nombre;
	 }
	 
	 public void setnombre(String Nombre){
	     
	     this.Nombre=Nombre;
	 }
	 
	 public double getPrecio(){
	     return this.Precio;
	 }
	 
	 public void setPrecio(double Precio){
	    this.Precio=Precio;
	 }
	 public double  Calcular(int Cantidad){
	     return(this.Precio*Cantidad);
	 }

	  public String MostrarDatos(){

	      return("NOMBRE: "+this.Nombre+" PRECIO: "+this.Precio);
	  }  

	    

	}