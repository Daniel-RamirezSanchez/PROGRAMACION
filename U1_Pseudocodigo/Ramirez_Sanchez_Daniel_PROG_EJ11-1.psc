Proceso ejercicio11_1
	definir n1, n2, num_int como entero
	n1<-1+ azar(100)
	escribir n1
	num_int<-0
	repetir 
		escribir"introduzca un numero"
		leer n2
		si n1>n2 Entonces
			escribir"esa no es:te has quedado corto"
			num_int=num_int+1
		sino 
			si n1<n2 entonces
			Escribir "esa no es: te has pasado"
			num_int=num_int+1
		FinSi
	FinSi
	
	Hasta Que n1=n2 o num_int=7
	si n1<>n2 entonces 
		escribir"has consumido el numero de intentos"
		sino 
			escribir "has acertado"
		FinSi
FinProceso

	

