package practica6;

public class Coche 
{
	private static final String EL_COCHE_CON_MATRICULA = "El coche con matrícula ";
	String matricula;
	String combustible;
	String modelo;
	String fabricante;

	public Coche()
	{
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f)
	{
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}

	public String combustible() 
	{
		String resultado = "";

		switch(combustible) 
		{
		case"Gasolina":
			resultado += cocheMasMatricula() + metodoGasolina(modelo, fabricante);
			break;

		case"Diésel":
			resultado += cocheMasMatricula() + metodoDiesel(modelo, fabricante);
			break;

		case"Híbrido":
			resultado += cocheMasMatricula() + metodoHibrido(modelo, fabricante);
			break;

		default:
			resultado += cocheMasMatricula() + " no dispone de información";
		}

		return resultado;
	}

	public String cocheMasMatricula()
	{
		return EL_COCHE_CON_MATRICULA + matricula + " ";
	}
	

	public String metodoGasolina(String modeloCoche, String fabricanteCoche)
	{
		return "Es un " + fabricanteCoche + modeloCoche + " y gasta 1,337 euros por litro.";
	}

	public String metodoDiesel(String modeloCoche, String fabricanteCoche)
	{
		return "Es un " + fabricanteCoche + modeloCoche + " y gasta 1,052 euros por litro.";
	}

	public String metodoHibrido(String modeloCoche, String fabricanteCoche)
	{
		return "Es un " + fabricanteCoche + modeloCoche +  " y no necesita combustible.";
	}
}
