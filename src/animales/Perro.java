package animales;

public class Perro 
{
	private String nombre;
	private String raza;
	private String color;
	
	private int edad;
	
	public Perro(String nombre, String raza, String color, int edad) 
	{
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.edad = edad;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getTipoRaza() 
	{
		return raza;
	}

	public void setTipoRaza(String raza) 
	{
		this.raza = raza;
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	public int getEdad() 
	{
		return edad;
	}

	public void setEdad(int edad) 
	{
		this.edad = edad;
	}
	
	public void mostrarInformacion()
	{
		String nombre = getNombre();
		String raza = getTipoRaza();
		String color = getColor();
		
		int edad = getEdad();
		
		System.out.println("El nombre del perro es: " + nombre);
		System.out.println("La raza del perro es: " + raza);
		System.out.println("El color del perro es: " + color);
		System.out.println("La edad del perro es: " + edad);
	}
}