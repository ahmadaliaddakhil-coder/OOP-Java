import java.awt.Color;

public class Lingkaran {
    public String nama;
    public double x;
    public double y;
    public double radius;
    public double dx;
    public double dy;
    Color randomColor; 
    
    public Lingkaran(String nama, double x, double y, double radius, double dx, double dy, Color randomColor) {
        this.nama = nama;
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.dx = dx;
        this.dy = dy;
        this.randomColor = randomColor;
    }

    public Lingkaran (String nama, double x, double y, double dx, double dy) {
        this.nama = nama;
        this.x = x;
        this.y = y;
        this.radius = 5; // Default radius
        this.dx = dx; // Default speed in x direction
        this.dy = dy; // Default speed in y direction
    }

    public void move() {
        this.x += this.dx;
        this.y += this.dy;

    }

    public String toString() {
        return "Lingkaran{" +
                "nama='" + nama + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                ", dx=" + dx +
                ", dy=" + dy +
                '}';
    }

    public void checkBoundary(){
        if (x - radius < 0 || x + radius > 600) {
            dx = -dx; // Reverse direction in x-axis
        }
        if (y - radius < 0 || y + radius > 600) {
            dy = -dy; // Reverse direction in y-axis
        }
    }

    public boolean isBersinggungan(Lingkaran lingkaran2) {
        double dx = this.x - lingkaran2.x;
        double dy = this.y - lingkaran2.y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance < (this.radius + lingkaran2.radius);
    }
}

