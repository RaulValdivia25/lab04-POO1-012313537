package figurasGeometricas;

public class Circulo 
{
	private double radio;
	final double PI = Math.PI;
	
	private Punto centro;
	
	private String color;

	public Circulo(double radio, String color, Punto centro) 
	{
		this.radio = radio;
		this.color = color;
		this.centro = centro;
	}

	public double getRadio() 
	{
		return radio;
	}

	public void setRadio(double radio) 
	{
		this.radio = radio;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}
	
	public Punto getCentro() 
	{
		return centro;
	}

	public void setCentro(Punto centro) 
	{
		this.centro = centro;
	}

	public double getArea()
	{
		double area;
		double radio = getRadio();
		
		area = radio * radio * PI;
		
		return area;
	}
	
	public double getPerimetro()
	{
		double radio = getRadio();
		double perimetro;
		
		perimetro = (radio * 2) * PI;
		
		return perimetro;
	}
	
	public void mostrarInformacion()
	{
		double radio = getRadio();
		
		String color = getColor();
		
		Punto centro = getCentro();
		
		System.out.println("El radio del circulo es: " + radio);
		System.out.println("El color del circulo es: " + color);
		System.out.println("Los datos del centro son: ");
		centro.mostrarInformacion();
	}
}