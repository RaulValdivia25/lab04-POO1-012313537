package personas;

public class Empleado 
{
	private int id;
	private int salario;
	
	private String nombre;
	private String apellido;
	
	public Empleado(int id, int salario, String nombre, String apellido) 
	{
		this.id = id;
		this.salario = salario;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public int getSalario() 
	{
		return salario;
	}

	public void setSalario(int salario) 
	{
		this.salario = salario;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getApellido() 
	{
		return apellido;
	}

	public void setApellido(String apellido) 
	{
		this.apellido = apellido;
	}
	
	public int getSalarioAnual()
	{
		int salarioAnual;
		int tiempo;
		int salario;
		
		tiempo = 12;
		salario = getSalario();
		salarioAnual = salario * tiempo;
		
		return salarioAnual;
	}
}
