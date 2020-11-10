Proceso ejerccio6_1
	definir n1 Como entero
	Escribir "escribe tu contraseña"
	Leer n1
	Mientras n1<>1234 Hacer
		escribir "contraseña icorrecta."
		escribir "vuelva a escribir su contraseña"
		leer n1
	Fin Mientras
	si n1=1234 Entonces
		escribir"contraseña correcta"
	FinSi
FinProceso
