package figurasGeometricas;

public class Rectangulo 
{
	private float largo = 1.0f;
	private float ancho = 1.0f;
	
	public Rectangulo(float largo, float ancho) 
	{
		super();
		this.largo = largo;
		this.ancho = ancho;
	}

	public float getLargo() 
	{
		return largo;
	}
	
	public void setLargo(float largo) 
	{
		this.largo = largo;
	}
	
	public float getAncho() 
	{
		return ancho;
	}
	
	public void setAncho(float ancho) 
	{
		this.ancho = ancho;
	}
	
	public float getArea()
	{
		float area;
		float ancho;
		float largo;
		
		ancho = getAncho();
		largo = getLargo();
		area = ancho * largo;
		
		return area;
	}
}
