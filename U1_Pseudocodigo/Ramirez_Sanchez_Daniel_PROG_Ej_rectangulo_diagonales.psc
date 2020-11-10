Proceso rectangulo_diagonal
	definir tam, c, f Como Entero
Repetir
	escribir "introduce la medida. impar y mayor que 5"
	leer tam
Hasta Que  tam>=5 y tam%2=1
para f<-1 hasta tam hacer
	para c<-1 hasta tam Hacer
		si f=1 o f=tam o c=1 o c=tam o f=c o (f+c)=(tam+1) Entonces
			escribir sin saltar "*"
			sino escribir sin saltar "-"
		FinSi
	FinPara
	escribir""
FinPara
FinProceso
