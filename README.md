# Reto10
Hecho por: 
Samuel Acevedo(CC.1001016099)
Efraín García(CC.1001370984)


Punto 2) Consulte y explique para qué sirve y en qué consiste la función flatMap en Java. ¿Es esta
una función de orden superior? ¿Por qué?

La diferencia reside en que la función .map() devuelve tantas salidas como elementos se le proporcionen en el stream, es decir, cada elemento del stream de entrada se transforma de acuerdo a un función lambda en un elemento del stream de salida; mientras que .flatMap() transforma cada elemento de entrada en 1 o más valores de salida.
