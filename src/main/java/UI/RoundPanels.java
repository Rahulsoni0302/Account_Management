/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class RoundPanels extends JPanel {
    /**
     * @return the topleft
     */
    
    public RoundPanels(){
        setOpaque(true);
        setBackground(new Color(0, 153, 153));
    }
    public int getTopleft() {
        return topleft;
    }

    /**
     * @param topleft the topleft to set
     */
    public void setTopleft(int topleft) {
        this.topleft = topleft;
        repaint();
    }

    /**
     * @return the topright
     */
    public int getTopright() {
        return topright;
    }

    /**
     * @param topright the topright to set
     */
    public void setTopright(int topright) {
        this.topright = topright;
        repaint();
    }

    /**
     * @return the bottomleft
     */
    public int getBottomleft() {
        return bottomleft;
    }

    /**
     * @param bottomleft the bottomleft to set
     */
    public void setBottomleft(int bottomleft) {
        this.bottomleft = bottomleft;
        repaint();
    }

    /**
     * @return the bottomright
     */
    public int getBottomright() {
        return bottomright;
        
    }

    /**
     * @param bottomright the bottomright to set
     */
    public void setBottomright(int bottomright) {
        this.bottomright = bottomright;
        repaint();
    }

    /**
     * Creates new form MainFrame
     */
        private int topleft = 100;
    private int topright = 100;
    private int bottomleft = 100;
    private int bottomright = 100;
    
    @Override
    public void paintComponents(Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        Area area = new Area(createRoundTopLeft());
        if(topright>0){
            area.intersect(new Area(createRoundTopRight()));
        }
        if(bottomleft>0){
            area.intersect(new Area(createRoundBottomLeft()));
        }
        if(topleft>0){
            area.intersect(new Area(createRoundTopLeft()));
        }
        if(bottomright>0){
            area.intersect(new Area(createRoundBottomRight()));
        }
        g2.fill(area);
        g2.dispose();
        super.paintComponents(grphcs);
    }
    
    private Shape createRoundTopLeft(){
        int width = getWidth();
        int height = getHeight();
        int roundx = Math.min(width, topleft);
        int roundy = Math.min(width, topleft);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width,height, roundx, roundy));
        area.add(new Area(new Rectangle2D.Double(roundx/2, 0, width - roundx/2 , height)));
        area.add(new Area(new Rectangle2D.Double(0, 0, width , height - roundy/2)));
        return area;
    }

    
    private Shape createRoundTopRight(){
        int width = getWidth();
        int height = getHeight();
        int roundx = Math.min(width, topright);
        int roundy = Math.min(width, topright);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width,height, roundx, roundy));
        area.add(new Area(new Rectangle2D.Double(0, 0, width - roundx/2 , height)));
        area.add(new Area(new Rectangle2D.Double(0, roundy/2, width , height - roundy/2)));
        return area;
    }
    
    private Shape createRoundBottomLeft(){
        int width = getWidth();
        int height = getHeight();
        int roundx = Math.min(width, bottomleft);
        int roundy = Math.min(width, bottomleft);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width,height, roundx, roundy));
        area.add(new Area(new Rectangle2D.Double(roundx / 2, 0, width - roundx/2 , height)));
        area.add(new Area(new Rectangle2D.Double(0, 0, width , height - roundy/2)));
        return area;
    }
    
        private Shape createRoundBottomRight(){
        int width = getWidth();
        int height = getHeight();
        int roundx = Math.min(width, bottomright);
        int roundy = Math.min(width, bottomright);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width,height, roundx, roundy));
        area.add(new Area(new Rectangle2D.Double(0, 0, width - roundx/2 , height)));
        area.add(new Area(new Rectangle2D.Double(0, 0, width , height - roundy/2)));
        return area;
    }
}
