# Ejercicio-Grafo-Tecnicas-Programacion
### Pseudocódigo métodos desarrollados
```
Función deleteArista(Vertice origen, Vertice destino):
		Coleccion aristas = obtener aristas adyacentes(origen)
		Coleccion nuevasAristas
		
		para cada arista en la colección 'aristas':
			 si (destino de la arista != destino):
			 añadir arista a nuevasAristas
			
		añadir a adyacencias(origen, nuevasAristas)
	
	Función getAdyacentes(Vertice vertice):
	   Coleccion vertices adyacentes = 
		 Coleccion aristas = obtener aristas adyacentes(vertice)

     si (aristas != null):
       para cada arista en la colección 'aristas':
          Vertice verticeDestino = vértice destino Arista();
	           añadir vertice a adyacentes
	    devolver adyacentes
	
	Función deleteVertice(Vertice vertice) {
	    elimnar vertice de coleccion adyacencias

      para cada arista en la colección 'aristas':
          eliminar una arista si su vértice destino == vertice
```
### Explicación de la implementación de los métodos a desarrollar

