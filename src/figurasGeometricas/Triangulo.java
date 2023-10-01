package figurasGeometricas;

public class Triangulo 
{
	private Punto vertice1 = new Punto();
	private Punto vertice2 = new Punto();
	private Punto vertice3  = new Punto();
	
	public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) 
	{
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
		this.vertice3 = vertice3;
	}

	public Punto getVertice1() 
	{
		return vertice1;
	}
	
	public void setVertice1(Punto vertice1) 
	{
		this.vertice1 = vertice1;
	}
	
	public Punto getVertice2() 
	{
		return vertice2;
	}
	
	public void setVertice2(Punto vertice2) 
	{
		this.vertice2 = vertice2;
	}
	
	public Punto getVertice3() 
	{
		return vertice3;
	}
	
	public void setVertice3(Punto vertice3) 
	{
		this.vertice3 = vertice3;
	}
	
	public void mostrarInformacion()
	{
		Punto vertice1 = getVertice1();
		Punto vertice2 = getVertice2();
		Punto vertice3 = getVertice3();
		
		System.out.println("La informacion del vertice 1 es: ");
		vertice1.mostrarInformacion();
		System.out.println("La informacion del vertice 2 es: ");
		vertice2.mostrarInformacion();
		System.out.println("La informacion del vertice 3 es: ");
		vertice3.mostrarInformacion();
	}
}
