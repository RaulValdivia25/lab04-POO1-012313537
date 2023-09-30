package figurasGeometricas;

public class Cuadrilatero 
{
	private Punto lado1;
	private Punto lado2;
	private Punto lado3;
	private Punto lado4;
	


	public Cuadrilatero(Punto lado1, Punto lado2, Punto lado3, Punto lado4) 
	{
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}
	
	public Punto getLado1() 
	{
		return lado1;
	}

	public void setLado1(Punto lado1) 
	{
		this.lado1 = lado1;
	}

	public Punto getLado2() 
	{
		return lado2;
	}

	public void setLado2(Punto lado2) 
	{
		this.lado2 = lado2;
	}

	public Punto getLado3() 
	{
		return lado3;
	}

	public void setLado3(Punto lado3) 
	{
		this.lado3 = lado3;
	}

	public Punto getLado4() 
	{
		return lado4;
	}

	public void setLado4(Punto lado4) 
	{
		this.lado4 = lado4;
	}
}
