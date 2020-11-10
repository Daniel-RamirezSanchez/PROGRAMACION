Proceso multiplos_de8
	definir n , multiplo Como Entero
	escribir "escribe un numero"
	leer n
	multiplo=0
	mientras multiplo<=10
		si n%8=0 entonces 
			multiplo =multiplo +1
			escribir n, "es multiplo de 8"
		FinSi
		n = n+1
	FinMientras
	
FinProceso
