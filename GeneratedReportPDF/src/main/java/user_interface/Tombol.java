/* Membuat class Tombol yang nantinya digunakan untuk customisasi tombol pada Program 
 * Pemrogram : Gede Rico Wijaya - 2005551091 
 *
 * Class tombol merupakan inheritence dari JButton yang dilakukan modifikasi terhadap 
 * bentuk dari JButton
 */
package user_interface;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.RenderingHints;
import java.awt.GradientPaint;
import java.awt.geom.RoundRectangle2D.Double;
import java.awt.geom.Rectangle2D;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Tombol extends JButton implements MouseListener {
    // membuat variabel boolean yang dimana untuk mengatur Kinerja dari
    // Button yang akand dibuat
    private boolean RoundButton;
    private boolean BackgroundPainted;
    private boolean LinePainted;
    private boolean MouseEntered;
    private boolean MousePressed;

    // mengatur warna untuk komponen dari tombol- tombol yang digunakan
    private Color warnaMasuk;
    private Color warnaKlik;
    private Color gradientBackgroundColor;
    private Color gradientLineColor;
    private Color lineColor;
    private Object RoundRectangle2D;

    // membuat constructor untuk tombol yang akan digunakan dan dimodifikasi
    public Tombol() {
        super();
        // settings untuk membuat roound button
        RoundButton = false;
        BackgroundPainted = true;
        LinePainted = true;
        MouseEntered = false;
        MousePressed = false;

        warnaMasuk = getBackground().brighter();
        warnaKlik = getBackground().darker();
        lineColor = Color.BLACK;
        setContentAreaFilled(false);
        setFocusPainted(false);

        // agar method dari Mouse Listener yang dapat digunakan
        addMouseListener(this);
    }

    /**
     * --Overriding method dari Class JButton, melakukan method overriding terhadap
     * Class Tombol yang dimana merupakan pengambilan dari method yang terdapat pada
     * JButton
     * 
     * @param warna
     */
    @Override
    // method untuk mengatur warna background
    public void setBackground(Color warna) {
        super.setBackground(warna);
        warnaMasuk = warna.brighter();
        warnaKlik = warna.darker();
    }

    // method mewaranai component dari Button
    @Override
    protected void paintComponent(Graphics graph) {
        // memberikan manipulasi pada graphic tombol
        Graphics2D graph2 = (Graphics2D) graph;
        graph2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // mengatur posisi yang diberikan pada tombol yang akan dibuat
        Shape bentuk = (RoundButton == true)
                ? new RoundRectangle2D.Double(1.0, 1.0, getWidth() - 2.0, getHeight() - 2.0, getHeight() - 2.0)
                : new Rectangle2D.Double(1.0, 1.0, getWidth() - 2, getHeight() - 2, getHeight() - 2);

        // mengecek kondisi yang nantinya akan mengubah warna dari Button
        if (BackgroundPainted || (MousePressed && !BackgroundPainted)) {
            if (gradientBackgroundColor == null) {
                graph2.setColor(warna());
            } else {
                GradientPaint paint = new GradientPaint(0, 0, getBackground(), getWidth(), getHeight(), gradientBackgroundColor);
                graph2.setPaint(paint);
            }
            graph2.fill(bentuk);
        }

        if(LinePainted) {
            if(gradientLineColor == null) {
                graph2.setColor(isEnabled() ? lineColor : new Color(204, 204, 204,));
            } else {
                GradientPaint paint = new GradientPaint(0, 0, getBackground(), getWidth(), getHeight(), gradientBackgroundColor);
                graph2.setPaint(paint);
            }
            graph2.draw(bentuk);
        }
        super.paintComponent(graph);
    }

    // method warna () untuk modifikasi warna yang dimana akan mengubah state dari
    // Tombol seperti saat MouseEntered atau MousePressed
    private Color warna() {
        if (!isEnabled())
            return new Color(204, 204, 204);

        Color temporary = getBackground();
        // diberikan kondisi saat Mouse masuk dan menekan tombol yang dimana akan
        // mengambalikan warna
        if (MousePressed)
            return warnaKlik;
        if (MouseEntered)
            return warnaMasuk;

        // mengembalikan warna sementara
        return temporary;
    }

    // Method ini digunakan untuk melakukan Rounding atau agak button tidak
    // berbentuk begitu kotak
    public void setRounded(boolean RoundButton) {
        this.RoundButton = RoundButton;
    }

    public void setBackgroundPainted(boolean backgroundPainted) {
        this.BackgroundPainted = backgroundPainted;
    }

    public void setLinePainted(boolean linePainted) {
        this.LinePainted = linePainted;
    }

    /**
     * Overriding method dari MouseListener, melakukan overriding method yang akan
     * digunakan pada class Tombol yang dimana akan menggunakan method dari
     * MouseListener
     */
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    // event menekan tombol
    @Override
    public void mousePressed(MouseEvent eventPressed) {
        MousePressed = true;
    }

    // event melepas tombol
    @Override
    public void mouseReleased(java.awt.event.MouseEvent eventReleased) {
        MousePressed = false;
    }

    // event masuk ke tombol
    @Override
    public void mouseEntered(MouseEvent eventEntered) {
        MouseEntered = true;

    }

    // event keluar dari tombol
    @Override
    public void mouseExited(java.awt.event.MouseEvent eventExit) {
        MouseEntered = true;
    }

}
