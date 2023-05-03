
package Listas;

public class NodoUsuario {
    private String NombreUsuario;
    public NodoUsuario next;
    public  ListadeCategorias listaCategoria= new ListadeCategorias();
    

    public ListadeCategorias getListaCategoria() {
        return listaCategoria;
        
    }

    public void setListaCategoria(ListadeCategorias listaCategoria) {
        this.listaCategoria = listaCategoria;
    }

    public NodoUsuario(String valor) {
        this.NombreUsuario = valor;
        this.next = null;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String valor) {
        this.NombreUsuario = valor;
    }

    public NodoUsuario() {
        this.listaCategoria= new ListadeCategorias();
    }
    
    
}
