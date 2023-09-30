package figurasGeometricas;

public class Figura 
{
	private String nombre;

	public Figura(String nombre) 
	{
		this.nombre = nombre;
	}

	protected String getNombre() 
	{
		return nombre;
	}

	protected void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	 public double getArea()
	 {
		 return 0;
	 }
	 
	 public boolean isRegular()
	 {
		 return false;
	 }
}
