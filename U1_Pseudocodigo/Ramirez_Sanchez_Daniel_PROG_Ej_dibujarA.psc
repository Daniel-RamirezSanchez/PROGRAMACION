Proceso dibujarA
	definir tam, f, c como entero
	Repetir
	escribir "introduce el tamaño de la A. mayor que 3 e impar."
	leer tam
	hasta que tam%2=1 y tam>3
	para f<-1 hasta tam  Hacer
		si (f=1) o (f=trunc(tam/2)+1) entonces
			escribir"xxxxx"
			sino escribir "x___x"
		FinSi
		
	FinPara
	
FinProceso
