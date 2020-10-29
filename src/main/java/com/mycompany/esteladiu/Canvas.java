
package com.mycompany.esteladiu;

import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;

public class Canvas extends JPanel{
    
    private Point[] p = new Point[5];
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i < p.length; i++){
            g.fillOval(p[i].x, p[i].y, 10, 10);
        }
    }
    
    public void setPoint(Point po){
        System.arraycopy(p,1,p,0,4);
        this.p[4] = (Point) po.clone();
    }
   
}
