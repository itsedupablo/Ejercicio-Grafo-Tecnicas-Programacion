package models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Grafo {
    private Map<Vertice, Set<Arista>> adyacencias;
    private boolean esDirigido;

    /**
     * @param esDirigido
     */
    public Grafo(boolean esDirigido) {
        this.esDirigido = esDirigido;
        this.adyacencias = new HashMap<>();
    }

    public void addVertice(Vertice vertice) {
        adyacencias.putIfAbsent(vertice, new HashSet<>());
    }

    public void addAristaPeso(Vertice origen, Vertice destino, double peso) {
        adyacencias.get(origen).add(new Arista(origen, destino, peso));
        if(!esDirigido) {
            adyacencias.get(destino).add(new Arista(destino, origen, peso));
        }
    }

    public void addArista(Vertice origen, Vertice destino ) {
        this.addAristaPeso(origen, destino, 1.0);
    }
    
    //Método para eliminar una arista dado un vértice origen y destino
	public void deleteArista(Vertice origen, Vertice destino) {
		Set<Arista> aristas = adyacencias.get(origen);
		Set<Arista> nuevasAristas = new HashSet<>();
		
		for (Arista arista : aristas) {
			
			if (!arista.getDestino().equals(destino)) {
			
				nuevasAristas.add(arista);
			}
		}
		
		adyacencias.put(origen, nuevasAristas);
	}

	//Método para obtener los nodos adyacentes a un vértice
	public Set<Vertice> getAdyacentes(Vertice vertice) {
	   
	    Set<Vertice> adyacentes = new HashSet<>();
	    Set<Arista> aristas = adyacencias.get(vertice);

	 
	    if (aristas != null) {
	      
	        for (Arista arista : aristas) {
	            Vertice verticeDestino = arista.getDestino();
	          
	            adyacentes.add(verticeDestino);
	        }
	    }

	  
	    return adyacentes;
	}


	public void deleteVertice(Vertice vertice) {
	    adyacencias.remove(vertice);

	    // Eliminar las aristas en las que el vértice es el destino
	    for (Set<Arista> conjuntoAristas : adyacencias.values()) {
	        conjuntoAristas.removeIf(arista -> arista.getDestino().equals(vertice));
	    }
	}


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for( Map.Entry<Vertice, Set<Arista>> entry : adyacencias.entrySet() ){
            for( Arista arista : entry.getValue()) {
                builder.append(arista.getOrigen().getId())
                        .append(" -> ")
                        .append(arista.getDestino().getId())
                        .append(" [")
                        .append(arista.getPeso())
                        .append("]\n");
            }
        }
        return builder.toString();
    }

    public Map<Vertice, Set<Arista>> getAdyacencias() {
        return adyacencias;
    }

    public boolean isEsDirigido() {
        return esDirigido;
    }
}
