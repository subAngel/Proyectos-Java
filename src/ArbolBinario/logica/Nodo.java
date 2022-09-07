/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArbolBinario.logica;

/**
 *
 * @author angel
 * @param <T>
 */
public class Nodo<T> {
    private T elemento;
    private Nodo izquierdo, derecho;
    
    // Constructor

    public Nodo(T elemento) {
        this.elemento = elemento;
    }
    
    public T getElemento(){
        return elemento;
    }
    
    public Nodo getIzquierdo() {
        return izquierdo;
    }
    
    public Nodo getDerecho() {
        return derecho;
    }
    
    // Funcion insertar
    public Nodo insertar(Nodo n, T elemento){
        if (n == null)
            return new Nodo(elemento);
        else if (elemento.hashCode() < n.elemento.hashCode())
            n.izquierdo = insertar(n.izquierdo, elemento);
        else if (elemento.hashCode() > n.elemento.hashCode())
            n.derecho = insertar(n.derecho, elemento);
        return n;
    }
    
    public int nodosCompletos(Nodo n) {
        if (n == null)
            return 0;
        else {
            if (n.izquierdo != null && n.derecho != null)
                return nodosCompletos(n.izquierdo) + nodosCompletos(n.derecho) + 1;
            return nodosCompletos(n.izquierdo) + nodosCompletos(n.derecho);
        }
    }
}
