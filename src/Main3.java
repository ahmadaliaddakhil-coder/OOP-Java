import java.awt.Color;
import java.util.Random;

public class Main {
    public static boolean isInQuadrant1(double x, double y, double radius) {
        return (x - radius >= 0 && y - radius >= 0);
    }
    public static void main(String[] args) {
        
        Lingkaran lingkaranArr[] = new Lingkaran[5];
        
        for (int i = 0; i < 5; i++) {
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
        for (Lingkaran lingkaran : lingkaranArr) {
            System.out.println(lingkaran);
        }
    }
}
