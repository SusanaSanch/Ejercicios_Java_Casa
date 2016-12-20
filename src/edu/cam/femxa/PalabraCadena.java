package edu.cam.femxa;

public class PalabraCadena {

	
	
	//HACED UN MÉTODO QUE DADA UNA CADENA, MUESTRE CADA UNA DE LAS LETRAS CON UN BUCLE FOR

	/**
	 * Dada una cadena, muestra cada una de las letras con un bucle for
	 * @param palabra Cadena a mostrar
	 */
	
	public void mostrarLetrasFor (String palabra)
	{
		int longi = palabra.length();
		char letra = 0;
		
		for (int index = 0; index < longi; index ++)
		{
			letra = palabra.charAt(index);
			System.out.println("Letra " + index + " = "+ letra);
		}
	}
	
	
	//HACED UN MÉTODO QUE DADA UNA CADENA Y UN NÚMERO N, MUESTRE LOS N PRIMEROS NÚMEROS DE LA CADENA
	
	/**
	 * Dada una cadena y un número N, muestra los N primeros números de la cadena
	 * @param palabra Cadena a mostrar
	 * @param n Número de caracteres a mostrar de la cadena
	 */
	
	public void mostrarLetrasHastaN (String palabra, int n)
	{
		int index = 0;
		char letra = 0;
		int longi = palabra.length();
		
		if (n < longi)
		{
			while (index < n) 
			{
				letra = palabra.charAt(index);
				System.out.println("Letra " + index + " = "+ letra);
				index ++;
			}
		}
			else
			{
				System.out.println("El número de letras de la cadena es inferior al número dado");
			}
		
	}
	
	
	//HACED UN MÉTODO QUE DADA UNA CADENA Y UN NÚMERO N, MUESTRE LOS N ÚLTIMOS NÚMEROS DE LA CADENA
	
	
	public void mostrarUltimasNLetras ()
	{
		//TODO
	}
	
	

	//HACED UN MÉTODO QUE DADA UNA CADENA Y UNA LETRA, DEVUELVA EL NÚMERO DE VECES QUE APARECE ESA LETRA EN ESA PALABRA
	 
	public void mostrarNVecesLetra ()
	{
		//TODO
	}
	
	
	/**
	 * Muestra las letras de la palabra hasta encontrar la letra dada.
	 * @param Palabra palabra a mostrar.
	 * @param letra_encontrada Letra a encontrar en la palabra.
	 */
	
	public void mostrarLetrasPalabraHastaEncontrarLetra (String palabra, char letra_encontrada)
	{
		boolean b_letra_encontrada = false;
		int index = 0;
		int longi = palabra.length();
		char letra_mostrada = 0;
		
		
		while ((index < longi) && (!b_letra_encontrada))
		{
			letra_mostrada = palabra.charAt(index);
			System.out.println("Letra " + index + " = "+ letra_mostrada);
			index = index + 1;
			if (letra_encontrada == letra_mostrada)
			{
				b_letra_encontrada = true;
			}
		}
		
		
	}
	
	public void mostrarLetrasPalabra (String palabra)
	{
		int index = 0;
		int longi = palabra.length();
		char letra = 0; //la letra es un número en el fondo, recuerda
		
		while (index < longi)
		{
			letra = palabra.charAt(index);
			System.out.println("Letra " + index + " = "+ letra);
			index = index + 1;
		}
		
	}
	

}
