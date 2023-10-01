package figurasGeometricas;

public class Figura 
{
	private String tipoNombre;

	public Figura(String tipoNombre) 
	{
		this.tipoNombre = tipoNombre;
	}

	protected String getTipoNombre() 
	{
		return tipoNombre;
	}

	protected void setTipoNombre(String tipoNombre) 
	{
		this.tipoNombre = tipoNombre;
	}
	
	 public double getArea()
	 {
		 return 0;
	 }
	 
	 public boolean isRegular()
	 {
		 return false;
	 }
	 
	 public void mostrarInformacion()
	 {
		 String tipoNombre = getTipoNombre();
		 
		 System.out.println("El nombre del tipo de la figura es: " + tipoNombre);
	 }
}
