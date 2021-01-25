/*
Parte 1
 */
package arbol;

/**
 *
 * @author lcastro
 */
public class Nodo {
    public int Numero;
    public Object Nombre;
    public Nodo hijoIzq;
    public Nodo hijoDer;
    
    public Nodo(int num, Object nom){
    this.Numero=num;
    this.Nombre=nom;
    this.hijoIzq=null;
    this.hijoDer=null;
    }
    
}
