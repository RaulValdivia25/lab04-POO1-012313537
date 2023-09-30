import animales.Perro;
import figurasGeometricas.Punto;
import figurasGeometricas.Circulo;
import figurasGeometricas.Figura;
import figurasGeometricas.Rectangulo;
import figurasGeometricas.Triangulo;
import personas.Empleado;
import personas.Estudiante;;

public class testPrincipal 
{
	public static void main(String[] args) 
	{
		Perro perro1 = new Perro("Argos", "Pastor aleman", "Negro, marron, marron claeo", 1);
		Punto punto1 = new Punto(1.0, 1.0);
		Punto puntoTriangulo1 = new Punto(2.0, 2.0);
		Punto puntoTriangulo2 = new Punto(2.0, 2.0);
		Punto puntoTriangulo3 = new Punto(2.0, 2.0);
		Circulo circulo1 = new Circulo(1.5, "Rojo", punto1);
		Figura figura1 = new Figura("Cuadrado");
		Rectangulo rectanguo1 = new Rectangulo(12, 5);
		Triangulo triangulo1 = new Triangulo(puntoTriangulo1, puntoTriangulo2, puntoTriangulo3);
		Empleado empleado1 = new Empleado(1234, 350, "Will", "Smith");
		Estudiante estudiante1 = new Estudiante(4567, 17, 16, "Jose", "Gallegas", "Matematica");
		
		
	}
}
