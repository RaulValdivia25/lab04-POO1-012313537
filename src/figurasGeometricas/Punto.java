package figurasGeometricas;

public class Punto 
{
	private double coordenadaX;
	private double coordenadaY;
	
	
	public Punto(double coordenadaX, double coordenadaY) 
	{
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}
	
	public Punto ()
	{
	}
	public double getCoordenadaX() 
	{
		return coordenadaX;
	}
	
	public void setCoordenadaX(double coordenadaX) 
	{
		this.coordenadaX = coordenadaX;
	}
	
	public double getCoordenadaY() 
	{
		return coordenadaY;
	}
	
	public void setCoordenadaY(double coordenadaY) 
	{
		this.coordenadaY = coordenadaY;
	}
	
	public void mostrarInformacion()
	{
		double coordenadax = getCoordenadaX();
		double coordenaday = getCoordenadaY();
		
		System.out.println("La coordenada del punto en el eje X es: " + coordenadax);
		System.out.println("La coordenada del punto en el eje Y es: " + coordenaday);
	}
}