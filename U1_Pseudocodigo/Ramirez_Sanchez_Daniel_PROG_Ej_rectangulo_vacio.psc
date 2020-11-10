Proceso rectangulo_vacio
	definir ancho, alto, f, c Como Entero
	escribir "escribe la anchura"
	leer ancho
	escribir"introduce altura"
	leer alto
	Para f<-1 Hasta alto Hacer
		para c<-1 hasta ancho Hacer
			Si f=1 o f=alto o c=1 o c=ancho Entonces
				escribir sin saltar"* "
			SiNo
				escribir sin saltar "--"
			Fin Si
		FinPara
		escribir""
	Fin Para
FinProceso
