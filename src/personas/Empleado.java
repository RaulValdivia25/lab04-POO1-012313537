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
	
	public void mostrarInformacion()
	{
		int id = getId();
		int salario = getSalario();
		int salarioAnual = getSalarioAnual();
		
		String nombre = getNombre();
		String apellido = getApellido();
		
		System.out.println("El nombre completo del empleado es: " + nombre + " " + apellido);
		System.out.println("El ID del empleado es: " + id);
		System.out.println("El salario del empleado es: " + salario);
		System.out.println("El salario anual del empleado es: " + salarioAnual);
	}
}
