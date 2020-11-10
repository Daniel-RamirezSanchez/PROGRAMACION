Funcion v <- esmultiplo ( n1, n2 )
	si n2%n1=0 entonces 
		v= Verdadero
	SiNo
		v=Falso
	FinSi
	
Fin Funcion

Algoritmo es_multiplo
	definir n1 , n2 como entero 
	escribir "introduce un numero"
	leer n1
	escribir"introduce otro numero"
	leer n2
	si esmultiplo(n1 , n2) entonces
		escribir n2 " es multiplo de " n1
	sino 
		escribir n2 " no es multiplo de " n1
	FinSi
	
FinAlgoritmo
