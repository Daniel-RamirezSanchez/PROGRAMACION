Proceso fibonacci
	definir tmp, x, n1, n2, tam Como entero
	n1=0
	n2=1
	repetir
	  escribir "dime el tamaño. mayor de 2"
	  leer tam
  hasta que tam>=3
  escribir sin saltar n1, " ", n2
	para x<-3 hasta tam Hacer
		escribir Sin Saltar " " n1+n2
		tmp=n1+n2
		n1 = n2
		n2=tmp
		
	FinPara
FinProceso
