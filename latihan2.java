/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.*;


/**
 *
 * @author Sumakmur Goenawan
 */
public class latihan2 extends Panel {
    Font f;
    String text = "halo kharisma";
    latihan2(){
        setBackground(Color.GRAY);
    }
    public void paint(Graphics g){
        f = new Font("Helvestica", Font.BOLD,48);
        //kotak hijau
        g.setColor(Color.GREEN);
        g.fillRect(8, 8, 366, 105);
        //hitam pinggiran
        g.setColor(Color.BLACK);
        g.drawRect(8, 8, 365, 105);
        g.setColor(Color.PINK);
        g.fillOval(10, 10, 360, 100);
        //pinggir merah
        g.setColor(Color.red);
        g.drawOval(10, 10, 360, 100);
        g.drawOval(9, 9, 362, 102);
        g.drawOval(8, 8, 364, 104);
        //tulisan hitam
        g.setColor(Color.black);
        g.setFont(f);
        g.drawString(text, 40, 75);
    }
    public static void main(String[] args) {
        Frame f = new Frame("Testing graphics panel");
        latihan2 gp = new latihan2();
        f.add(gp);
        f.setSize(900,900);
        f.setVisible(true);
    }
}
