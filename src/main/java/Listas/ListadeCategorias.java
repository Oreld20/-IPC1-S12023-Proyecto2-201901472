package Listas;
public class ListadeCategorias{

    private NodoCategorias inicio;
    private int index;
    
    public ListadeCategorias() {
        this.inicio = null;
        this.index=0;
    }
    
   
    public void add(String nombreCategoria) {
        if(inicio==null)
        {
            inicio = new NodoCategorias(nombreCategoria);
            index++;
            Mensaje("El elemento con valor "+nombreCategoria +" se agrego correctamente");
        }
        else
        {
            NodoCategorias tmp = inicio;
            
            for (int i = 0; i < this.index; i++) {
                if(tmp !=null){
                    if(tmp.getCategoria()!=nombreCategoria){
                        if(tmp.next==null){
//                            Nodo nuevo =new Nodo((int)e, null);
//                            tmp.next = nuevo;
                            
                            tmp.next = new NodoCategorias(nombreCategoria);
                            index++;
                            Mensaje("El elemento con valor "+nombreCategoria +" se agrego correctamente");
                        }
                        else{
                             tmp = tmp.next;
                        }
                    }
                    else {
                        Mensaje("El elemento con valor "+nombreCategoria +" ya existe en la lista");
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
    
    public NodoCategorias getNodo(int posicion){
     if(this.index==0) {
         return null;
     }else{
            NodoCategorias tmp = inicio;

            for (int i = 0; i < this.index; i++) {
                if (tmp!=null) {
                    if (i==posicion) {
                        return tmp; 
                    }
                     tmp = tmp.next;
                }
            }
      }
       return null;
    }
    
    public NodoCategorias getNodo(String nombre){
     if(this.index==0) {
         return null;
     }else{
            NodoCategorias tmp = inicio;

            for (int i = 0; i < this.index; i++) {
                if (tmp!=null) {
                    if (tmp.getCategoria().equals(nombre)) {
                        return tmp; 
                    }
                     tmp = tmp.next;
                }
            }
      }
       return null;
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

    
    public void delete(String nombreCategoria) {
        if(index==0) Mensaje("Lista vacia");
        else{
            NodoCategorias tmp1 = inicio;
           NodoCategorias tmp2 = inicio.next;
            /* Se verifica que solo un elemento en la lista*/
            if(tmp2==null){
                if(tmp1.getCategoria()==(nombreCategoria)){
                    inicio = null;
                    index--;
                    Mensaje("El elemento con valor "+nombreCategoria+" se ha eliminado");
                }
                else Mensaje("No existe un elemento con el valor "+nombreCategoria);
            }
            /* Si la lista tiene 2 o mas elementos */
            else{
                /* Si el elemento a eliminar en la lista es el primero */
                if(tmp1.getCategoria()==nombreCategoria){
                    inicio = tmp1.next;
                    index--;
                    Mensaje("El elemento con valor "+nombreCategoria+" se ha eliminado");
                }
                else{
                    for (int i = 0; i < this.index; i++) {
                        if(tmp2 != null){
                            if(tmp2.getCategoria()==nombreCategoria){
                                tmp1.next = tmp2.next;
                                index--;
                                Mensaje("El elemento con valor "+nombreCategoria+" se ha eliminado");
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
            NodoCategorias tmp = inicio;

            for (int i = 0; i < this.index; i++) {
                //Mensaje("Elemento No. " + (i+1)+ " es "+tmp.getValor());
                System.out.print(tmp.getCategoria()+" --> ");
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
            NodoCategorias tmp = inicio;
            for (int i = 0; i < this.index; i++) {
                if(tmp.getCategoria()==val){
                    tmp.setCategorias(newVal);
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
