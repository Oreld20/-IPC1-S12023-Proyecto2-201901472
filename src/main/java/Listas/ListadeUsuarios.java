
package Listas;



public class ListadeUsuarios{

    private NodoUsuario inicio;
    private int index;
    public ListadeUsuarios() {
        this.inicio = null;
        this.index=0;
    }
    
   
    public void add(String nombreUsuario) {
        if(inicio==null)
        {
            inicio = new NodoUsuario(nombreUsuario);
            index++;
            Mensaje("El elemento con valor "+nombreUsuario +" se agrego correctamente");
        }
        else
        {
            NodoUsuario tmp = inicio;
            
            for (int i = 0; i < this.index; i++) {
                if(tmp !=null){
                    if(!tmp.getNombreUsuario().equals(nombreUsuario)){
                        if(tmp.next==null){
//                            Nodo nuevo =new Nodo((int)e, null);
//                            tmp.next = nuevo;
                            
                            tmp.next = new NodoUsuario(nombreUsuario);
                            index++;
                            Mensaje("El elemento con valor "+nombreUsuario +" se agrego correctamente");
                        }
                        else{
                             tmp = tmp.next;
                        }
                    }
                    else {
                        Mensaje("El elemento con valor "+nombreUsuario +" ya existe en la lista");
                        break;
                    }
                }
            }
        }
    }

   
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    public Object find(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public Object getNext() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    public int getSize() {
        return index;
    }

  
    public Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public boolean existeUsuario(String nombre){
        if(this.index==0) {
         return false;
     }else{
            NodoUsuario tmp = inicio;

            for (int i = 0; i < this.index; i++) {
                if (tmp!=null) {
                    if (nombre.equals(tmp.getNombreUsuario())) {
                       return true; 
                    }
                     tmp = tmp.next;
                }
            }
      }
       return false;
    }
    
    public NodoUsuario getUsuario(String nombre){
     if(this.index==0) {
         return null;
     }else{
            NodoUsuario tmp = inicio;

            for (int i = 0; i < this.index; i++) {
                if (tmp!=null) {
                    if (nombre.equals(tmp.getNombreUsuario())) {
                        return tmp;
                    }
                     tmp = tmp.next;
                }
            }
      }
       return null;
    }
    public void setCategoriasUsuario(String usuario, String categoria){
     
            NodoUsuario tmp = inicio;

            for (int i = 0; i < this.index; i++) {
                if (tmp!=null) {
                    if (tmp.getNombreUsuario().equals(usuario)) {
                       tmp.listaCategoria.add(categoria);
                       break;
                    }
                     tmp = tmp.next;
                }
            }
    }

    
    public void delete(String nombreUsuario) {
        if(index==0) Mensaje("Lista vacia");
        else{
            NodoUsuario tmp1 = inicio;
            NodoUsuario tmp2 = inicio.next;
            /* Se verifica que solo un elemento en la lista*/
            if(tmp2==null){
                if(tmp1.getNombreUsuario()==(nombreUsuario)){
                    inicio = null;
                    index--;
                    Mensaje("El elemento con valor "+nombreUsuario+" se ha eliminado");
                }
                else Mensaje("No existe un elemento con el valor "+nombreUsuario);
            }
            /* Si la lista tiene 2 o mas elementos */
            else{
                /* Si el elemento a eliminar en la lista es el primero */
                if(tmp1.getNombreUsuario()==nombreUsuario){
                    inicio = tmp1.next;
                    index--;
                    Mensaje("El elemento con valor "+nombreUsuario+" se ha eliminado");
                }
                else{
                    for (int i = 0; i < this.index; i++) {
                        if(tmp2 != null){
                            if(tmp2.getNombreUsuario()==nombreUsuario){
                                tmp1.next = tmp2.next;
                                index--;
                                Mensaje("El elemento con valor "+nombreUsuario+" se ha eliminado");
                                break;
                            }
                            else{
                                tmp1 = tmp2;
                                tmp2 = tmp2.next;
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void Mensaje(String m){
        System.out.println("--> " + m);
    }
    
    public void mostrar(){
        if(index==0) Mensaje("Lista vacia");
        else{
            NodoUsuario tmp = inicio;

            for (int i = 0; i < this.index; i++) {
                //Mensaje("Elemento No. " + (i+1)+ " es "+tmp.getValor());
                System.out.print(tmp.getNombreUsuario()+" --> ");
                tmp = tmp.next;
            }
            System.out.print("null");
            System.out.println("");
        }
    }
    
    public void modificar(String val, String newVal){
        boolean eliminado = false;
        if(index==0) Mensaje("Lista vacia");
        else{
            NodoUsuario tmp = inicio;
            for (int i = 0; i < this.index; i++) {
                if(tmp.getNombreUsuario().equals(val)){
                    tmp.setNombreUsuario(newVal);
                    Mensaje("El elemento con valor "+val+" se ha cambiado al valor "+newVal);
                    eliminado = true;
                    break;
                }
                else tmp = tmp.next;
            }
            
            if(!eliminado) Mensaje("No se encontro el elemento con el valor " + val);
        }
    }
}
