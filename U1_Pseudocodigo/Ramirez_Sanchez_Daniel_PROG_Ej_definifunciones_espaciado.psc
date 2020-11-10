funcion c <- espaciado(cad)
	definir pos como entero
	c=""
	para pos<-1 hasta Longitud(cad) Hacer
		c=c+Subcadena(cad,pos,pos)+"-"
	FinPara
FinFuncion

Algoritmo espacios
	definir cad como caracter 
	escribir "introduce el texto"
	leer cad 
	escribir espaciado(cad)
	
FinAlgoritmo
