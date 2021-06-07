Algoritmo Ejercicio8
	Escribir "*** Se generará un número multiplo de 5 en cada evento ***"
	definir exit Como Caracter
	exit = "a"
	Mientras exit <> "s" Hacer
		n = Aleatorio(1,500) * 5
		Escribir "Multiplo de 5 : " n	
		Escribir "*** Escriba: ´s´, si desea que el programa acabe, si no, presione ´ENTER´ ***"
		Leer exit
	FinMientras
FinAlgoritmo
