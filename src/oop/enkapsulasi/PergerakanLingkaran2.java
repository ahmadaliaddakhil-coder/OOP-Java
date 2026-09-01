import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PergerakanLingkaran2 extends JPanel implements ActionListener {
    Lingkaran lingkaranArr[];
    public PergerakanLingkaran2() {
        createLingkaran();
        // Timer memicu aksi setiap 16 milidetik (sekitar 60 FPS)
        Timer timer = new Timer(16, this);
        timer.start();
    }

    public void createLingkaran(){
        lingkaranArr = new Lingkaran[5];

        for (int i = 0; i < lingkaranArr.length; i++) {
            double x, y;
            while (true) {
                x =  Math.random() * 600;
                y = Math.random() * 600;
                if (isInQuadrant1(x, y, 20)) {
                    break;
                }
            }
        
            Random rand = new Random();
            int dx = rand.nextInt(21) -10;
            int dy = rand.nextInt(21) -10;
            lingkaranArr[i] = new Lingkaran("Lingkaran" + (i + 1), x, y, 20, dx, dy, new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
        }
    }

    public static boolean isInQuadrant1(double x, double y, double radius) {
        return (x - radius >= 0 && y - radius >= 0);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // Mengaktifkan antialiasing agar lingkaran terlihat halus
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Menggambar lingkaran merah
        // g2d.setColor(Color.RED);
        // g2d.fillOval(x, y, DIAMETER, DIAMETER);
        for (Lingkaran lingkaran : lingkaranArr) {
            g2d.setColor(lingkaran.randomColor);
            g2d.fillOval((int)(lingkaran.x - lingkaran.radius), (int)(lingkaran.y - lingkaran.radius), (int)(lingkaran.radius * 2), (int)(lingkaran.radius * 2));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Gambar ulang layar
        for (Lingkaran lingkaran : lingkaranArr) {
            lingkaran.checkBoundary();
            lingkaran.move();
            for (Lingkaran other : lingkaranArr) {
                if (lingkaran != other && lingkaran.isBersinggungan(other)) {
                    // Jika bersinggungan, balik arah
                    lingkaran.dx = -lingkaran.dx;
                    lingkaran.dy = -lingkaran.dy;
                    other.dx = -other.dx;
                    other.dy = -other.dy;
                }
            }
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animasi Lingkaran Bergerak");
        PergerakanLingkaran2 panel = new PergerakanLingkaran2();
        
        frame.add(panel);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Membuka jendela di tengah layar
        frame.setVisible(true);
    }
}