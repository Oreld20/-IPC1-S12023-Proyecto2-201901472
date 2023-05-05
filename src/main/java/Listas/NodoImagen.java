/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

/**
 *
 * @author lobje
 */
public class NodoImagen {
    private String name;
    private String path_;
    private NodoImagen next;
    private NodoImagen back;

    public NodoImagen(String name, String path_) {
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

    public NodoImagen getNext() {
        return next;
    }

    public void setNext(NodoImagen next) {
        this.next = next;
    }

    public NodoImagen getBack() {
        return back;
    }

    public void setBack(NodoImagen back) {
        this.back = back;
    }
    
    public void setNextBack(NodoImagen next, NodoImagen back){
        this.next = next;
        this.back = back;
    }
}
