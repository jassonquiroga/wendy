/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JApplet;
import javax.swing.JFrame;



/**
 *
 * @author AlphaTeam
 */
public class Dibujo extends JApplet {
    final static BasicStroke stroke = new BasicStroke(2.0f);
    
    public static void Dibujo1(Graphics g) {
        double x,y;
        Principal p = new Principal();
         p.jPanel1.repaint();
    
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.pink);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//Filtro antialiasing              
        // dibujo 
        
        
        g2.drawLine(100,200,150,100);
      g2.drawLine(200,200,150,100);
        g2.drawLine(100,200,20,200);
        g2.drawLine(100,290,20,200);
        g2.drawLine(100,290,60,400);
        g2.drawLine(150,320,60,400);
        g2.drawLine(100,290,60,400);
        g2.drawLine(240,400,150,320);
        g2.drawLine(200,275,240,400);
       g2.drawLine(200,275,280,200);
       g2.drawLine(200,200,280,200);
    }



   
}

