SubProceso v <- espar ( n ) 
	si n%2=0 entonces 
		v=Verdadero
	sino 
		v=Falso
	FinSi
Fin SubProceso

Proceso ejerciocio_definirfunciones_par_impar
	definir n Como Entero
	escribir "introduce el numero"
	leer n
	si espar(n) entonces 
		escribir "es par"
		sino 
			escribir"es impar"
		FinSi
	
	
FinProceso
