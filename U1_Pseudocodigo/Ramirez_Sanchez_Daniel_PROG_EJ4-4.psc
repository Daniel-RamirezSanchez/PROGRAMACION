Proceso ejercicio4_4
	definir n1 como entero 
	definir n2 Como Entero
	escribir"escribe 2 numeros"
	leer n1
	leer n2
	si n1>0 y n2>0 entonces
		Escribir "ambos son positivos"
	sino
		si (n1<0 y n2>0) o (n1>0 y n2<0) Entonces
			Escribir "solo uno es positivo"
		SiNo
			si n1<0 y n2<0 entonces 
				Escribir "ninguno es positivo"
			FinSi
			
		FinSi
	FinSi
FinProceso
