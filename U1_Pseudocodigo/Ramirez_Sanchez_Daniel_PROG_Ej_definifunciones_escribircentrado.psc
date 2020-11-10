Funcion linea <- escribircentrado ( cad )
	definir tam, esp, contador Como Entero
	tam =longitud(cad)
	esp=trunc((80-tam)/2)
	linea=""
	para contador <-1 hasta esp hacer 
		linea=Concatenar(linea,"-")
	FinPara
	linea=linea+cad+linea
Fin Funcion

Algoritmo centrado
	definir text Como Caracter
	escribir "introduce cadena"
	leer text
	
	escribir escribircentrado(text)
FinAlgoritmo
