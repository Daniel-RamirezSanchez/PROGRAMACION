Funcion d <- numdivisores ( n )
	definir c Como Entero
	d=0
	para c<-1 hasta n Hacer
		si n%c=0 entonces 
			escribir c, "es divisor"
			d=d+1
		FinSi
	FinPara
Fin Funcion

Algoritmo esdivisor
	definir n, c como entero 
	Repetir
	  escribir "introduce un numero"
	  leer n
  hasta que n>0
  c<-numdivisores(n)
	escribir n, "tiene ", c
FinAlgoritmo
