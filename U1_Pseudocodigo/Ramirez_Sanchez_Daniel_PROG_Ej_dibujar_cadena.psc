Proceso dibujar_cadena
	definir tam, f  como entero
	
	Repetir 
		escribir "introduce el tamaño de la figura. impar y mayor que 3"
		LEER tam
	Hasta Que tam%2=1 y tam>3
	para f<-1 hasta tam  Hacer
		si f%3=1   entonces
			escribir"XX    XX"
			sino escribir "XXXXXXXX"
		FinSi
		escribir ""
	FinPara
	
FinProceso
