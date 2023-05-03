
package Listas;

public class Nodo {
    private int valor;
    public Nodo next;

    public Nodo(int valor) {
        this.valor = valor;
        this.next = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
