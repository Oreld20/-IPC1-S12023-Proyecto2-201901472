
package Listas;

public class Imagen {
    private String name;
    private String path_;
    private Imagen next;
    private Imagen back;

    public Imagen(String name, String path_) {
        this.name = name;
        this.path_ = path_;
        this.next = null;
        this.back = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath_() {
        return path_;
    }

    public void setPath_(String path_) {
        this.path_ = path_;
    }

    public Imagen getNext() {
        return next;
    }

    public void setNext(Imagen next) {
        this.next = next;
    }

    public Imagen getBack() {
        return back;
    }

    public void setBack(Imagen back) {
        this.back = back;
    }
    
    public void setNextBack(Imagen next, Imagen back){
        this.next = next;
        this.back = back;
    }
}
