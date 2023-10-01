import animales.Perro;
import figurasGeometricas.Punto;
import figurasGeometricas.Circulo;
import figurasGeometricas.Figura;
import figurasGeometricas.Rectangulo;
import figurasGeometricas.Triangulo;
import personas.Empleado;
import personas.Estudiante;
import java.util.Scanner;

public class testPrincipal 
{
	public static void main(String[] args) 
	{
		Perro perro1 = new Perro("Argos", "Pastor aleman", "Negro, marron, marron claro", 1);
		Punto punto1 = new Punto(1.0, 1.0);
		Punto verticeTriangulo1 = new Punto(2.0, 2.0);
		Punto verticeTriangulo2 = new Punto(2.0, 2.0);
		Punto verticeTriangulo3 = new Punto(2.0, 2.0);
		Circulo circulo1 = new Circulo(1.5, "Rojo", punto1);
		Figura figura1 = new Figura("Cuadrado");
		Rectangulo rectangulo1 = new Rectangulo(12, 5);
		Triangulo triangulo1 = new Triangulo(verticeTriangulo1, verticeTriangulo2, verticeTriangulo3);
		Empleado empleado1 = new Empleado(1234, 350, "Will", "Smith");
		Estudiante estudiante1 = new Estudiante(4567, 17, 16, "Jose", "Gallegas", "Matematica");

		perro1.mostrarInformacion();
		punto1.mostrarInformacion();
		circulo1.mostrarInformacion();
		figura1.mostrarInformacion();
		rectangulo1.mostrarInformacion();
		triangulo1.mostrarInformacion();
		empleado1.mostrarInformacion();
		estudiante1.mostrarInformacion();
		
		Scanner entradaTipoInt = new Scanner(System.in);
		Scanner entradaTipoDouble = new Scanner(System.in);
		Scanner entradaTipoString = new Scanner(System.in);
		Scanner entradaTipoFloat = new Scanner(System.in);
		
		// Profesora.....
		
		String nombrePerro;
		String razaPerro;
		String colorPerro;
		
		int edadPerro;
		
		System.out.println("Ingrese los datos del perro: ");
		
		System.out.println("Nombre: ");
		nombrePerro = entradaTipoString.nextLine();
		perro1.setNombre(nombrePerro);
		
		System.out.println("Raza: ");
		razaPerro = entradaTipoString.nextLine();
		perro1.setTipoRaza(razaPerro);
		
		System.out.println("Color: ");
		colorPerro = entradaTipoString.nextLine();
		perro1.setColor(colorPerro);
		
		System.out.println("Edad: ");
		edadPerro = entradaTipoString.nextInt();
		perro1.setEdad(edadPerro);
		
		// No cree que....
		
		double coordenadaX;
		double coordenadaY;
		
		System.out.println("Ingrese los datos del punto: ");
		
		System.out.println("Ubiacion en el eje X: ");
		coordenadaX = entradaTipoDouble.nextDouble();
		punto1.setCoordenadaX(coordenadaX);
		
		System.out.println("Ubiacion en el eje Y: ");
		coordenadaY = entradaTipoDouble.nextDouble();
		punto1.setCoordenadaY(coordenadaY);
		
		
		// Son demasiados Get y Set?
		
		double centroCoordenadaX;
		double centroCoordenadaY;
		double radio;
		
		String color;
		
		System.out.println("Ingrese los datos del circulo: ");
		
		System.out.println("Radio: ");
		radio = entradaTipoDouble.nextDouble();
		circulo1.setRadio(radio);
		
		System.out.println("Color: ");
		color = entradaTipoString.next();
		circulo1.setColor(color);
		
		System.out.println("Ingrese los datos del centro del circulo: ");
		
		System.out.println("Ubiacion en el eje X: ");
		centroCoordenadaX = entradaTipoDouble.nextDouble();
		punto1.setCoordenadaX(centroCoordenadaX);
		
		System.out.println("Ubiacion en el eje Y: ");
		centroCoordenadaY = entradaTipoDouble.nextDouble();
		punto1.setCoordenadaY(centroCoordenadaY);
		
		// Digo, son 11 clases
		
		float largo;
		float ancho;
		
		System.out.println("Ingrese los datos del rectangulo: ");
		
		System.out.println("Largo: ");
		largo = entradaTipoFloat.nextFloat();
		rectangulo1.setLargo(largo);
		
		System.out.println("Acho: ");
		ancho = entradaTipoFloat.nextFloat();
		rectangulo1.setAncho(ancho);
		
		// Exceptuando Figura, ya que sus motedos estan protegidos
		
		double verticeCoordenadaX;
		double verticeCoordenadaY;
		
		System.out.println("Ingrese los datos del triangulo: ");
		
		System.out.println("Ingrese los datos del vertice 1: ");
		
		System.out.println("Ubiacion en el eje X: ");
		verticeCoordenadaX = entradaTipoDouble.nextDouble();
		verticeTriangulo1.setCoordenadaX(verticeCoordenadaX);
		
		System.out.println("Ubiacion en el eje Y: ");
		verticeCoordenadaY = entradaTipoDouble.nextDouble();
		verticeTriangulo1.setCoordenadaY(verticeCoordenadaY);
		
		System.out.println("Ingrese los datos del vertice 2: ");
		
		System.out.println("Ubiacion en el eje X: ");
		verticeCoordenadaX = entradaTipoDouble.nextDouble();
		verticeTriangulo2.setCoordenadaX(verticeCoordenadaX);
		
		System.out.println("Ubiacion en el eje Y: ");
		verticeCoordenadaY = entradaTipoDouble.nextDouble();
		verticeTriangulo2.setCoordenadaY(verticeCoordenadaY);
		
		System.out.println("Ingrese los datos del vertice 3: ");
		
		System.out.println("Ubiacion en el eje X: ");
		verticeCoordenadaX = entradaTipoDouble.nextDouble();
		verticeTriangulo3.setCoordenadaX(verticeCoordenadaX);
		
		System.out.println("Ubiacion en el eje Y: ");
		verticeCoordenadaY = entradaTipoDouble.nextDouble();
		verticeTriangulo3.setCoordenadaY(verticeCoordenadaY);
		
		// Aparte, cada uno con sus atributos...
		
		int idEmpleado;
		int salario;
		
		String nombreEmpleado;
		String apellidoEmpleado;
		
		System.out.println("Ingrese los datos del empleado: ");
		
		System.out.println("Nombre: ");
		nombreEmpleado = entradaTipoString.nextLine();
		empleado1.setNombre(nombreEmpleado);
		
		System.out.println("Apellido: ");
		apellidoEmpleado = entradaTipoString.nextLine();
		empleado1.setApellido(apellidoEmpleado);
		
		System.out.println("ID: ");
		idEmpleado = entradaTipoInt.nextInt();
		empleado1.setId(idEmpleado);
		
		System.out.println("Salario: ");
		salario = entradaTipoInt.nextInt();
		empleado1.setId(salario);
		
		// Genera todo este codigo, digo, esta es la linea 189
		
		int idEstudiante;
		int edad;
		
		float calificacion;
		
		String nombreEstudiante;
		String apellidoEstudiante;
		String curso;
		
		System.out.println("Ingrese los datos del estudiante: ");
		
		System.out.println("Nombre: ");
		nombreEstudiante = entradaTipoString.nextLine();
		estudiante1.setNombre(nombreEstudiante);
		
		System.out.println("Apellido: ");
		apellidoEstudiante = entradaTipoString.nextLine();
		estudiante1.setApellido(apellidoEstudiante);
		
		System.out.println("ID: ");
		idEstudiante = entradaTipoInt.nextInt();
		estudiante1.setId(idEstudiante);
		
		System.out.println("Edad: ");
		edad = entradaTipoInt.nextInt();
		estudiante1.setEdad(edad);
		
		System.out.println("Curso en el que es participe: ");
		curso = entradaTipoString.nextLine();
		estudiante1.setCurso(curso);
		
		System.out.println("Calificacion: ");
		calificacion = entradaTipoFloat.nextFloat();
		estudiante1.setNota(calificacion);
		
		// Bueno, al menos ya estamos cerca del final
		
		System.out.println("La nueva informacion de los objetos es: ");
		
		perro1.mostrarInformacion();
		punto1.mostrarInformacion();
		circulo1.mostrarInformacion();
		figura1.mostrarInformacion();
		rectangulo1.mostrarInformacion();
		triangulo1.mostrarInformacion();
		empleado1.mostrarInformacion();
		estudiante1.mostrarInformacion();
		
		entradaTipoInt.close();
		entradaTipoString.close();
		entradaTipoFloat.close();
		entradaTipoDouble.close();
		
		// Bueno, eso es todo
	}
}
