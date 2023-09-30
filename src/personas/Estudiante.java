package personas;

public class Estudiante 
{
	private int id;
	private int edad;
	
	private float calificacion;
	
	private String nombre;
	private String apellido;
	private String curso;
	
	public Estudiante(int id, int edad, float calificacion, String nombre, String apellido, String curso) 
	{
		this.id = id;
		this.edad = edad;
		this.calificacion = calificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.curso = curso;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public int getEdad() 
	{
		return edad;
	}

	public void setEdad(int edad) 
	{
		this.edad = edad;
	}

	public float getNota() 
	{
		return calificacion;
	}

	public void setNota(float calificacion) 
	{
		this.calificacion = calificacion;
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

	public String getCurso() 
	{
		return curso;
	}

	public void setCurso(String curso) 
	{
		this.curso = curso;
	}
}
