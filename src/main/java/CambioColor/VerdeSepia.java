/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CambioColor;

import java.awt.Color;

/**
 *
 * @author lobje
 */
public class VerdeSepia extends CambioVerde{
    
    public VerdeSepia(String filename) {
        super(filename);
    }
    
    @Override
    public void repintar(int i, int j, Color color) {
        int promedio = (color.getBlue()+color.getGreen()+color.getRed())/3;
        Color NewColor = new Color(promedio, 127, promedio);
        bmp.setRGB(i, j, NewColor.getRGB());
    }
}
