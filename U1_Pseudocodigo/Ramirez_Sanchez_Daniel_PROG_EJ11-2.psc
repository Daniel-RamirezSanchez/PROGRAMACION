Proceso ejercicio11_2
	definir n Como Entero
	repetir
		escribir "introduce un numero"
		leer n
		Mientras n>0 Hacer
			escribir  "la raiz cuadrada de " n " es " rc(n)
			escribir "introduce un numero"
			leer n
		Fin Mientras
		si n<>0 y n<0 entonces 
			escribir "numero no valido. introduzca numero positivo"
		SiNo
			
			escribir "fin del programa"
		FinSi
	Hasta Que n=0 
FinProceso
