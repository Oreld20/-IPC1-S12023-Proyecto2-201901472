
package Listas;

public class NodoCategorias {
    private String Categoria;
    public NodoCategorias next;
    public ListaImagen listaImagenes = new ListaImagen();

    public NodoCategorias(String valor) {
        this.Categoria = valor;
        this.next = null;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategorias(String valor) {
        this.Categoria = valor;
    }

    public NodoCategorias() {
    }
    
    
}
