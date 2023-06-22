/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author furat
 */
public class BackgroundPanel extends JPanel{
    private Image backgroundImage;

    public BackgroundPanel() {
        // Mengimpor gambar sebagai latar belakang
        backgroundImage = new ImageIcon("/gambar").getImage();
        setPreferredSize(new Dimension(500, 500));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Menggambar gambar latar belakang
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), null);
    }
}
