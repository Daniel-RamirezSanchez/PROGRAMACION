Proceso relojArena
	definir tam, c, f como entero 
	Repetir
		escribir"introduce un numero mayor que 3 e impar"
	    leer tam
	Hasta Que tam>3 y tam%2=1
	para f<- 1 hasta tam 
		para c<-1 hasta tam Hacer
			si f=1 o f=tam o (c>=f y f+c<=tam+1) o (f+c>=tam+1 y c<=f)
				escribir sin saltar"*"
			sino
				escribir sin saltar"-"
			FinSi
		FinPara
		escribir ""
	FinPara
	
FinProceso
