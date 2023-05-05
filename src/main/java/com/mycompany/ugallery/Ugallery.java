package com.mycompany.ugallery;

import Interfaces.Menu;
import Listas.ListadeUsuarios;

public class Ugallery {
    
    public static void main(String[] args) {
          ListadeUsuarios listaUsuario = new ListadeUsuarios();
        Menu menu = new Menu(listaUsuario);
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }
}
