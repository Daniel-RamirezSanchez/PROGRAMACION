Proceso ej_control_acceso
	definir codigo , clave, num_int Como Entero
	codigo=8888
	num_int=0
	Repetir
		escribir"introduzca contraseña"
		leer clave
		si clave<>codigo entonces 
			escribir"esa no es"
			num_int=num_int + 1
		FinSi
	Hasta Que clave = codigo o num_int=4
	si clave <>codigo entonces 
		escribir "has consumido numero de intentos"
	sino 
		escribir "clave correcta"
	FinSi
	
FinProceso
