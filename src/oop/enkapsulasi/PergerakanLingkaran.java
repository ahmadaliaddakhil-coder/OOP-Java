import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PergerakanLingkaran extends JPanel implements ActionListener {
    // Posisi awal lingkaran
    private int x = 0;
    private int y = 150;
    
    // Kecepatan pergerakan (piksel per frame)
    private int kecepatanX = 3;
    private int kecepa=tanY = 2;
    
    // Ukuran lingkaran
    private final int DIAMETER = 50;

    public PergerakanLingkaran() {
        // Timer memicu aksi setiap 16 milidetik (sekitar 60 FPS)
        Timer timer = new Timer(16, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // Mengaktifkan antialiasing agar lingkaran terlihat halus
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Menggambar lingkaran merah
        g2d.setColor(Color.RED);
        g2d.fillOval(x, y, DIAMETER, DIAMETER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Update posisi lingkaran
        x += kecepatanX;
        y += kecepatanY;

        // Logika memantul saat menabrak dinding kiri atau kanan
        if (x < 0 || x + DIAMETER > getWidth()) {
            kecepatanX = -kecepatanX; // Balik arah X
        }

        // Logika memantul saat menabrak dinding atas atau bawah
        if (y < 0 || y + DIAMETER > getHeight()) {
            kecepatanY = -kecepatanY; // Balik arah Y
        }

        // Gambar ulang layar
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animasi Lingkaran Bergerak");
        PergerakanLingkaran panel = new PergerakanLingkaran();
        
        frame.add(panel);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Membuka jendela di tengah layar
        frame.setVisible(true);
    }
}